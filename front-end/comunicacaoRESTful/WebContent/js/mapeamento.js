angular.module('App', ['ui.router', 'ngResource', 'App.controllers', 'App.services']);

//#######################
angular.module('App').config(function($stateProvider, $urlRouterProvider) {
  //$urlRouterProvider.otherwise("\materiasprimas");
  $stateProvider.state('ListarMateriasPrimas', { // estado para mostrar todas matérias primas
    url: '/materiasprimas',
    //template: "<p>HELLO!</p>"
    templateUrl: 'templates/materiaprima/materiaprima.html',
    controller: 'MateriaPrimaListController'
  }).state('verMateriaPrima', { //estado para mostrar uma matéria prima
    url: '/materiasprimas/:sku/view',
    templateUrl: 'templates/materiaprima/materiaprima-view.html',
    controller: 'MateriaPrimaViewController'
  }).state('novaMateriaPrima', { //estado para adicionar uma matéria prima
    url: '/materiasprimas/new',
    templateUrl: 'templates/materiaprima/materiaprima-add.html',
    controller: 'MateriaPrimaCreateController'
  }).state('editarMateriaPrima', { //estado para editar uma matéria prima
    url: '/materiasprimas/:sku/edit',
    templateUrl: 'templates/materiaprima/materiaprima-edit.html',
    controller: 'MateriaPrimaEditController'
  });
});
//########################