angular.module('App.controllers', []).controller('MateriaPrimaListController', function($scope, $state, /*popupService, $window,*/ MateriaPrima) {
  $scope.materiasprimas = MateriaPrima.query(); //Busca todas matérias primas. Issues a GET to URI

  $scope.deletarMateriaPrima = function(materiaprima) { // Deletar matéria. Issues a DELETE to URI
   // if (popupService.showPopup('Quer mesmo deletar?')) {
  materiaprima.$delete(function() {
	  $window.location.href = ''; //redirect to home
  });
    //}
  };
}).controller('MateriaPrimaViewController', function($scope, $stateParams, MateriaPrima) {
  $scope.materiaprima = MateriaPrima.get({sku: $stateParams.sku }); //Get a matéria prima.Issues a GET to URI
}).controller('MateriaPrimaCreateController', function($scope, $state, $stateParams, MateriaPrima) {
  $scope.materiaprima = new MateriaPrima();  //Criar nova instância de Matéria Prima(MP). Properties will be set via ng-model on UI

  $scope.adicionarMateriaPrima = function() { //Criar nova MP. Issues a POST to URI
    $scope.materiaprima.$save(function() {
      $state.go('materiasprimas'); // on success go back to home i.e. materiasprimas state.
    });
  };
}).controller('MateriaPrimaEditController', function($scope, $state, $stateParams, MateriaPrima) {
  $scope.atualizarMateriaPrima = function() { //Atualizar a MP escolhida. Issues a PUT to URI
    $scope.materiaprima.$update(function() {
      $state.go('materiasprimas'); // on success go back to home i.e. MP state.
    });
  };

  $scope.loadMateriaPrima = function() { //Issues a GET request to URI to get a MP to update
    $scope.materiaprima = MateriaPrima.get({sku: $stateParams.sku});
  };

  $scope.loadMateriaPrima(); // Load a MP which can be edited on UI
});