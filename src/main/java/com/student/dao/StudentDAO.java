package com.student.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.student.model.Student;
public class StudentDAO {
 public int registerStudent(Student student) throws ClassNotFoundException {
 String INSERT_USERS_SQL = "INSERT INTO student_data" +
 " (first_name, last_name, year, department, address, contact,email) VALUES " +
 " (?, ?, ?, ?, ?,?,?);";
 int result = 0;
 Class.forName("com.mysql.jdbc.Driver");
 try (Connection connection = DriverManager
 .getConnection("jdbc:mysql://localhost:3306/student?useSSL=false", "root", "root");
 // Step 2:Create a statement using connection object
 PreparedStatement preparedStatement =
connection.prepareStatement(INSERT_USERS_SQL)) {
 preparedStatement.setString(1, student.getFirstName());
 preparedStatement.setString(2, student.getLastName());
 preparedStatement.setString(3, student.getYear());
 preparedStatement.setString(4, student.getDepartment());
 preparedStatement.setString(5, student.getAddress());
 preparedStatement.setString(6, student.getContact());
 preparedStatement.setString(7, student.getEmail());
 System.out.println(preparedStatement);
 // Step 3: Execute the query or update query
 result = preparedStatement.executeUpdate();
 } catch (SQLException e) {
 // process sql exception
 printSQLException(e);
 }
 return result;
 }
 private void printSQLException(SQLException ex) {
 for (Throwable e: ex) {
 if (e instanceof SQLException) {
 e.printStackTrace(System.err);
 System.err.println("SQLState: " + ((SQLException) e).getSQLState());
 System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
 System.err.println("Message: " + e.getMessage());
 Throwable t = ex.getCause();
 while (t != null) {
 System.out.println("Cause: " + t);
 t = t.getCause();
 }
 }
 }
 }
}

