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
        editar: {
            url: 'http://loja.mybluemix.net/api/fornecedor/update',
            method: 'POST'
        },
        fornecedor: {
            method: 'GET'
        }
    })
});

app.factory('MateriaPrimaFactory', function ($resource) {
    return $resource('http://loja.mybluemix.net/api/materiaprima/:sku', {
        sku : '@sku'},
        { 
        listar: {
            url: 'http://loja.mybluemix.net/api/materiaprima',
            method: 'GET',
            isArray: true
        },
        novo: {
            url: 'http://loja.mybluemix.net/api/materiaprima/create',
            method: 'POST'
        },
        editar: {
            url: 'http://loja.mybluemix.net/api/materiaprima/update',
            method: 'POST'
        },
        materiaPrima: {
            method: 'GET'
        }
    })
});

app.factory('LoteFactory', function ($resource) {
    return $resource('http://loja.mybluemix.net/api/lote/:sku', {
        sku : '@sku'},
        { 
        listar: {
            url: 'http://loja.mybluemix.net/api/lote',
            method: 'GET',
            isArray: true
        },
        novo: {
            url: 'http://loja.mybluemix.net/api/lote/create',
            method: 'POST'
        },
        editar: {
            url: 'http://loja.mybluemix.net/api/lote/update',
            method: 'POST'
        },
        lote: {
            method: 'GET'
        }
    })
});

app.factory('ProdutoFactory', function ($resource) {
    return $resource('http://loja.mybluemix.net/api/produto/:sku', {
        sku : '@sku'},
        { 
        listar: {
            url: 'http://loja.mybluemix.net/api/produto',
            method: 'GET',
            isArray: true
        },
        novo: {
            url: 'http://loja.mybluemix.net/api/produto/create',
            method: 'POST'
        },
        editar: {
            url: 'http://loja.mybluemix.net/api/produto/update',
            method: 'POST'
        },
        produto: {
            method: 'GET'
        }
    })
});

app.factory('EstoqueFactory', function ($resource) {
    return $resource('http://loja.mybluemix.net/api/estoque/:sku', {
        sku : '@sku'},
        { 
        listar: {
            url: 'http://loja.mybluemix.net/api/estoque',
            method: 'GET',
            isArray: true
        },
        novo: {
            url: 'http://loja.mybluemix.net/api/estoque/create',
            method: 'POST'
        },
        editar: {
            url: 'http://loja.mybluemix.net/api/estoque/update',
            method: 'POST'
        },
        estoque: {
            method: 'GET'
        }
    })
});