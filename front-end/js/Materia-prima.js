app.controller('materia-primaController', ['$scope', function($scope) {

    $scope.materiasPrimas = [
        {
            "sku":1,
            "nome":"Tecido Florido Verao 2016",
            "tipo":"Tecido",
            "descricao":"Cool stuff guys",
            "unidade":"metro",
            "valorUnidade":10.0,
            "dataEntrada":"2016-10-15",
            "dataSaida":"2016-10-29"
        },
        {
            "sku":2,
            "nome":"Tecido Rosa Choque",
            "tipo":"Tecido",
            "descricao":"Pantera Cor de Rosa",
            "unidade":"metro",
            "valorUnidade":20.0,
            "dataEntrada":"2016-10-09",
            "dataSaida":"2016-11-03"
        }
    ];

}]);