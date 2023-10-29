
CREATE database student;
 use student;
CREATE TABLE `student_data` (
 `id` int(3) NOT NULL AUTO_INCREMENT,
 `first_name` varchar(20) DEFAULT NULL,
 `last_name` varchar(20) DEFAULT NULL,
 `year` varchar(250) DEFAULT NULL,
 `department` varchar(20) DEFAULT NULL,
 `address` varchar(45) DEFAULT NULL,
 `contact` varchar(45) DEFAULT NULL,
 email varchar(45) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ;
SELECT * FROM student_data;