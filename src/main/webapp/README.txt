# Employee Registration Web Application

This is a simple web application for employee registration built using Java Servlets and JSP. It allows users to register new employees by filling out a registration form.

## Project Structure

The project consists of the following components:

1. **Servlets**: Located in the `com.employee.servlet` package, servlets handle HTTP requests and interact with the backend logic.

2. **JSP Files**: HTML templates with embedded Java code for dynamic content generation. These files are used for rendering web pages.

3. **DAO (Data Access Object)**: The `EmployeeDAO` class is responsible for handling database operations related to employee registration.

4. **Web Configuration (web.xml)**: Configuration file (`web.xml`) for servlet mappings and other web-related settings.

## Setup Instructions

1. **Prerequisites**:
   - Java Development Kit (JDK)
   - Java EE Web Server (e.g., Apache Tomcat)
   - Database (if applicable)

2. **Database Configuration**: If your project involves database operations, provide details on database setup and configuration here.

3. **Deployment**:
   - Build the project (if necessary).
   - Deploy the WAR (Web Application Archive) file to your Java EE web server.
   
4. **Access the Application**:
   - Launch your web browser.
   - Access the application by navigating to `http://localhost:8080/emp` .

## Usage

1. Access the application using the URL mentioned in the setup instructions.

2. You will be redirected to the registration form.

3. Fill out the form with employee details (first name, last name, username, password, address, and contact number).

4. Submit the form, and the data will be processed by the `EmployeeServlet`.

5. After successful registration, you will be redirected to the "employeedetails.jsp" page.

## Author

- Prajwal Kalashetty (PESMCOE Student)
- 8879440496

## License

This project is licensed under the XYZ License - see the [LICENSE.md](LICENSE.md) file for details.

Here are the changes made by Me(Prajwal Kalashetty)to the javaguides.net 
 1. Project Directory named as emp
emp
 |-README.txt
 |-src
  |--main
   |---java
    |-com 
     |--employee
      |---dao
       |-EmployeeDAO.java
      |---model
       |-Employee.java
      |---servlet
       |-EmployeeServlet.java
   |webapp
    |-WEB-INF
      |--lib
      |--web.xml
    |-employeedetails.jsp
    |-employeedetails.jsp

2.Employee.java
As it is code from the javaguides.net of file Employee.java

Modifications.
a.(package com.employee.model;)Line 1 in Employee.java

3.EmployeeDAO.java
As it is code from the javaguides.net of file EmployeeDao.java

Modifications.
a.(package com.employee.dao;)Line 1 in EmployeeDAO.java
b.(import com.employee.model.Employee;)Line 8 in EmployeeDAO.java(Access The Employee Model)
c.(String INSERT_USERS_SQL = "INSERT INTO emp" +)Line 13 in EmployeeDAO.java(As The table name emp in the database emp)
d.(.getConnection("jdbc:mysql://localhost:3306/emp?useSSL=false", "root", "root");)Line 22 in EmployeeDAO.java(As The database emp)

4.EmployeeServlet.java
As it is code from the javaguides.net of file EmployeeServlet.java

Modifications.
a.(package com.employee.servlet;)Line 1 in EmployeeServlet.java
b.(import com.employee.model.Employee;Line 11 in EmployeeServlet.java(Access The Employee Model)
import com.employee.dao.EmployeeDAO;Line 12 in EmployeeServlet.java(Access The EmployeeDAO))
c.(@WebServlet("/EmployeeServlet"))Line 14 in EmployeeServlet.java(Allows The EmployeeServlet to handle registration form i.e. employeeregister.jsp and on successful registration dispay success by rendering employeedetails.jsp)
d.(private EmployeeDAO employeeDAO;)Line 17 in EmployeeServlet.java
(employeeDAO = new EmployeeDAO();)Line 20 in EmployeeServlet.java
(employeeDAO.registerEmployee(employee);Line 42 in EmployeeServlet.java(As our class file name is EmployeeDAO, so object name EmployeeDAO, employeeDAO)

5.employeeregister.jsp
As it is code from the javaguides.net of file employeeregister.jsp

Modifications.
a.(<form action="<%= request.getContextPath() %>/EmployeeServlet" method="post">)Line 12 in employeeregister.jsp(Access EmployeeServlet by access path and handles the registration form)

6.employeedetails.jsp
As it is code from the javaguides.net of file employeedetails.jsp

Modifications.
a.(<%@page import="com.employee.dao.*"%>)Line 3 in employeedetails.jsp(Access EmployeeDAO by importing and handles the submitted registration form)

7.web.xml
Here is the mapping of web.xml

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>emp</display-name>

<servlet>
    <servlet-name>EmployeeServlet</servlet-name>
    <servlet-class>com.employee.servlet.EmployeeServlet</servlet-class>
</servlet>

<servlet-mapping>
    <servlet-name>EmployeeServlet</servlet-name>
    <url-pattern>/emp</url-pattern>
</servlet-mapping>

  <welcome-file-list>
        <welcome-file>employeeregister.jsp</welcome-file>
    </welcome-file-list>
</web-app>

