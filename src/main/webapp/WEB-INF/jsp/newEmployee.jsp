<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<head>
	<title>EmployeeDB</title>
</head>
<body>
<div align="center">
<h3>Create Employee</h3>
	<form:form action="saveEmployee" method="Post" modelAttribute="employee">
	   <table border="1">
	   		<tr>
	   			<td>Employee Name</td>
	   			<td><form:input path="empname"/></td>	   			
	   		</tr>
	   		<tr>
	   			<td>Employee salary</td>
	   			<td><form:input path="salary"/></td>	   			
	   		</tr>
	   
	   		<tr>
	   			<td colspan="2"><input type="submit" value="Save"></td>	   			
	   		</tr>
	   </table>
	</form:form>
<h3><a href="/getAllEmployees">cancel</a></h3>
</div>
</body>
</html>