<%--
  Created by IntelliJ IDEA.
  User: Utilisateur
  Date: 11/05/2023
  Time: 09:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Google Maps View</title>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC5IX4ALdg7583cOpD1uKH3D2qkctrC5lo"></script>
<script>
    function initMap() {
        // Créer une nouvelle carte Google Maps
        var map = new google.maps.Map(document.getElementById('map'), {
            zoom: 15,
            center: {lat: 48.70347775430056, lng: 2.370277887831876}
        });

        // Ajouter un marqueur pour la position du client
        var marker = new google.maps.Marker({
            position: {lat: 48.70347775430056, lng: 2.370277887831876},
            map: map,
            title: 'Wahoo'
        });
    }
</script>
</head>
<body onload="initMap()">
<div id="map" style="width:400px; height:400px;"></div>
</body>
</html>
