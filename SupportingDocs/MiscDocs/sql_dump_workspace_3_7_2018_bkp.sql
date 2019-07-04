/*
SQLyog Enterprise Trial - MySQL GUI v7.11 
MySQL - 5.7.26-log : Database - workspace
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`elfdb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `elfdb`;

/*Table structure for table `data` */

DROP TABLE IF EXISTS `data`;

CREATE TABLE `data` (
  `name` varchar(100) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `deptno` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `data` */

insert  into `data`(`name`,`salary`,`deptno`) values ('Deve',20000,20),('Kumaraswamy',21000,20),('raje',22000,20),('krishne',300000,40);

/*Table structure for table `department_info` */

DROP TABLE IF EXISTS `department_info`;

CREATE TABLE `department_info` (
  `dept_id` int(11) NOT NULL,
  `dept_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `department_info` */

/*Table structure for table `dept` */

DROP TABLE IF EXISTS `dept`;

CREATE TABLE `dept` (
  `deptno` int(11) NOT NULL,
  `deptname` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dept` */

insert  into `dept`(`deptno`,`deptname`,`location`) values (10,'Farmer','Mandya'),(20,'Organic Farmer','Mysore'),(30,'Labourer','Mandya'),(40,'Land Owner','Bangalore'),(50,'Scientist','Belgaum');

/*Table structure for table `emp` */

DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `job` varchar(100) DEFAULT NULL,
  `hiredate` date NOT NULL,
  `salary` float NOT NULL DEFAULT '10000',
  `deptno` int(11) NOT NULL DEFAULT '10',
  PRIMARY KEY (`id`),
  KEY `FK_dept` (`deptno`),
  CONSTRAINT `FK_dept` FOREIGN KEY (`deptno`) REFERENCES `dept` (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `emp` */

insert  into `emp`(`id`,`firstname`,`lastname`,`email`,`job`,`hiredate`,`salary`,`deptno`) values (1,'Ram','Gowda','rame.gowda@jds.com','Raitha','2019-01-12',10000,10),(2,'Deve','Gowda','deve.gowda@jds.com','Mannina Maga','2019-01-12',20000,20),(3,'Kumaraswamy','Gowda','deve.gowda@jds.com','Mannina Maga','2019-01-12',21000,20),(4,'raje','Gowda','raje.gowda@jds.com','Mannina Maga','2019-01-12',22000,20),(5,'Krishne','Gowda','krishne.gowda@jds.com','Aalu','2019-01-12',10000,30),(6,'Madhe','Gowda','madhe.gowda@jds.com','Aalu','2019-01-12',10000,30),(7,'krishne','Gowda','krishne.gowda@jds.com','Owner','2019-01-12',300000,40),(8,'Sadananda','Gowda','sadananda.gowda@jds.com','Raitha','2019-01-12',11000,10),(9,'Raghavendra','Gowda','raghu.gowda@jds.com','Raitha','2019-01-12',12000,10),(10,'Siddhe','Gowda','siddhe.gowda@jds.com','Raitha','2019-01-12',13000,10),(11,'Bore','Gowda','bore.gowda@jds.com','Aalu','2019-01-12',10000,30),(12,'tejasvi','surya','mahadev@gmail.com','mp','2019-05-24',12000,10);

/*Table structure for table `emp_email` */

DROP TABLE IF EXISTS `emp_email`;

CREATE TABLE `emp_email` (
  `id` int(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  KEY `FK_emp_email` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `emp_email` */

insert  into `emp_email`(`id`,`email`) values (12,'mahadev@gmail.com');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `fname` varchar(50) DEFAULT NULL,
  `lname` varchar(50) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `salary` int(11) DEFAULT NULL,
  `job_type` varchar(30) DEFAULT NULL,
  `dept_no` int(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert  into `employee`(`fname`,`lname`,`id`,`salary`,`job_type`,`dept_no`,`email`) values ('Ram','Ikshvaku',1,3000000,'King',1,'rama.chandra@gmail.com'),('Seetha','Videha',2,4000000,'Queen',2,'seetha.lakshmi@gmail.com'),('Lakshmana','Ikshvaku',3,2000000,'Chaperone',3,'lakshmana.loyal@gmail.com'),('Anjaneya','Vayuputra',4,1000000,'Protector',4,'pavana.putra@gmail.com'),('Ravana','Lankesh',5,10000000,'King',5,'dashanan.ravan@gmail.com'),('Ramesha','Raita',6,1000,'Farmer',6,'badava.ramesha@gmail.com'),('Halka','Baddimaga',7,2000,'Dhobi',7,'halka.bm@gmail.com');

/*Table structure for table `employee_address` */

DROP TABLE IF EXISTS `employee_address`;

CREATE TABLE `employee_address` (
  `id` int(11) DEFAULT NULL,
  `address_type` varchar(20) DEFAULT NULL,
  `address_1` varchar(200) DEFAULT NULL,
  `address_2` varchar(200) DEFAULT NULL,
  `landmark` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `pin_code` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee_address` */

/*Table structure for table `employee_educational_info` */

DROP TABLE IF EXISTS `employee_educational_info`;

CREATE TABLE `employee_educational_info` (
  `id` int(11) NOT NULL,
  `education_type` varchar(50) NOT NULL,
  `degree_type` varchar(50) DEFAULT NULL,
  `branch` varchar(50) DEFAULT NULL,
  `college_nm` varchar(200) DEFAULT NULL,
  `university_nm` varchar(200) DEFAULT NULL,
  `year_of_passing` date DEFAULT NULL,
  `percentage` double DEFAULT NULL,
  `location` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`,`education_type`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee_educational_info` */

/*Table structure for table `employee_experience_info` */

DROP TABLE IF EXISTS `employee_experience_info`;

CREATE TABLE `employee_experience_info` (
  `id` int(11) NOT NULL,
  `company_nm` varchar(100) DEFAULT NULL,
  `designation` varchar(100) DEFAULT NULL,
  `joining_date` date DEFAULT NULL,
  `leaving_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee_experience_info` */

/*Table structure for table `employee_info` */

DROP TABLE IF EXISTS `employee_info`;

CREATE TABLE `employee_info` (
  `id` int(11) NOT NULL,
  `dept_id` int(11) NOT NULL,
  `mngr_id` int(11) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `joining_date` date DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `account_number` int(11) DEFAULT NULL,
  `phone_number` int(11) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `designation` varchar(50) DEFAULT NULL,
  `dob` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee_info` */

insert  into `employee_info`(`id`,`dept_id`,`mngr_id`,`name`,`age`,`gender`,`joining_date`,`email`,`account_number`,`phone_number`,`salary`,`designation`,`dob`) values (1,10,10,'Ramachandra',28,'M','2014-10-10','rama.chandra@gmail.com',1234,2147483647,900000,'Developer','1992-10-21'),(2,10,10,'Krishnaraj',24,'M','2018-01-31','krishna.raj@gmail.com',5678,2147483647,450000,'Developer','1996-01-17'),(3,20,10,'Nalini',39,'F','2009-10-16','nalini.bhat@gmail.com',1111,2147483647,2400000,'HR Manager','1980-06-24'),(4,20,3,'Radhika',20,'F','2018-10-10','radhika.pandit@gmail.com',2222,2147483647,500000,'Developer','1999-01-01'),(10,30,20,'Laxminarayan',54,'M','1996-10-10','laxmi.n@gmail.com',3333,2147483647,6600000,'CEO','1964-05-27'),(13,10,10,'Santosh',37,'M','2019-06-06','santosh.ghante@gmail.com',12345,1234567890,30000000,'tech lead','1981-04-10'),(14,10,3,'Inserted From Java',33,'M','3919-02-23','java@sql.com',123456789,232142836,9999,'Java Developer','3889-03-28'),(15,10,3,'Inserted From Java',33,'M','2019-12-12','java@sql.com',123456789,232142836,9999,'Java Developer','3889-03-28'),(16,10,3,'Inserted From Java',33,'M','2019-12-13','java@sql.com',123456789,232142836,9999,'Java Developer','3889-03-28');

/*Table structure for table `employee_other_info` */

DROP TABLE IF EXISTS `employee_other_info`;

CREATE TABLE `employee_other_info` (
  `id` int(11) NOT NULL,
  `passport_nbr` varchar(10) DEFAULT NULL,
  `aadhar_nbr` varchar(20) DEFAULT NULL,
  `pan` varchar(10) DEFAULT NULL,
  `ismarried` tinyint(1) DEFAULT NULL,
  `blood_group` varchar(3) DEFAULT NULL,
  `emergency_cntc_nm` varchar(100) DEFAULT NULL,
  `emergency_cntc_nbr` int(11) DEFAULT NULL,
  `nationality` varchar(40) DEFAULT NULL,
  `religion` varchar(20) DEFAULT NULL,
  `father_nm` varchar(100) DEFAULT NULL,
  `mother_nm` varchar(100) DEFAULT NULL,
  `spouse_nm` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_employee_other_info` FOREIGN KEY (`id`) REFERENCES `employee_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee_other_info` */

/*Table structure for table `employee_training` */

DROP TABLE IF EXISTS `employee_training`;

CREATE TABLE `employee_training` (
  `id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employee_training` */

/*Table structure for table `random_data` */

DROP TABLE IF EXISTS `random_data`;

CREATE TABLE `random_data` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `website_1` varchar(100) DEFAULT NULL,
  `website_2` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `random_data` */

insert  into `random_data`(`id`,`name`,`website_1`,`website_2`) values (1,'one','www.gmail.com','www.yahoo.com'),(1,'two',NULL,NULL);

/*Table structure for table `studentmarks` */

DROP TABLE IF EXISTS `studentmarks`;

CREATE TABLE `studentmarks` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `maths` int(11) NOT NULL,
  `science` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `percentage` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `studentmarks` */

insert  into `studentmarks`(`id`,`name`,`maths`,`science`,`total`,`percentage`) values (1,'Rahul',90,92,182,91),(2,'Vikas',87,89,176,88),(3,'Praveen',98,97,195,97.5);

/*Table structure for table `training_type` */

DROP TABLE IF EXISTS `training_type`;

CREATE TABLE `training_type` (
  `course_id` int(11) DEFAULT NULL,
  `course_nm` varchar(100) DEFAULT NULL,
  `duration` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `training_type` */

/* Trigger structure for table `emp` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `trig_emp_email` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `trig_emp_email` BEFORE INSERT ON `emp` FOR EACH ROW BEGIN
	insert into emp_email value(new.id, new.email);
    END */$$


DELIMITER ;

/* Trigger structure for table `emp` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `trig_emp_email_upd` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `trig_emp_email_upd` AFTER UPDATE ON `emp` FOR EACH ROW BEGIN
	update emp_email set email=new.email;
	
    END */$$


DELIMITER ;

/* Trigger structure for table `studentmarks` */

DELIMITER $$

/*!50003 DROP TRIGGER*//*!50032 IF EXISTS */ /*!50003 `student_total` */$$

/*!50003 CREATE */ /*!50017 DEFINER = 'root'@'localhost' */ /*!50003 TRIGGER `student_total` BEFORE INSERT ON `studentmarks` FOR EACH ROW BEGIN
set new.total = (new.maths + new.science);
set new.percentage = new.total/2;
    END */$$


DELIMITER ;

/* Procedure structure for procedure `myfirstsp` */

/*!50003 DROP PROCEDURE IF EXISTS  `myfirstsp` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`root`@`localhost` PROCEDURE `myfirstsp`(IN job varchar(100))
BEGIN
select * from emp where job = job;
    END */$$
DELIMITER ;

/*Table structure for table `view1` */

DROP TABLE IF EXISTS `view1`;

/*!50001 DROP VIEW IF EXISTS `view1` */;
/*!50001 DROP TABLE IF EXISTS `view1` */;

/*!50001 CREATE TABLE `view1` (
  `id` int(11) NOT NULL DEFAULT '0',
  `firstname` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `job` varchar(100) DEFAULT NULL,
  `hiredate` date NOT NULL,
  `salary` float NOT NULL DEFAULT '0',
  `deptno` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 */;

/*View structure for view view1 */

/*!50001 DROP TABLE IF EXISTS `view1` */;
/*!50001 DROP VIEW IF EXISTS `view1` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view1` AS (select `emp`.`id` AS `id`,`emp`.`firstname` AS `firstname`,`emp`.`lastname` AS `lastname`,`emp`.`email` AS `email`,`emp`.`job` AS `job`,`emp`.`hiredate` AS `hiredate`,`emp`.`salary` AS `salary`,`emp`.`deptno` AS `deptno` from `emp` where (`emp`.`deptno` < 40)) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
