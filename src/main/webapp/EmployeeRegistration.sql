-- Create the EmployeeRegistration database if it doesn't exist
CREATE DATABASE IF NOT EXISTS EmployeeRegistration;
-- Switch to the EmployeeRegistration database
USE EmployeeRegistration;
-- Create the employee table
CREATE TABLE IF NOT EXISTS employees (
id int(3) NOT NULL AUTO_INCREMENT,
`first_name` varchar(20) DEFAULT NULL,
`last_name` varchar(20) DEFAULT NULL,
`username` varchar(250) DEFAULT NULL,
`password` varchar(20) DEFAULT NULL,
`address` varchar(45) DEFAULT NULL,
`contact` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
) ;
-- Define an index on the contactNumber column for faster lookups (optional)
CREATE INDEX idx_contact ON employees (id);