angular.module('App', ['ui.router', 'ngResource', 'App.controllers', 'App.services']);

//#######################
angular.module('App').config(function($stateProvider, $urlRouterProvider) {
  //$urlRouterProvider.otherwise("\materiasprimas");
  $stateProvider.state('ListarMateriasPrimas', { // estado para mostrar todas matérias primas
    url: '/materiasprimas',
    //template: "<p>HELLO!</p>"
    templateUrl: 'partials/materiaprima.html',
    controller: 'MateriaPrimaListController'
  }).state('verMateriaPrima', { //estado para mostrar uma matéria prima
    url: '/materiasprimas/:nome/view',
    templateUrl: 'partials/materiaprima-view.html',
    controller: 'MateriaPrimaViewController'
  }).state('novaMateriaPrima', { //estado para adicionar uma matéria prima
    url: '/materiasprimas/new',
    templateUrl: 'partials/materiaprima-add.html',
    controller: 'MateriaPrimaCreateController'
  }).state('editarMateriaPrima', { //estado para editar uma matéria prima
    url: '/materiasprimas/:nome/edit',
    templateUrl: 'partials/materiaprima-edit.html',
    controller: 'MateriaPrimaEditController'
  });
});
//########################