/**
 * Created by ST on 05/05/2014.
 */
angular.module("GestionFormation")
  .factory('utils', ['properties','$cookies','$http', function (properties,$cookies,$http) 
  {
    function redirectTo(page)
    {
       window.location.href=properties.urlServer+"/app/views"+page;
    }
    
    function deleteUserCookie()
    {
        $cookies.remove("currentUser");
    }
    
    
    
    return {
      redirectTo:redirectTo,
      deleteUserCookie:deleteUserCookie
    };
  }]);
