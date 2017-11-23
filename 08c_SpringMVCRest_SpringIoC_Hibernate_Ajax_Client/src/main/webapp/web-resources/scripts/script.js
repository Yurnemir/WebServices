//recuperer la liste des pays avec ajax natif

document.addEventListener("DOMContentLoaded", function(event) {
	// 1 Instanciation d'un objet XHR
	// variable qui va contenir l'objet XMLHttpRequest(l'objet javascript qui
	// joue le role de bus pour la requete envoyée au serveur)
	
	var xhr;
	
	//tester le navigateur
	//les navigateurs qui contiennent l'objet xmlhttprequest sont ie>6, chrome, firefox, safari
	
	if (window.XMLHttpRequest){

        xhr = new XMLHttpRequest();
	
	} else {
		xhr = new ActiveXObject("Microsoft.XMLHTTP");
	}
//    if (window.ActiveXObject)
//    {
//        var names = [
//            "Msxml2.XMLHTTP.6.0",
//            "Msxml2.XMLHTTP.3.0",
//            "Msxml2.XMLHTTP",
//            "Microsoft.XMLHTTP"
//        ];
//        for(var i in names)
//        {
//            try{ return new ActiveXObject(names[i]); }
//            catch(e){}
//        }
//    }
//    window.alert("Votre navigateur ne prend pas en charge l'objet XMLHTTPRequest.");
//    return null; // non supporté

	// 4 exploitation de la réponse du serveur
	xhr.onreadystatechange = function(){
		//le traitement à effectuer lorsque la réponse est prête
		if( xhr.readyState===4 && xhr.status ===200 ){ //=== pas de conversion avant comparaison (ie ==type), == conversion (juste valeur)
			//recuperer les pays a partir du xhr
			var listePays=JSON.parse(xhr.responseText);
			
			var ajoutHtml = "";
			
			for(var i = 0; i< listePays.length; i++){
				ajoutHtml += "<tr>";
				ajoutHtml += "<td>"+listePays[i].id+"</td>";
				ajoutHtml += "<td>"+listePays[i].nom+"</td>";
				ajoutHtml += "<td>"+listePays[i].capitale+"</td>";
				ajoutHtml += "<td>"+listePays[i].population+"</td>";
				ajoutHtml += "</tr>";
			}
			document.getElementById("paysInfos").innerHTML=ajoutHtml;
			
		}
		
	}
	
	
	// 2 ouverture d'un canal pour envoyer la requete http bers le serveur
	xhr.open("GET","http://localhost:8080/08a_SpringMVCRest_SpringIoC_Hibernate/listePays",true); //true pour asynchrone/pas async
	
	//definir l'entete de la requete http avant de l'envoyer
	xhr.setRequestHeader('Content-Type',"application/json");
	
	// 3 envoi de la requete vers le serveur
	xhr.send();
	
	
})


//la methode d'ajout d'un pays
function ajouterPays(){
	//recuperation des valeurs entrées par le formulaire
	var paysIn={
			nom:document.getElementById("nomPays").value,
			capitale:document.getElementById("capitalePays").value,
			population:document.getElementById("populationPays").value
	};
	
	console.log(paysIn)
	
	
	//utilisation de la xhr de jquery
	$.ajax({// renvoie l'objet XHR (doc jquery .ajax())
		type:"POST",
		url:"http://localhost:8080/08a_SpringMVCRest_SpringIoC_Hibernate/addPays",
		contentType:"application/json",
		dataType:"json",
		data:JSON.stringify(paysIn),
		//promise lors d'un succes
		success:function(response){
			var ajoutHtml = "";
			ajoutHtml += "<tr>";
			ajoutHtml += "<td>"+response.id+"</td>";
			ajoutHtml += "<td>"+response.nom+"</td>";
			ajoutHtml += "<td>"+response.capitale+"</td>";
			ajoutHtml += "<td>"+response.population+"</td>";
			ajoutHtml += "</tr>";
			
			$("#paysInfos").append(ajoutHtml);
		},
		error:function(response){
			console.log("errrrrrrrrrrrreur du serveur...");
		}
	
	});
	
}
