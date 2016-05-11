angular.module('App.services', []).factory('Fornecedor', function($resource) {
	return $resource('http://loja.mybluemix.net/api/fornecedor/:id', {
		id : '@id'}, // Precisa ser igual a variável de onde veio.
		{ 
			update : {
				method : 'PUT'
			}
		});
});