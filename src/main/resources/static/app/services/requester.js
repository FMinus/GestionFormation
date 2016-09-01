angular.module('GestionFormation')
        .factory('requester',["$http",'$q','HTTP_METHOD','properties', function($http,$q,HTTP_METHOD,properties)
    {
        function getData(url,header,method,data)
        {
            var task = $q.defer();
            var réponse;
            
            if(header != null)
            {
                var headers = $http.defaults.headers.common;
                headers.Authorization = header;
            }
            
            var promise;
            
        }
    }]);