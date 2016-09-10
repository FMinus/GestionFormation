/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


angular.module("GestionFormation")
        .service('properties',function ()  
        {
            return { urlServer:"http://localhost:8080"};
                     //urlServer:"https://damp-wave-10421.herokuapp.com/"};
       
        });