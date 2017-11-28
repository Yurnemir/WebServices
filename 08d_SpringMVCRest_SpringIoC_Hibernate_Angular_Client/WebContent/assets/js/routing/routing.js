// regles de navigation routage des requetes

monApp.config(function($routeProvider) {
	$routeProvider.when("/listePays", {
		templateUrl: "views/findAll.html",
		controller: "listeCtrl"
	})
	.when("/addPays", {
		templateUrl: "views/add.html",
		controller:"addCtrl"
	})
	.when("/updatePays", {
		templateUrl: "views/update.html",
		controller:"updateCtrl"
	})
	.when("/deletePays", {
		templateUrl: "views/delete.html",
		controller:"deleteCtrl"
	})
	.when("/searchPays", {
		templateUrl: "views/getById.html",
		controller:"getByIdCtrl"
	})
	.otherwise({
		redirectTo:"/listePays"
	});
			
})