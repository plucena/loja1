app.factory('FornecedorFactory', function ($resource) {
    return $resource('http://loja.mybluemix.net/api/fornecedor/:cnpj', {
        cnpj : '@cnpj'},
        { 
        listar: {
            url: 'http://loja.mybluemix.net/api/fornecedor',
            method: 'GET',
            isArray: true
        },
        novo: {
            url: 'http://loja.mybluemix.net/api/fornecedor/create',
            method: 'POST'
        },
        fornecedor: {
            method: 'GET'
        },
        editar: {
            method: 'POST'
        }
    })
});