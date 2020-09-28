<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
  
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<b></b><font color='green' size='8'>${susmsg}</font></b>
<b><font color='red'>${errmsg}</font></b>

<h1>Welcome to PhoneBook Application</h1>
<form:form action="saveContact" method="post" modelAttribute="contact">
<table>
<tr>    
          <td> Enter Name : </td>   
          <td> <form:input path="name" /></td>  
          <form:hidden path="cid"/>
         </tr>    
<tr>
          <td>Enter Email :</td>
           <td><form:input path="email"/></td>
           </tr>

<tr>
<td>Enter Mobile No :</td>
<td><form:input path="phno"/></td>
</tr>

<tr>
<td><input type="submit" value="Save Contact" /></td>
    <td>  <input type="reset" value="Clear" /> </td>
<td><a href="viewContacts">View All Contacts</a>  </td>
</tr>
</tr>

</table>
  </form:form>  
</body>  
</html>  