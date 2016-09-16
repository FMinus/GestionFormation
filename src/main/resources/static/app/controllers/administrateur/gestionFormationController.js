var myApp = angular.module("GestionFormation");
myApp.controller("gestionFormationController",['$http','$scope',function($http, $scope)
{
    $scope.test = "mytest";
    $scope.errors = null;
    $scope.exception = {message:null};
    $scope.mode={value:"form"};
    
    $scope.formation = 
    {
        nomFormation : "",
        description: "",
        dateFormation: "",
        responsableFormation: 
        {
            responsable:{idUtilisateur: null}
        },
        collaborateurs : null,
       
        sessionFormations : null
    };
    
    //données a fournir au formulaire de la BD
    //$scope.optionsUtilisateurs = [];
    
    //choix fait
    $scope.choixFormateurs = null;
    
    
    
    $scope.testFunc= function()
    {
        
    };
    
    $scope.getUtilisateurs = function()
    {
         $http.get("/utilisateurs/list")
                .success(function(data)
                {
                    $scope.optionsUtilisateurs = data;
                    
                });
    };
    
    $scope.valider = function()
    {
       $scope.formation.collaborateurs = $scope.arrayIdUsers($scope.formation.collaborateurs);
       
        
        $http
        ({
            method : 'post',
            url : "/formations/creer",
            data : $scope.formation,
            headers : {'Content-Type' : 'application/json'}
            
        });

        console.log($scope.formation);
    };
    
    $scope.arrayIdUsers = function(p)
    {
        var result = [];
        for (i = 0; i < p.length; i++) 
        { 
            result[i] = {collaborateur:{idUtilisateur:parseInt(p[i])}};
        }
        return result;
    };
    
    $scope.getUtilisateurs();
    
    
    //List Formations
    $scope.pageFormations = [];
    $scope.pageCourante = 0;
    $scope.size = 4;
    $scope.pages = [];
    
    $scope.listFormations = function()
    {
        
        $http.get("/formations/pageFormations?page="+$scope.pageCourante+"&size="+$scope.size)
                .success(function(data)
                {
                    $scope.pageFormations = data;
                    $scope.pages = new Array(data.totalPages);
                });
    };
    
     $scope.goToPage = function(p)
    {
        $scope.pageFormations = p;
        $scope.listUtilisateurs();
    };
    
    $scope.listFormations();
    
    $scope.test = function(i)
    {
        console.log(i);
    };
}]);