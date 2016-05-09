angular.module('App.services', []).factory('MateriaPrima', function($resource) {
	return $resource('http://localhost:3000/materiaprima?:identificador', {
		identificador : '@nome'}, // Precisa ser igual ao primeiro nome de onde veio.
		{ 
			update : {
				method : 'PUT'
			},
			get : {
				method : 'GET',
				isArray : true
			}, // Está retornando 1 array com 1 objeto, por isso coloquei o último método.
		});
});