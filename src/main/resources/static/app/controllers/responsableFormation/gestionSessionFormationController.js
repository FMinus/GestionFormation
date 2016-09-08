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
        $scope.listDocuments = [];
        
        $scope.addSection = function()
        {
            $scope.arrayLength++;
            
            var num = $scope.arrayLength;
            if(num<=9)
                num = '0'+num;
            
            $scope.arrayNum.push(num);
            $scope.arrayContent.push({dateSession : null,formateur:{idUtilisateur: null},documents: null});
            //$scope.docs = [];
            //console.log($scope.arrayContent);
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
            $http.get("/utilisateurs/listOnlyUsers")
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
        
        
        $scope.setFiles = function(element) 
        {
            $scope.$apply(function(scope) 
            {
                console.log('files:', element.files);
                // Turn the FileList object into an Array
                scope.files = [];
                for (var i = 0; i < element.files.length; i++) 
                {
                    scope.files.push(element.files[i]);
                }
                
            });
        };
        
        $scope.mySetter = function(element,num)
        {
             $scope.$apply(function(scope) 
            {
                console.log('files:', element.files);
                // Turn the FileList object into an Array
                scope.files = [];
                for (var i = 0; i < element.files.length; i++) 
                {
                    scope.files.push(element.files[i]);
                }
                
            });
        };
        
        
        
        
        
        
        
        
        
        
        // GET THE FILE INFORMATION.
        $scope.getFileDetails = function (e) {
            
            $scope.files = [];
            $scope.$apply(function () 
            {
                
                // STORE THE FILE OBJECT IN AN ARRAY.
                for (var i = 0; i < e.files.length; i++) 
                {
                    console.log("called");
                    $scope.files.push(e.files[i]);
                    //$scope.arrayContent[index].documents.push(e.files[i]);
                }
                
            });
        };
        
        // NOW UPLOAD THE FILES.
        $scope.uploadFiles = function () 
        {
            
            //FILL FormData WITH FILE DETAILS.
            var data = new FormData();
            
            for (var i in $scope.files) 
            {
                data.append("uploadedFile", $scope.files[i]);
                console.log($scope.files[i]);
            }
            
            // ADD LISTENERS.
            var objXhr = new XMLHttpRequest();
            objXhr.addEventListener("progress", updateProgress, false);
            objXhr.addEventListener("load", transferComplete, false);
            
            // SEND FILE DETAILS TO THE API.
            //            objXhr.open("POST", "/api/fileupload/");
            //            objXhr.send(data);
        };
        
        // UPDATE PROGRESS BAR.
        function updateProgress(e) 
        {
            if (e.lengthComputable) 
            {
                document.getElementById('pro').setAttribute('value', e.loaded);
                document.getElementById('pro').setAttribute('max', e.total);
            }
        }
        
        // CONFIRMATION.
        function transferComplete(e) 
        {
            //alert("Files uploaded successfully.");
        }
        
        
        
}]).directive("fileread",function () {
    return {
            restric: 'A',
            controller: function(){alert("test");}
            }
});
