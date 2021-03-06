app.controller('produtoController', ['$scope', '$rootScope', '$location', '$http', '$mdDialog', '$mdToast', 'ProdutoFactory', function($scope, $rootScope, $location, $http, $mdDialog, $mdToast, ProdutoFactory) {

    $scope.isLoading = true;

    if (!$rootScope.selectedIndexProduto) {
        $rootScope.selectedIndexProduto = 0;
    }

    $scope.setselectedIndexProduto = function (index) {
        $rootScope.selectedIndexProduto = index;
    }

    $scope.produtos = [];
    $scope.produtos = ProdutoFactory.listar(
        {},
        function success() {
            $scope.isLoading = false;
        },
        function err() {
            console.log('Erro ao buscar produtos!');
        });

    $scope.editarProduto = function (produtoSKU) {
        $location.path('/produtos/editar/' + produtoSKU);
    };

    $scope.novoProduto = function () {
        $location.path('/produtos/novo');
    };

}]);

app.controller('formProdutoController', ['$scope', '$routeParams', '$location', '$http', '$mdDialog', '$mdToast', '$document', 'ProdutoFactory', 'ReceitaFactory', 'LotesReceitaFactory', function($scope, $routeParams, $location, $http, $mdDialog, $mdToast, $document, ProdutoFactory, ReceitaFactory, LotesReceitaFactory) {

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

    $scope.produto = {};
    $scope.produto.status = "EM_PRODUCAO";

    $scope.edicao = false;

    $scope.isLoadingReceitas = true;
    $scope.receitas = [];
    $scope.receitas = ReceitaFactory.listar(
        {},
        function success() {
            console.log('Sucesso ao buscar receitas!');
            $scope.isLoadingReceitas = false;
        },
        function err() {
            console.log('Erro ao buscar receitas!');
        });

    if($routeParams.sku) {
        $scope.isLoading = true;
        $scope.produto = ProdutoFactory.produto(
            {sku: $routeParams.sku},
            function success() {

                $scope.edicao = true;
                $scope.buttonAction = 'Salvar';

                // $scoppe.produto.lotes = $scope.receitas.receitasCompativeis;

                switch($scope.produto.status)
                {
                    case "EM_PRODUCAO":
                        $scope.emEstoqueDisabled = false;
                        $scope.emProducaoDisabled = false;
                        break;

                    case "EM_ESTOQUE":
                        $scope.emEstoqueDisabled = true;
                        $scope.emProducaoDisabled = true;
                        break;
                }

                $scope.isLoading = false;

            },
            function err() {
                console.log('Erro ao buscar produto!');
            });
    }

    $scope.listarLotes = function () {
        $scope.produto.lotes = [];
        $scope.produto.lotes = LotesReceitaFactory.listar(
            $scope.produto.receita,
            function success() {
                $scope.isLoading = false;

                if ($scope.receitas.length > 0) {

                    var lookup = {};
                    for (var i = 0; i < $scope.receitas.length; i++) {
                        lookup[$scope.receitas[i].sku] = $scope.receitas[i];
                    }

                    $scope.quantidadeProduzida = Math.floor($scope.produto.lotes[0].quantidade/lookup[$scope.produto.receita.sku].receita[0].quantidade);
                    
                    for (var i = 1; i < $scope.produto.lotes.length; i++) {
                        if(Math.floor($scope.produto.lotes[i].quantidade/lookup[$scope.produto.receita.sku].receita[i].quantidade) < $scope.quantidadeProduzida)
                        {
                            $scope.quantidadeProduzida = Math.floor($scope.produto.lotes[i].quantidade/lookup[$scope.produto.receita.sku].receita[i].quantidade);
                        }

                    }

                }
            },
            function err() {
                console.log('Erro ao buscar lotes!');
            });
    };

    $scope.salvarProduto = function () {

        if($scope.edicao) {
            ProdutoFactory.editar(
                $scope.produto,
                function success() {
                    $scope.showToast('Produto editado com sucesso!');
                    $location.path('/produtos');
                },
                function err() {
                    console.log('Erro ao editar produto!');
                });
        } else {
            ProdutoFactory.novo(
                $scope.produto,
                function success() {
                    $scope.showToast('Produto cadastrado com sucesso!');
                    $location.path('/produtos');
                },
                function err() {
                    console.log('Erro ao cadastrar produto!');
                });
        }
    }

}]);