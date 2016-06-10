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

app.factory('ReceitaFactory', function ($resource) {
    return $resource('http://loja.mybluemix.net/api/receita/:sku', {
        sku : '@sku'},
        { 
        listar: {
            url: 'http://loja.mybluemix.net/api/receita',
            method: 'GET',
            isArray: true
        },
        novo: {
            url: 'http://loja.mybluemix.net/api/receita/create',
            method: 'POST'
        },
        editar: {
            url: 'http://loja.mybluemix.net/api/receita/update',
            method: 'POST'
        },
        receita: {
            method: 'GET'
        }
    })
});

app.factory('LotesReceitaFactory', function ($resource) {
    return $resource('http://loja.mybluemix.net/api/receita/lotes/:sku', {
        sku : '@sku'},
        { 
        listar: {
            method: 'GET',
            isArray: true
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