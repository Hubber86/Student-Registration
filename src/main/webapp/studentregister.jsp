<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
 <div align="center">
 <h1>Student Registration Form</h1>
 <form action="<%= request.getContextPath() %>/StudentServlet" method="post">
 <table style="with: 80%">
 <tr>
 <td>First Name</td>
 <td><input type="text" name="firstName" /></td>
 </tr>
 <tr>
 <td>Last Name</td>
 <td><input type="text" name="lastName" /></td>
 </tr>
 <tr>
 <td>Academic Year</td>
 <td><input type="text" name="year" /></td>
 </tr>
 <tr>
 <td>Department</td>
 <td><input type="text" name="department" /></td>
 </tr>
 <tr>
 <td>Address</td>
 <td><input type="text" name="address" /></td>
 </tr>
 <tr>
 <td>Contact No</td>
 <td><input type="text" name="contact" /></td>
 </tr>
 <tr>
 <td>Email ID</td>
 <td><input type="text" name="email" /></td>
 </tr>
 </table>
 <input type="submit" value="Submit" />
 </form>
 </div>
</body>
</html>

