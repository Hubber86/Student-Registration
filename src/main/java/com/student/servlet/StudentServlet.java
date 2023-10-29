package com.student.servlet;import java.io.IOException;import javax.servlet.ServletException;import javax.servlet.annotation.WebServlet;import javax.servlet.http.HttpServlet;import javax.servlet.http.HttpServletRequest;import javax.servlet.http.HttpServletResponse;import com.student.model.Student;import com.student.dao.StudentDAO;@WebServlet("/StudentServlet")public class StudentServlet extends HttpServlet { private static final long serialVersionUID = 1L; private StudentDAO studentDAO; public void init() { studentDAO = new StudentDAO(); } protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { String firstName = request.getParameter("firstName"); String lastName = request.getParameter("lastName"); String year = request.getParameter("year"); String department = request.getParameter("department"); String address = request.getParameter("address"); String contact = request.getParameter("contact"); String email = request.getParameter("email"); Student student = new Student(); student.setFirstName(firstName); student.setLastName(lastName); student.setYear(year); student.setDepartment(department); student.setContact(contact); student.setAddress(address); student.setEmail(email); try { studentDAO.registerStudent(student); } catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); } response.sendRedirect("studentdetails.jsp"); }}