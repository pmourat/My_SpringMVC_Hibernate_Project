<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>

<title> Juventus FC Players</title>

</head>

<body>
<div class="header">
<h2> Juventus Players  </h2>
</div>
<table class="greyGridTable">
<thead>
<tr>
<th>ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>SHIRT NUMBER</th>
<th>COUNTRY</th>
<th>FIFA RATING</th>


<th> ACTIONS</th>
</tr>
</thead>
<c:forEach var="thePlayer" items="${players}">

<c:url var="update" value="/juve/editPlayer">
<c:param name="playerId" value="${thePlayer.id }"/>
</c:url>

<c:url var="delete" value="/juve/deletePlayer">
<c:param name="playerId" value="${thePlayer.id }"/>

</c:url>



<tbody>
<tr>
<td> ${thePlayer.id}  </td>

<td>${thePlayer.firstName}</td>
<td>${thePlayer.lastName}</td>
<td>${thePlayer.shirtNumber}</td>
<td>${thePlayer.country}</td>
<td>${thePlayer.fifaRating}</td>

<td> <a href = "${update}">Edit</a> 
	<a href = "${delete}">Delete</a> 
 </td>
		
</tr>

</tbody>
</c:forEach>
</table>


<br>
<br>
<input type="button" value="Add new player"   onclick="window.location.href='formForAdd'; return false;"
			class="add-button"/>



</body>



</html>