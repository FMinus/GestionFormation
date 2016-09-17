angular.module('GestionFormation')
.service('fileUpload', ['$http', function ($http) 
    {
    this.uploadFileToUrl = function(file, uploadUrl,session)
    {
        var fd = new FormData();
        fd.append('file', file);
        //fd.append('session', session);
        fd.append('session', angular.toJson(session,true));
        $http.post(uploadUrl, fd, 
        {
            transformRequest: angular.identity,
            headers: {'Content-Type': undefined}
        })
        .success(function(){
        })
        .error(function(){
        });
    };
}]);