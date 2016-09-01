var myApp = angular.module("GestionFormation",[]);
myApp.controller("listPaginationController", function($http, $scope)
{
    $scope.test="myTest";
    $scope.menu = ["Inscrire","Listes","Utilisateurs","Logout"];
    $scope.selectedMenu = null;
    
    $scope.select = function(m)
    {
        $scope.selectedMenu = m;
        console.log("click : "+$scope.selectedMenu);
    };
    
});