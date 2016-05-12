angular.module('ModuloFornecedor', [ 'ui.router', 'ngResource', 'ModuloFornecedor.controllers',
		'ModuloFornecedor.services' ]);

angular.module('ModuloFornecedor').config(function($stateProvider, $urlRouterProvider) {
	// Fazer o roteamento dos estados. Será "casado" os valores do "ui-sref" com
	// os estados a seguir.

	// ##################Fornecedor##########################
	$stateProvider.state('listarFornecedores', { //estado para mostrar todos os fornecedores
		url : '/fornecedores/',
		//template: "<p>HELLO!</p>",
		templateUrl : 'templates/fornecedor/fornecedor.html',
		controller : 'FornecedorListController'
	}).state('verFornecedor', { // estado para mostrar um fornecedor
		url : '/fornecedores/:cnpj/view',
		templateUrl : 'templates/fornecedor/fornecedor-view.html',
		controller : 'FornecedorViewController'
	}).state('novoFornecedor', { // estado para adicionar um um fornecedor
		url : '/fornecedores/new',
		templateUrl : 'templates/fornecedor/fornecedor-add.html',
		controller : 'FornecedorCreateController'
	}).state('editarFornecedor', { // estado para editar um um fornecedor
		url : '/fornecedores/:cnpj/edit',
		templateUrl : 'templates/fornecedor/fornecedor-edit.html',
		controller : 'FornecedorEditController'
	});
});
