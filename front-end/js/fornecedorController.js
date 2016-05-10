app.controller('fornecedorController', ['$scope', '$location', '$http', '$mdDialog', function($scope, $location, $http, $mdDialog) {

    $scope.isLoading = true;

    $http.get('http://loja.mybluemix.net/api/fornecedor')
        .success(function(data, status, headers, config) {
            $scope.isLoading = false;
            $scope.fornecedores = data;
        })
        .error(function(data, status, headers, config) {
            //log do erro
        }
    );

    $scope.fornecedor = {"cnpj":"2356325656113","nome":"odebrecht tecidos","email":"odebrecht@dezporcentoamais.com","telefone":"11 4444-2211","prazoEntregaDias":100,"endereco_Pais":"Brasil","endereco_Estado":"DF","endereco_Cidade":"Brasilia","endereco_Logradouro":"Rua Doze, 50 - Sala 3","endereco_CEP":"33333-721"}

    $scope.ficha = function(fornecedor) {
        $location.path('fornecedores/ficha/' + fornecedor.cnpj);
    };

    // $scope.fornecedores = [
    //     {
    //         nome: 'Fornecedor 01',
    //         telefone: '(00) 0000-0000',
    //         endereco: 'Cidade Universitária, Distrito de Barão Geraldo, 13083-970 - Campinas - SP'
    //     },
    //     {
    //         nome: 'Fornecedor 01',
    //         telefone: '(00) 0000-0000',
    //         endereco: 'Cidade Universitária, Distrito de Barão Geraldo, 13083-970 - Campinas - SP'
    //     },
    // ];

    $scope.fornecedor = {
        nome: '',
        CNPJ: '',
        telefone: '',
        endereco: ''
    };

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

    $scope.showConfirm = function(ev) {
        var confirm = $mdDialog.confirm()
            .title('Excluir Fornecedor')
            .textContent('Atenção! Essa ação não pode ser desfeita, deseja continuar?')
            .ariaLabel('Excluir Fornecedor')
            .targetEvent(ev)
            .ok('Excluir')
            .cancel('Cancelar');
        
        $mdDialog.show(confirm).then(function() {
            //
        }, function() {
            //
        });
    };

}]);