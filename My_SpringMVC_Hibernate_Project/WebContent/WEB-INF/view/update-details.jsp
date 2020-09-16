<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
	<title>
	Save Customer
	</title>


</head>
<body>

<h2> CRM </div>


<h3>  Save Customer </div>

<form:form action="updateForm" modelAttribute="player" method="POST">

<form:hidden path="id" />

<table>
	<tbody>
		<tr>
			<td><label> First name:</label></td>
			<td><form:input path="firstName" /></td>
			</tr>	
			
				<tr>
			<td><label> Last name:</label></td>
			<td><form:input path="lastName" /></td>
			</tr>	
			
		
			
				<tr>
			<td></td>
			<td><input type="submit" value="Save" class="save"></td>
			</tr>	
				
		</tbody>
		</table>
		</form:form>
		
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/juve/players"> Back to List</a>
		</p>
	


</div>
</body>
</html>