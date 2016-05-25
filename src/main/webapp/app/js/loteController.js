app.controller('loteController', ['$scope', '$rootScope', '$location', '$http', '$mdDialog', '$mdToast', 'FornecedorFactory', 'MateriaPrimaFactory', 'LoteFactory',  function($scope, $rootScope, $location, $http, $mdDialog, $mdToast, FornecedorFactory, MateriaPrimaFactory, LoteFactory) {

    $scope.isLoading = true;

    if (!$rootScope.selectedIndexLotes) {
        $rootScope.selectedIndexLotes = 0;
    }

    $scope.setselectedIndexLotes = function (index) {
        $rootScope.selectedIndexLotes = index;
    }

    $scope.lotes = [];
    $scope.lotes = LoteFactory.listar(
        {},
        function success() {
            $scope.isLoading = false;
        },
        function err() {
            console.log('Erro ao buscar lotes!');
        });

    $scope.editarLote = function (loteSKU) {
        $location.path('/lotes/editar/' + loteSKU);
    };

    $scope.novoLote = function () {
        $location.path('/lotes/novo');
    };

}]);

app.controller('formLoteController', ['$scope', '$routeParams', '$location', '$http', '$mdDialog', '$mdToast', '$document', 'FornecedorFactory', 'MateriaPrimaFactory', 'LoteFactory', function($scope, $routeParams, $location, $http, $mdDialog, $mdToast, $document, FornecedorFactory, MateriaPrimaFactory, LoteFactory) {

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

    $scope.fornecedores = [];
    $scope.fornecedores = FornecedorFactory.listar(
        {},
        function success() {
            console.log('Sucesso ao buscar fornecedores!');
        },
        function err() {
            console.log('Erro ao buscar fornecedores!');
        });

    $scope.materiasPrimas = [];
    $scope.materiasPrimas = MateriaPrimaFactory.listar(
        {},
        function success() {
            console.log('Sucesso ao buscar matérias-primas!');
        },
        function err() {
            console.log('Erro ao buscar matérias-primas!');
        });

    if($routeParams.sku) {
        $scope.lote = LoteFactory.lote(
            {sku: $routeParams.sku},
            function success() {

                $scope.edicao = true;
                $scope.buttonAction = 'Salvar';

            },

            function err() {
                console.log('Erro ao buscar lote!');
            });
    }

    $scope.salvarLote = function () {

        if($scope.edicao) {
            LoteFactory.editar(
                $scope.lote,
                function success() {
                    $scope.showToast('Lote editado com sucesso!');
                    $location.path('/lotes');
                },
                function err() {
                    console.log('Erro ao editar matéria-prima!');
                });
        } else {
            LoteFactory.novo(
                $scope.lote,
                function success() {
                    $scope.showToast('Lote cadastrado com sucesso!');
                    $location.path('/lotes');
                },
                function err() {
                    console.log('Erro ao cadastrar lote!');
                });
        }
    }

    $scope.unidades = [
        {
            sigla:"Kg",
            nome:"Quilo"
        },
        {
            sigla:"m",
            nome:"Metro"
        },
        {
            sigla:"Un",
            nome:"Unidade"
        }
    ];

}]);