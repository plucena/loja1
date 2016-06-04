app.controller('estoqueController', ['$scope', '$rootScope', '$location', '$http', '$mdDialog', '$mdToast', 'EstoqueFactory', function($scope, $rootScope, $location, $http, $mdDialog, $mdToast, EstoqueFactory) {

    $scope.isLoading = true;

    if (!$rootScope.selectedIndexEstoque) {
        $rootScope.selectedIndexEstoque = 0;
    }

    $scope.setselectedIndexEstoque = function (index) {
        $rootScope.selectedIndexEstoque = index;
    }

    $scope.estoques = [];
    $scope.estoques = EstoqueFactory.listar(
        {},
        function success() {
            $scope.isLoading = false;
        },
        function err() {
            console.log('Erro ao buscar estoques!');
        });

    $scope.editarEstoque = function (estoqueSKU) {
        $location.path('/estoque/editar/' + estoqueSKU);
    };

    $scope.novoEstoque = function () {
        $location.path('/estoque/novo');
    };

}]);

app.controller('formEstoqueController', ['$scope', '$routeParams', '$location', '$http', '$mdDialog', '$mdToast', '$document', 'EstoqueFactory', function($scope, $routeParams, $location, $http, $mdDialog, $mdToast, $document, EstoqueFactory) {

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
        $scope.isLoading = true;
        $scope.fornecedor = EstoqueFactory.fornecedor(
            {sku: $routeParams.sku},
            function success() {

                $scope.edicao = true;
                $scope.buttonAction = 'Salvar';
                $scope.isLoading = false;

            },
            function err() {
                console.log('Erro ao buscar estoque!');
            });
    }


    $scope.salvarEstoque = function () {

        if($scope.edicao) {
            EstoqueFactory.editar(
                $scope.estoque,
                function success() {
                    $scope.showToast('Estoque editado com sucesso!');
                    $location.path('/estoque');
                },
                function err() {
                    console.log('Erro ao editar estoque!');
                });
        } else {
            EstoqueFactory.novo(
                $scope.estoque,
                function success() {
                    $scope.showToast('Estoque cadastrado com sucesso!');
                    $location.path('/estoque');
                },
                function err() {
                    console.log('Erro ao cadastrar estoque!');
                });
        }
    }

}]);