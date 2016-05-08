var app = angular.module('GestaoFitnessApp',
    [
        'ngMaterial',
        'ngRoute',
        'ngMessages',
        'ngAnimate',
        'md.data.table'
    ]
);

app.config(function($mdThemingProvider) {
    $mdThemingProvider.theme('default')
        .primaryPalette('purple')
        .accentPalette('teal');
});

app.config(function($routeProvider) {

    $routeProvider

    .otherwise({
        redirectTo  : '/pagina-inicial'
    })

    .when('/pagina-inicial', {
        templateUrl : 'pages/pagina-inicial.html',
        controller  : 'mainController',
        title       : 'Página Inicial'
    })

    .when('/fornecedores', {
        templateUrl : 'pages/fornecedores.html',
        controller  : 'fornecedorController',
        title       : 'Fornecedoress'
    })

    .when('/fornecedores/novo', {
        templateUrl : 'pages/fornecedores.form.html',
        controller  : 'formFornecedorController',
        title       : 'Cadastrar Novo Fornecedor'
    })

    .when('/fornecedores/editar', {
        templateUrl : 'pages/fornecedores.form.html',
        controller  : 'formFornecedorController',
        title       : 'Editar Fornecedor'
    })

    .when('/materia-prima', {
        templateUrl : 'pages/materia-prima.html',
        controller  : 'materia-primaController',
        title       : 'Matéria-prima'
    });

});

app.run(['$rootScope', function($rootScope) {
    $rootScope.$on('$routeChangeSuccess', function (event, current, previous) {
        $rootScope.title = current.$$route.title;
    });
}]);

app.controller('mainController', ['$scope', '$mdSidenav', '$mdDialog', function($scope, $mdSidenav, $mdDialog) {

    $scope.toggleSidenav = function(menuId) {
        $mdSidenav(menuId).toggle();
    };
  
    $scope.navegacao = [
        // {
        //     link : '#pagina-inicial',
        //     title: 'Página Inicial',
        //     icon: 'action:ic_home_24px'
        // },
        {
            link : '#fornecedores',
            title: 'Fornecedores',
            icon: 'maps:ic_local_shipping_24px'
        },
        {
            link : '#materia-prima',
            title: 'Matéria-prima',
            icon: 'maps:ic_layers_24px'
        }
    ];
  
}]);

app.config(function($mdIconProvider) {
    $mdIconProvider
      .iconSet('action', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-action.svg', 24)
      .iconSet('alert', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-alert.svg', 24)
      .iconSet('av', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-av.svg', 24)
      .iconSet('communication', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-communication.svg', 24)
      .iconSet('content', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-content.svg', 24)
      .iconSet('device', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-device.svg', 24)
      .iconSet('editor', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-editor.svg', 24)
      .iconSet('file', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-file.svg', 24)
      .iconSet('hardware', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-hardware.svg', 24)
      .iconSet('image', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-image.svg', 24)
      .iconSet('maps', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-maps.svg', 24)
      .iconSet('navigation', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-navigation.svg', 24)
      .iconSet('notification', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-notification.svg', 24)
      .iconSet('social', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-social.svg', 24)
      .iconSet('toggle', 'https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-toggle.svg', 24)
    
      // Illustrated user icons used in the docs https://material.angularjs.org/latest/#/demo/material.components.gridList
      .iconSet('avatars', 'https://raw.githubusercontent.com/angular/material/master/docs/app/icons/avatar-icons.svg', 24)
      .defaultIconSet('https://raw.githubusercontent.com/google/material-design-icons/master/sprites/svg-sprite/svg-sprite-action.svg', 24);
});