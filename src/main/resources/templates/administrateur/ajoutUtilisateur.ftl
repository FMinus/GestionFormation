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
       <div class="col-md-6 col-sm-6 col-xs-12 spacer">
            <div class="panel panel-info">
                <div class="panel-heading">Inscription Utilisateur :</div>
                <div class="panel-body">
                    
                    <#if true >
                    <div class="">
                        <form action="/admin/ajout" name="user" method="post">
                            <div class="form-group">
                                <label class="control-label">Nom : </label>
                                <input type="text" name="nomUtilisateur" class="form-control"/>
                                <span ng-if="errors" class="error">{{errors.nomUtilisateur}}</span>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Prénom : </label>
                                <input type="text" name="prenomUtilisateur" class="form-control"/>
                                <span ng-if="errors" class="error">{{errors.prenomUtilisateur}}</span>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Email : </label>
                                <input type="text" name="emailUtilisateur" class="form-control"/>
                                <span ng-if="errors" class="error">{{errors.emailUtilisateur}}</span>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Date de Naissance : </label>
                                <input type="date" name="joinDate" class="form-control" />
                                <span ng-if="errors" class="error">{{errors.joinDate}}</span>
                            </div>
                            <div class="">
                                <input type="submit" value="Save" class="btn btn-primary"/>
                            </div>
                        </form>
                    </div>
                    </#if> 
                    
                    <#if true >
                    <div class="">
                        <div class="panel-heading">Confirmation : L'utilisateur a été inscrit avce succès</div>
                        <div class="form-group">
                            <label class="control-label">Id : </label>
                            <label class="control-label">{{utilisateur.idUtilisateur}}</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Nom : </label>
                            <label class="control-label">{{model.user.nomUtilisateur}}</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Prenom : </label>
                            <label class="control-label">{{utilisateur.prenomUtilisateur}}</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Prenom : </label>
                            <label class="control-label">{{utilisateur.emailUtilisateur}}</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Date de Naissance : </label>
                            <label class="control-label">{{utilisateur.joinDate|date:'yyyy-MM-dd'}}</label>
                        </div>
                    </div>
                    </#if>
                    <div class="" ng-if="exception.message">
                        <span class="error">{{exception.message}}</span>
                    </div>
                    
                </div>
            </div>
        </div>
    </body>
    </html>
