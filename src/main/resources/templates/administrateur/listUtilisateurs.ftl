<!DOCTYPE html>
<html>
    <head>
        <title>Ajout User</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/css/myStyle.css" />
        <link rel="stylesheet" href="/css/bootstrap.min.css" />
        </head>
    
    
    <body>
        
        <table class="table table-stripped">
                <tr>
                    <th>id</th>
                    <th>Nom</th>
                    <th>Prenom</th>
                    <th>Email</th>
                    <th>Join Date</th>
                </tr>
                <#list model["users"] as user>
                <tr>
                    <td><#if user.idUtilisateur?has_content>${user.idUtilisateur}</#if></td>
                    <td><#if user.nomUtilisateur?has_content>${user.nomUtilisateur}</#if></td>
                    <td><#if user.prenomUtilisateur?has_content>${user.prenomUtilisateur}</#if></td>
                    <td><#if user.emailUtilisateur?has_content>${user.emailUtilisateur}</#if></td>
                    <td><#if user.joinDate?has_content>${user.joinDate}</#if></td>
                    <td><#if user.passwordUtilisateur?has_content>${user.passwordUtilisateur}</#if></td>
                </tr>
                </#list>
            </table>
    </body>
    </html>
