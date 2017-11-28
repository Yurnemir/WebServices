// Services qui permettent de communiquer avec le WebService
monApp.factory("paysProvider", function($http) {
	var restWSUrl="http://localhost:8080/08a_SpringMVCRest_SpringIoC_Hibernate/";
		
	//recuperer la liste des pays
	function findAllPays(callBack){
		//envoi de la requete
		$http({
			method:'GET',
			url:restWSUrl+"listePays"
		}).then(function success(response) {//cette histoire de promise
			//la fonction dans le cas de succes de la requete
			console.log(response.data);
			//faire passer la reponse du webservice au controller
			callBack(response.data);
			
		}, function error(response) {
			//la fonction dans le cas d'echer/erreur de la requete
			console.log("----- Erreur: "+response.statusText)
		});
	}
	
	//methode addpays
	function addPays(paysAjout,callBack){
		//ennvoi de la requete via $http
		$http({
			method:'POST',
			url:restWSUrl+"/addPays",
			data:angular.toJson(paysAjout),
			headers:{
				'content-type':"application/json",
			}
		}).then(function success(responseWS) {
			console.log(responseWS.data)
			callBack(responseWS.data)
		}, function error(responseWS) {
			console.log("----- Erreur: "+response.statusText)
		});
	}
	
	//methode updatePays
	function updatePays(paysModif,callBack){
		$http({
			method:'PUT',
			url:restWSUrl+"/updatePays",
			data:angular.toJson(paysModif),
			headers:{
				'content-type':"application/json"
			}
		}).then(function success(responseWS) {
			console.log(responseWS.data)
			callBack(responseWS.data)
		}, function error(responseWS) {
			console.log("----- Erreur:"+response.statusText)
		});
	}
	
	function delPays(paysSuppr,callBack){
		$http({
			method:"DELETE",
			url:restWSUrl+"deletePays",
			data:angular.toJson(paysSuppr),
			headers:{
				'content-type':"application/json"
			}
		}).then(function success(responseWS){
			console.log(responseWS.data)
			callBack(responseWS.data)
			}, function error(responseWS){
				console.log("----- Erreur:"+response.statusText)
			})
	}
	
	//methode getById
	function findPays(paysRech,callBack){
		$http({
			method:"GET",
			url:restWSUrl+"/getPays?id="+paysRech.id
			
		}).then(function success(responseWS){
			console.log(responseWS.data)
			callBack(responseWS.data)
			}, function error(responseWS){
				console.log("----- Erreur:"+response.statusText)
			})
	}
	
	//le retour de factory
	return{
		getAllPays:findAllPays,
		add:addPays,
		update:updatePays,
		supprime:delPays,
		recherche:findPays
	}
})