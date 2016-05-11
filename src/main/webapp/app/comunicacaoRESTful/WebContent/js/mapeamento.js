angular.module('App', [ 'ui.router', 'ngResource', 'App.controllers',
		'App.services' ]);

angular.module('App').config(function($stateProvider, $urlRouterProvider) {
	// Fazer o roteamento dos estados. Será "casado" os valores do "ui-sref" com
	// os estados a seguir.

	// ##################Fornecedor##########################
	$stateProvider.state('listarFornecedores', { //estado para mostrar todos os fornecedores
		url : '/fornecedores',
		templateUrl : 'templates/fornecedor/fornecedor.html',
		controller : 'FornecedorListController'
	}).state('verFornecedor', { // estado para mostrar um fornecedor
		url : '/fornecedores/:id/view',
		templateUrl : 'templates/fornecedor/fornecedor-view.html',
		controller : 'FornecedorViewController'
	}).state('novoFornecedor', { // estado para adicionar um um fornecedor
		url : '/fornecedores/new',
		templateUrl : 'templates/fornecedor/fornecedor-add.html',
		controller : 'FornecedorCreateController'
	}).state('editarFornecedor', { // estado para editar um um fornecedor
		url : '/fornecedores/:id/edit',
		templateUrl : 'templates/fornecedor/fornecedor-edit.html',
		controller : 'FornecedorEditController'
	});

	// ##########Matéria Prima#################################
	$stateProvider.state('listarMateriasPrimas', { // estado para mostrar todas
													// matérias primas
		url : '/materiasprimas',
		// template: "<p>HELLO!</p>"
		templateUrl : 'templates/materiaprima/materiaprima.html',
		controller : 'MateriaPrimaListController'
	}).state('verMateriaPrima', { // estado para mostrar uma matéria prima
		url : '/materiasprimas/:sku/view',
		templateUrl : 'templates/materiaprima/materiaprima-view.html',
		controller : 'MateriaPrimaViewController'
	}).state('novaMateriaPrima', { // estado para adicionar uma matéria prima
		url : '/materiasprimas/new',
		templateUrl : 'templates/materiaprima/materiaprima-add.html',
		controller : 'MateriaPrimaCreateController'
	}).state('editarMateriaPrima', { // estado para editar uma matéria prima
		url : '/materiasprimas/:sku/edit',
		templateUrl : 'templates/materiaprima/materiaprima-edit.html',
		controller : 'MateriaPrimaEditController'
	});
	// #####################################################################################
});
