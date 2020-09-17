<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<head>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>

	<title>
	New Player
	</title>

</head>
<body>

<h2> New Player</h2>




<form:form action="savePlayer" modelAttribute="player" method="POST">

<form:hidden path="id" />

<table class="greyGridTable">
	<tbody>
		<tr>
			<td><label> First Name:</label></td>
			<td><form:input path="firstName" /></td>
			</tr>	
			
				<tr>
			<td><label> Last Name:</label></td>
			<td><form:input path="lastName" /></td>
			</tr>	
			
				<tr>
			<td><label> Shirt Number:</label></td>
			<td><form:input path="shirtNumber" /></td>
			</tr>
			
				<tr>
			<td><label> Country:</label></td>
			<td><form:input path="country" /></td>
			</tr>
			
				<tr>
			<td><label> FIFA Rating:</label></td>
			<td><form:input path="fifaRating" /></td>
			</tr>
			
	
				<tr>
			<td>Action</td>
			<td><input type="submit" value="Save" class="save"></td>
			</tr>	
				
		</tbody>
		</table>
		</form:form>
		
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/juve/players"> Back to List</a>
		</p>
	


</body>
</html>