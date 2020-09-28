<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
  <head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AllContact</title>

<script>
function deleteConferm(){
return confirm("Are u sure want to delete?");
}
</script>

</head>
<body>
<h1>Contact List</h1>
<b></b><font color='green' size='6'>${delmsg}</font></b><br>
<a href="/">Add New</a><br><br>
<table border="2" width="70%" cellpadding="2">  
	<tr>
			<td>Name</td>
			
			<td>Email</td>
			<td>Mobile No</td>
			<td>Edit</td>
			<td>Delete</td>
	</tr>
	<c:forEach items="${contacts}"  var="contacts">
	<tr>
	<td>${contacts.name}</td>
	<td>${contacts.email}</td>
	<td>${contacts.phno}</td>
	<td>
	<a href="editContact?cid=${contacts.cid}">Edit</a></td>
	<td>
	<a href="deleteContact?cid=${contacts.cid}" onclick="return deleteConferm()">Delete</a>
	
	</td>
	
	</tr>
	</c:forEach>
	</table>
</body>
</html>