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
                <div class="panel-heading">Inscription Utilisateur : {{test}}</div>
                <div class="panel-body">
                    <div class="" ng-if="mode.value=='form'">
                        <form>
                            <div class="form-group">
                                <label class="control-label">Nom : </label>
                                <input type="text" ng-model="utilisateur.nomUtilisateur" class="form-control"/>
                                <span ng-if="errors" class="error">{{errors.nomUtilisateur}}</span>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Prénom : </label>
                                <input type="text" ng-model="utilisateur.prenomUtilisateur" class="form-control"/>
                                <span ng-if="errors" class="error">{{errors.prenomUtilisateur}}</span>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Email : </label>
                                <input type="text" ng-model="utilisateur.emailUtilisateur" class="form-control"/>
                                <span ng-if="errors" class="error">{{errors.emailUtilisateur}}</span>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Date de Naissance : </label>
                                <input type="date" ng-model="utilisateur.joinDate" class="form-control" />
                                <span ng-if="errors" class="error">{{errors.joinDate}}</span>
                            </div>
                            <div class="">
                                <button class="btn btn-primary" ng-click="ajouterUtilisateur()">Enregister</button>
                            </div>
                        </form>
                    </div>
                    
                    <div class="" ng-if="mode.value=='confirm'">
                        <div class="panel-heading">Confirmation : L'utilisateur a été inscrit avce succès</div>
                        <div class="form-group">
                            <label class="control-label">Id : </label>
                            <label class="control-label">{{utilisateur.idUtilisateur}}</label>
                        </div>
                        <div class="form-group">
                            <label class="control-label">Nom : </label>
                            <label class="control-label">{{utilisateur.nomUtilisateur}}</label>
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
                    
                    <div class="" ng-if="exception.message">
                        <span class="error">{{exception.message}}</span>
                    </div>
                    
                </div>
            </div>
        </div>
    </body>
    </html>
