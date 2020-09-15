<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>

<title> Juventus FC Players</title>

</head>

<body>
<div class="header">
<h2>Players  </h2>
</div>
<table class="greyGridTable">
<c:forEach var="thePlayer" items="${players}">

<thead>
<tr>
<th>ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
</tr>
</thead>
<tbody>
<tr>
<td> ${thePlayer.id}  </td>

<td>${thePlayer.firstName}</td>
<td>${thePlayer.lastName}</td>
</tr>

</tbody>
</c:forEach>
</table>






</body>



</html>