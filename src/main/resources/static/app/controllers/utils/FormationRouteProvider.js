angular.module("GestionFormation")
        .config(['$routeProvider',
    
    function ($routeProvider) 
    {
        $routeProvider
        .when('/formations', 
        {
                    templateUrl: '/app/views/Administrateur/listFormations.html',
                    controller: 'gestionFormationController'
        })
        .when('/formation/:personId', 
        {
                    templateUrl: '/app/views/includes/detailsFormation.html',
                    controller: 'gestionFormationController'
        })
        .otherwise({
                    redirectTo: '/app/views/home.html'
        });
    }
]);