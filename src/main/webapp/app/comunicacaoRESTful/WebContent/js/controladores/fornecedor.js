angular.module('ModuloFornecedor.controllers', []).controller('FornecedorListController', function($scope, $state, Fornecedor) {
  $scope.fornecedores = Fornecedor.query(); //Busca todos funcionários.

  //$scope.inativarFornecedor = function(fornecedor) { // Inativar fornecedor.
	  //Inativar fornecedor, comunicar com o Controlador de Atualização.
	  
  //};
}).controller('FornecedorViewController', function($scope, $stateParams, Fornecedor) {
  $scope.fornecedor = Fornecedor.get({id: $stateParams.id }); //Mostrar as propriedades do fornecedor
}).controller('FornecedorCreateController', function($scope, $state, $stateParams, Fornecedor) { //Adicionar fornecedor
  $scope.fornecedor = new Fornecedor();  //Criar nova instância de Fornecedor. As propriedades serão setadas pelo ng-model do UI.

  $scope.adicionarFornecedor = function() {
    $scope.fornecedor.$save(function() {
      $state.go('fornecedor');
    });
  };
}).controller('FornecedorEditController', function($scope, $state, $stateParams, Fornecedor) { //Editar fornecedor
  $scope.atualizarFornecedor = function() {
    $scope.fornecedor.$update(function() {
      $state.go('fornecedor');
    });
  };

  $scope.carregarFornecedor = function() { //Carregar fornecedor
    $scope.fornecedor = Fornecedor.get({id: $stateParams.id});
  };

  $scope.carregarFornecedor();
});