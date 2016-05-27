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

app.controller('formLoteController', ['$scope', '$rootScope', '$routeParams', '$location', '$http', '$mdDialog', '$mdToast', '$document', 'FornecedorFactory', 'MateriaPrimaFactory', 'LoteFactory', function($scope, $rootScope, $routeParams, $location, $http, $mdDialog, $mdToast, $document, FornecedorFactory, MateriaPrimaFactory, LoteFactory) {

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

    $scope.setselectedIndexLotes = function (index) {
        $rootScope.selectedIndexLotes = index;
    }

    $scope.buttonAction = 'Cadastrar';
    $scope.lote = {};
    $scope.lote.status = 'ENCOMENDADO';
    $scope.edicao = false;

    $scope.isLoadingFornecedores = true;
    $scope.fornecedores = [];
    $scope.fornecedores = FornecedorFactory.listar(
        {},
        function success() {
            console.log('Sucesso ao buscar fornecedores!');
            $scope.isLoadingFornecedores = false;
        },
        function err() {
            console.log('Erro ao buscar fornecedores!');
        });

    $scope.isLoadingMateriasPrimas = true;
    $scope.materiasPrimas = [];
    $scope.materiasPrimas = MateriaPrimaFactory.listar(
        {},
        function success() {
            console.log('Sucesso ao buscar matérias-primas!');
            $scope.isLoadingMateriasPrimas = false;
        },
        function err() {
            console.log('Erro ao buscar matérias-primas!');
        });

    if($routeParams.sku) {
        $scope.isLoading = true;
        $scope.lote = LoteFactory.lote(
            {sku: $routeParams.sku},
            function success() {

                $scope.edicao = true;
                $scope.buttonAction = 'Salvar';
                
                switch($scope.lote.status)
                {
                    case "ENCOMENDADO":
                        $scope.encomendadoDisabled = false;
                        $scope.emEstoqueDisabled = false;
                        $scope.emProducaoDisabled = true;
                        $scope.finalizadoDisabled = true;
                        $scope.canceladoDisabled = false;
                        break;

                    case "EM_ESTOQUE":
                        $scope.encomendadoDisabled = true;
                        $scope.emEstoqueDisabled = false;
                        $scope.emProducaoDisabled = false;
                        $scope.finalizadoDisabled = true;
                        $scope.canceladoDisabled = true;
                        break;

                    case "EM_PRODUCAO":
                        $scope.encomendadoDisabled = true;
                        $scope.emEstoqueDisabled = true;
                        $scope.emProducaoDisabled = false;
                        $scope.finalizadoDisabled = false;
                        $scope.canceladoDisabled = true;
                        break;

                    case "FINALIZADO":
                        $scope.encomendadoDisabled = true;
                        $scope.emEstoqueDisabled = true;
                        $scope.emProducaoDisabled = true;
                        $scope.finalizadoDisabled = true;
                        $scope.canceladoDisabled = true;
                        break;

                    case "CANCELADO":
                        $scope.encomendadoDisabled = true;
                        $scope.emEstoqueDisabled = true;
                        $scope.emProducaoDisabled = true;
                        $scope.finalizadoDisabled = true;
                        $scope.canceladoDisabled = true;
                        break;
                }

                $scope.isLoading = false;

            },

            function err() {
                console.log('Erro ao buscar lote!');
            });
    }

    $scope.salvarLote = function () {

        $scope.lote.cnpj = $scope.lote.fornecedor.cnpj;
        $scope.lote.materiaprima_sku = $scope.lote.materiaPrima.sku;

        switch ($scope.lote.status)
        {
            case "ENCOMENDADO":
                $scope.setselectedIndexLotes(0);
                break;

            case "EM_ESTOQUE":
                $scope.setselectedIndexLotes(1);
                break;

            case "EM_PRODUCAO":
                $scope.setselectedIndexLotes(2);
                break;

            case "FINALIZADO":
                $scope.setselectedIndexLotes(3);
                break;

            case "CANCELADO":
                $scope.setselectedIndexLotes(4);
                break;
        }

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
                    console.log($scope.lote);
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