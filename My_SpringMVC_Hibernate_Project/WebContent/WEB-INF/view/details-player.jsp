<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>

<title> Details </title>

</head>

<body>
<div class="header">
<h2>Player Details  </h2>
</div>
<table class="greyGridTable">
<c:forEach var="detail","player" items="${detail,player}">

<c:url var="upd" value="/juve/updateForm">
<c:param name="detailId" value="${detail.id }"/>
<c:param name="playerId" value="${player.id }"/>
</c:url>

<thead>
<tr>
<th>ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th> ACTIONS</th>
</tr>
</thead>
<tbody>
<tr>
<td> ${detail.id}  </td>

<td>${detail.shirtNumber}</td>
<td>${detail.country}</td>
<td>${player.country }</td>
<td> <a href = "${upd}">Update</a> 
 </td>
</tr>

</tbody>
</c:forEach>
</table>






</body>



</html>