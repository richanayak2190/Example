<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<head>
	<title>EmployeeDB</title>
</head>
<body>
<div align="center">
<h3>Employee database</h3>
<h3><a href="/createEmployee">Create Employee</a></h3>
	<table border="1">
		<tr>
			<th> Employee ID</th>
			<th> Employee Name</th>
			<th> Employee Salary</th>
			<th> Actions</th>
		</tr>
		<c:forEach items="${emplist}" var="emp">
			<tr>
				<td>${emp.empid}</td>
				<td>${emp.empname}</td>
				<td>${emp.salary}</td>
				<td>
				<a href="/editEmployee?empid=${emp.empid}">Edit</a>
				<a href="/deleteEmployee?empid=${emp.empid}">Delete</a>
				</td>
			</tr>
		</c:forEach>	
	</table>
</div>
</body>
</html>