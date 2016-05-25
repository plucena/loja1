app.controller('materiaPrimaController', ['$scope', '$rootScope', '$location', '$http', '$mdDialog', '$mdToast', 'MateriaPrimaFactory', function($scope, $rootScope, $location, $http, $mdDialog, $mdToast, MateriaPrimaFactory) {

    $scope.isLoading = true;

    $scope.materiasPrimas = [];
    $scope.materiasPrimas = MateriaPrimaFactory.listar(
        {},
        function success() {
            $scope.isLoading = false;
        },
        function err() {
            console.log('Erro ao buscar matérias-primas!');
        });

    $scope.editarMateriaPrima = function (materiaPrimaSKU) {
        $location.path('/materias-primas/editar/' + materiaPrimaSKU);
    };

    $scope.novaMateriaPrima = function () {
        $location.path('/materias-primas/nova');
    };

}]);

app.controller('formMateriaPrimaController', ['$scope', '$routeParams', '$location', '$http', '$mdDialog', '$mdToast', '$document', 'MateriaPrimaFactory', function($scope, $routeParams, $location, $http, $mdDialog, $mdToast, $document, MateriaPrimaFactory) {

    $scope.showToast = function(message) {
        $mdToast.show(
            $mdToast.simple()
                .textContent(message)
                .hideDelay(3000)
                // .parent($document[0].querySelector('md-card'))
                .position('top right left')
                .theme("success-toast")
        );
    };

    $scope.buttonAction = 'Cadastrar';
    $scope.edicao = false;

    if($routeParams.sku) {
        $scope.materiaPrima = MateriaPrimaFactory.materiaPrima(
            {sku: $routeParams.sku},
            function success() {

                $scope.edicao = true;
                $scope.buttonAction = 'Salvar';

            },

            function err() {
                console.log('Erro ao buscar matéria-prima!');
            });
    }

    $scope.salvarMateriaPrima = function () {

        if($scope.edicao) {
            MateriaPrimaFactory.editar(
                $scope.materiaPrima,
                function success() {
                    $scope.showToast('Matéria-prima editada com sucesso!');
                    $location.path('/materias-primas');
                },
                function err() {
                    console.log('Erro ao editar matéria-prima!');
                });
        } else {
            MateriaPrimaFactory.novo(
                $scope.materiaPrima,
                function success() {
                    $scope.showToast('Matéria-prima cadastrada com sucesso!');
                    $location.path('/materias-primas');
                },
                function err() {
                    console.log('Erro ao cadastrar matéria-prima!');
                });
        }
    }

}]);