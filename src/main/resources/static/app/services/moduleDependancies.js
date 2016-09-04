angular
    .module('GestionFormation', ['ngRoute','ngCookies','base64'])
    .config(function($routeProvider, $httpProvider) 
{

    $routeProvider.when('/', 
    {
      templateUrl : '/app/views/index.html',
      controller : 'home',
      controllerAs: 'controller'
    })
    .when('/login2', {
      templateUrl : '/app/views/login2.html',
      controller : 'navigation',
      controllerAs: 'controller'
    }).otherwise('/');

    $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

  });
