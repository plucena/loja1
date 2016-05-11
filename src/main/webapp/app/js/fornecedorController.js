app.controller('fornecedorController', ['$scope', '$location', '$http', '$mdDialog', '$mdToast', 'FornecedorFactory', function($scope, $location, $http, $mdDialog, $mdToast, FornecedorFactory) {

    $scope.isLoading = true;

    $scope.fornecedores = [];
    $scope.fornecedores = FornecedorFactory.listar(
        {},
        function success() {
            $scope.isLoading = false;
        },
        function err() {
            console.log('Erro ao buscar fornecedores!');
        });

    $scope.editarFornecedor = function (fornecedorCNPJ) {
        $location.path('/fornecedores/editar/' + fornecedorCNPJ);
    };

    $scope.novoFornecedor = function () {
        $location.path('/fornecedores/novo');
    };

    $scope.showToast = function(message) {
        $mdToast.show(
            $mdToast.simple()
                .textContent(message)
                .hideDelay(3000)
        );
    };

}]);

app.controller('novoFornecedorController', ['$scope', '$routeParams', '$location', '$http', '$mdDialog', '$mdToast', 'FornecedorFactory', function($scope, $routeParams, $location, $http, $mdDialog, $mdToast, FornecedorFactory) {

    $scope.showToast = function(message) {
        $mdToast.show(
            $mdToast.simple()
                .textContent(message)
                .hideDelay(3000)
        );
    };

    if($routeParams.cnpj) {
        $scope.fornecedor = FornecedorFactory.fornecedor(
            {cnpj: $routeParams.cnpj},
            function success() {
                $scope.edicao = true;
            },
            function err() {
                console.log('Erro ao buscar fornecedor!');
            });
    }


    $scope.salvarFornecedor = function () {
        if($scope.edicao) {
            FornecedorFactory.editar(
                $scope.fornecedor,
                function success() {
                    $scope.showToast('Fornecedor editado com sucesso!');
                    $location.path('/fornecedores');
                },
                function err() {
                    console.log('Erro ao editar fornecedor!');
                });
        } else {
            FornecedorFactory.novo(
                $scope.fornecedor,
                function success() {
                    $scope.showToast('Fornecedor cadastrado com sucesso!');
                    $location.path('/fornecedores');
                },
                function err() {
                    console.log('Erro ao cadastrar fornecedor!');
                });
        }
    }

    $scope.estados = [
        {
            sigla: 'AC',
            nome: 'Acre'
        },
        {
            sigla: 'AL',
            nome: 'Alagoas'
        },
        {
            sigla: 'AP',
            nome: 'Amapá'
        },
        {
            sigla: 'AM',
            nome: 'Amazonas'
        },
        {
            sigla: 'BA',
            nome: 'Bahia'
        },
        {
            sigla: 'CE',
            nome: 'Ceará'
        },
        {
            sigla: 'DF',
            nome: 'Distrito Federal'
        },
        {
            sigla: 'ES',
            nome: 'Espírito Santo'
        },
        {
            sigla: 'GO',
            nome: 'Goiás'
        },
        {
            sigla: 'MA',
            nome: 'Maranhão'
        },
        {
            sigla: 'MT',
            nome: 'Mato Grosso'
        },
        {
            sigla: 'MS',
            nome: 'Mato Grosso do Sul'
        },
        {
            sigla: 'MG',
            nome: 'Minas Gerais'
        },
        {
            sigla: 'PA',
            nome: 'Pará'
        },
        {
            sigla: 'PB',
            nome: 'Paraíba'
        },
        {
            sigla: 'PR',
            nome: 'Paraná'
        },
        {
            sigla: 'PE',
            nome: 'Pernambuco'
        },
        {
            sigla: 'PI',
            nome: 'Piauí'
        },
        {
            sigla: 'RJ',
            nome: 'Rio de Janeiro'
        },
        {
            sigla: 'RN',
            nome: 'Rio Grande do Norte'
        },
        {
            sigla: 'RS',
            nome: 'Rio Grande do Sul'
        },
        {
            sigla: 'RO',
            nome: 'Rondônia'
        },
        {
            sigla: 'RR',
            nome: 'Roraima'
        },
        {
            sigla: 'SC',
            nome: 'Santa Catarina'
        },
        {
            sigla: 'SP',
            nome: 'São Paulo'
        },
        {
            sigla: 'SE',
            nome: 'Sergipe'
        },
        {
            sigla: 'TO',
            nome: 'Tocantins'
        }
    ];

}]);