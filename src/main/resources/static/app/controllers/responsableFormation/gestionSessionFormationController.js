angular.module('GestionFormation')
        .controller('gestonSessionsFormation',['$http','$scope','fileUpload','$rootScope','properties',function($http,$scope,fileUpload,$rootScope,properties)
    {
        $scope.test = "myTest";
        
        $scope.idFormation; 
        
        
        $scope.arrayLength = 0;
        $scope.arrayNum = [];
        $scope.arrayContent = [];
        
        
        //To populate the selects in the form
        $scope.listFormateurs = [];
        $scope.listFormation = [];
        $scope.listDocuments = [];
        
        $rootScope.currentUser;
        
        
        $rootScope.$watch('currentUser',function()
        {
            $scope.user = $rootScope.currentUser;
            $scope.getFormations($scope.user.emailUtilisateur);
        });
        
        
        $scope.addSection = function()
        {
            $scope.arrayLength++;
            
            var num = $scope.arrayLength;
            if(num<=9)
                num = '0'+num;
            
            $scope.arrayNum.push(num);
            $scope.arrayContent.push({formation:{idFormation:null},dateSession : null,formateur:{formateur:{idUtilisateur: null}},documents: null});
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
            
            $scope.testSubmit($scope.arrayContent);
        };
        
        $scope.getUtilisateurs = function()
        {
            $http.get("/utilisateurs/listOnlyUsers")
                    .success(function(data)
            {
                $scope.listFormateurs = data;
                
            });
        };
        
        $scope.getFormations = function(email)
        {
            $http.get("/responsableformations/findByEmail?email="+email)
                    .success(function(data)
            {
                $scope.listFormation = data.formations;
                
            });
        };
        
        
        $scope.getUtilisateurs();
        
        $scope.testSubmit = function(data)
        {
            for(var i=0; i<data.length;i++)
            {
                $scope.uploadFile('myFile'+ i , i);
                console.log("date: "+data[i].dateSession+" - Formateur: "+data[i].formateur.idUtilisateur+" - docs: "+data[i].documents.nomDocument);
            }
            
        };
        
        $scope.arrayDocuments = function(p)
        {
            var result = [];
            for (i = 0; i < p.length; i++) 
            { 
                result[i] = 
                {
                    nomDocument:p[i].name,
                    dateAjout:p[i].lastModified
                };
            }
            return result;
        };
        

        
        $scope.uploadFile = function(filename,index)
        {
            var file = $scope[filename];
            console.log('file is ' + JSON.stringify(file));
            //console.log('file is ' + filename + " - num : "+index);
            //console.dir(file);
            
            if(file == null)
            {
                file = {name:null,lastModified:null};
            }
            
            $scope.arrayContent[index].documents =  
            [{
                        nomDocument:file.name,
                        dateAjout: file.lastModified
            }];
            
            var uploadUrl =  "/sessionFormations/ajout";
            
            //temp properties.urlServer+
            $scope.arrayContent[index].formateur.formateur.idUtilisateur = parseInt($scope.arrayContent[index].formateur.formateur.idUtilisateur);
            $scope.arrayContent[index].formation.idFormation = parseInt($scope.idFormation);
            
            
            
            fileUpload.uploadFileToUrl(file, uploadUrl,$scope.arrayContent[index]);
            //fileUpload.uploadFileToUrl(file, uploadUrl,$scope.session);
            //console.log($scope.arrayContent[index]);
            
        };
        
        
        
        //        $scope.preSubmit = function(p)
//        {
//            var result = [];
//            for (i = 0; i < p.length; i++) 
//            { 
//                $scope.arrayContent[i].documents = $scope.arrayDocuments($scope.arrayContent[i].documents);
//            }
//            return result;
//        };
        
        
        
        
    }]);
