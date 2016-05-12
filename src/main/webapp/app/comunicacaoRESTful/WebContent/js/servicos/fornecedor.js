angular.module('ModuloFornecedor.services', []).factory('Fornecedor', function($resource) {
	return $resource('http://loja.mybluemix.net/api/fornecedor/:cnpj', {
		cnpj : '@cnpj'}, // Precisa ser igual a variável de onde veio.
		{ 
			update : {
				method : 'PUT'
			}
		});
});