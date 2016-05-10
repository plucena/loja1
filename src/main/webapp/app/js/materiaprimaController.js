app.controller('materiaprimaController', ['$scope', '$location', '$http', '$mdDialog', function($scope, $location, $http, $mdDialog) {

    $scope.isLoading = true;

    $http.get('http://loja.mybluemix.net/api/materiaprima')
        .success(function(data, status, headers, config) {
            $scope.isLoading = false;
            $scope.materiasPrimas = data;
        })
        .error(function(data, status, headers, config) {
            //log do erro
        }
    );

    $scope.fornecedores = [{"cnpj":"2356325656113","nome":"odebrecht tecidos","email":"odebrecht@dezporcentoamais.com","telefone":"11 4444-2211","prazoEntregaDias":100,"endereco_Pais":"Brasil","endereco_Estado":"DF","endereco_Cidade":"Brasilia","endereco_Logradouro":"Rua Doze, 50 - Sala 3","endereco_CEP":"33333-721"},{"cnpj":"33333333332222","nome":"china tecidos","email":"?@?.com","telefone":"000099932","prazoEntregaDias":100,"endereco_Pais":"China","endereco_Estado":"-","endereco_Cidade":"Beijing","endereco_Logradouro":"???????? 42","endereco_CEP":"08378472"},{"cnpj":"3427526253462","nome":"ACME","email":"acme@acme.com","telefone":"11 3232-2211","prazoEntregaDias":10,"endereco_Pais":"Brasil","endereco_Estado":"SP","endereco_Cidade":"Osasco","endereco_Logradouro":"Rua Pedro Alvares, 500 - Sala 4","endereco_CEP":"13272-721"}];

    $scope.materiaPrima = {"sku":1,"nome":"Tecido Florido Verao 2016","tipo":"Tecido","descricao":"Cool stuff guys","unidade":"metro","valorUnidade":10.0,"dataEntrada":"2016-10-15","dataSaida":"2016-10-29"};

    $scope.ficha = function(materiaPrima) {
        $location.path('materias-primas/ficha/' + materiaPrima.sku);
    };

    $scope.unidades = [
        {
            unidade: 'Kg'
        },
        {
            unidade: 'Metro'
        }
    ];

    $scope.tipos = [
        {
            tipo: 'Tecido'
        },
        {
            tipo: 'Botão'
        }
    ];

    $scope.showConfirm = function(ev) {
        var confirm = $mdDialog.confirm()
            .title('Excluir Matéria-prima')
            .textContent('Atenção! Essa ação não pode ser desfeita, deseja continuar?')
            .ariaLabel('Excluir Matéria-prima')
            .targetEvent(ev)
            .ok('Excluir')
            .cancel('Cancelar');
        
        $mdDialog.show(confirm).then(function() {
            //
        }, function() {
            //
        });
    };

    // $scope.materiasPrimas = [
    //     {
    //         "sku":1,
    //         "nome":"Tecido Florido Verao 2016",
    //         "tipo":"Tecido",
    //         "descricao":"Cool stuff guys",
    //         "unidade":"metro",
    //         "valorUnidade":10.0,
    //         "dataEntrada":"2016-10-15",
    //         "dataSaida":"2016-10-29"
    //     },
    //     {
    //         "sku":2,
    //         "nome":"Tecido Rosa Choque",
    //         "tipo":"Tecido",
    //         "descricao":"Pantera Cor de Rosa",
    //         "unidade":"metro",
    //         "valorUnidade":20.0,
    //         "dataEntrada":"2016-10-09",
    //         "dataSaida":"2016-11-03"
    //     }
    // ];

}]);