angular.module('GestionFormation')
.controller('gestonSessionsFormation',['$rootScope', '$http', '$location','$scope',function($rootScope, $http, $location,$scope)
{
    $scope.test = "myTest";
    $scope.formation = 
    {
        nomFormation : "",
        Description: "",
        dateFormation: "",
        responsableFormation: 
        {
            idUtilisateur: null
        },
        collaborateurs : null,
       
        sessionFormations : null
    };
    
    $scope.session = 
            {
                dateSession : null,
                formation: null,
                formateur: null,
                documents: null,
                absences: null
            };
    
    $scope.arrayLength = 0;
    $scope.arrayNum = [];
    $scope.arrayContent = [];
    $scope.listFormateurs = [];
    
    $scope.addSection = function()
    {
        $scope.arrayLength++;
        
        var num = $scope.arrayLength;
        if(num<=9)
            num = '0'+num;
        
        $scope.arrayNum.push(num);
        $scope.arrayContent.push({dateSession : null,formateur:{idUtilisateur: null},documents: null});
        //$scope.docs = [];
        console.log($scope.arrayContent);
    };
    $scope.deleteSection = function()
    {
        $scope.arrayLength--;
        
        
        $scope.arrayNum.pop();
        $scope.arrayContent.pop();
        console.log($scope.arrayContent);
    };
    
    $scope.Valider = function()
    {
        //console.log("valider"+$scope.arrayContent);
        //$scope.preSubmit($scope.arrayContent);
        $scope.testSubmit($scope.arrayContent);
    };
    
    $scope.getUtilisateurs = function()
    {
         $http.get("/utilisateurs/list")
                .success(function(data)
                {
                    $scope.listFormateurs = data;
                    
                });
    };
    $scope.getUtilisateurs();
    
    $scope.testSubmit = function(data)
    {
        for(var i=0; i<data.length;i++)
        {
            console.log("date: "+data[i].dateSession+" - Formateur: "+data[i].formateur.idUtilisateur+" - docs: "+data[i].documents);
        }
        
    };
    
    $scope.arrayDocuments = function(p)
    {
        var result = [];
        for (i = 0; i < p.length; i++) 
        { 
            result[i] = {nomDocument:p[i]};
        }
        return result;
    };
    
    $scope.preSubmit = function(p)
    {
        var result = [];
        for (i = 0; i < p.length; i++) 
        { 
            $scope.arrayContent[i].documents = $scope.arrayDocuments($scope.arrayContent[i].documents);
        }
        return result;
    };
}]);