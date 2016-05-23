app.factory('MateriaPrimaFactory', function ($resource) {
    return $resource('http://loja.mybluemix.net/api/materiaprima:sku', {
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