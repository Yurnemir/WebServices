//création des controleurs de mon application

monApp.controller("listeCtrl", function($scope, paysProvider,$rootScope,$location) {
	// le corps de ma fonction
	// appel de la fonction de paysProvider
	paysProvider.getAllPays(function(callBack) {
		$scope.paysListe = callBack;
	});
	
	$scope.deleteLien = function (pays){
		paysProvider.supprime(pays,function(callBackDelete){
			paysProvider.getAllPays(function(callBack) {
				$scope.paysListe = callBack;
			});
			
		});
		
	}
	
	$scope.updateLien = function(pays){
		$rootScope.paysModif = {
				id : pays.id,
				nom : pays.nom,
				capitale : pays.capitale,
				population : pays.population
		};
		
		$location.path("/updatePays");
		
	}

}).controller("addCtrl", function($scope, paysProvider, $location) {
	// declaration d'une variable dans le scope
	// pour initialiser le formulaire
	$scope.paysForm = {
		nom : "",
		capitale : "",
		population : 0
	}

	$scope.ajouter = function() {
		// appel de la fonction de paysProvider pour ajouter le pays
		// dans la base de données
		paysProvider.add($scope.paysForm, function(callBack) {
			if (callBack != undefined && callBack != "") {
				// si tout se passe bien , aller dans la page findAll.htmlet
				// actualiser la liste
				$location.path("listePays");
			}
		});

	}

}).controller("updateCtrl", function($scope, paysProvider, $location, $rootScope) {
	
	if ($rootScope.paysModif.id == undefined){
		
		// Declaration d'une variable pour stocker les valeurs du formulaire
		$scope.paysForm = {
			id : 0,
			nom : "",
			capitale : "",
			population : 0
		}
	} else {
		$scope.paysForm = {
				id : $rootScope.paysModif.id,
				nom : $rootScope.paysModif.nom,
				capitale : $rootScope.paysModif.capitale,
				population : $rootScope.paysModif.population
			}
	}
	
	$scope.modifier = function() {
		paysProvider.update($scope.paysForm, function(callBack) {
			if (callBack != undefined && callBack != "") {
				$location.path("listePays");
			}
		});
	}

}).controller("deleteCtrl", function($scope, paysProvider, $location) {

	$scope.paysSuppr = {
		id : 0,
		nom : "",
		capitale : "",
		population : 0
	}

	$scope.suppression = function() {
		paysProvider.supprime($scope.paysSuppr, function(callBack) {
			if (callBack != undefined && callBack != "") {
				$location.path("listePays");
			}
		});
	}

}).controller("getByIdCtrl", function($scope, paysProvider, $location, $rootScope) {

	$scope.paysRech = {
		id : 0,
		nom : "",
		capitale : "",
		population : 0
	}
	
	
	
	$scope.indice=false;
	$scope.message="";
	
	$scope.recherche = function() {
		paysProvider.recherche($scope.paysRech, function(callBack) {
			if (callBack != undefined && callBack != "") {
				$scope.paysTrouve = callBack;
				$scope.indice=true;
				$scope.message="";
			} else {
				$scope.indice=false;
				$scope.message="Pas de pays à afficher";
				$scope.paysTrouve = null;
			}
		});
	}
	
	$scope.deleteLien = function (pays){
		paysProvider.supprime(pays,function(callBackDelete){
			paysProvider.getAllPays(function(callBack) {
				$scope.indice=false;
			});
			
		});
		
	}
	
	$scope.updateLien = function(pays){
		$rootScope.paysModif = {
				id : pays.id,
				nom : pays.nom,
				capitale : pays.capitale,
				population : pays.population
		};
		
		$location.path("/updatePays");
		
	}

});