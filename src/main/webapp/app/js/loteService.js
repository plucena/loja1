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