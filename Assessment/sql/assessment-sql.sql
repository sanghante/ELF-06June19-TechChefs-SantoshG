/*1.Write a query to display Employee name, his salary along with the designation for all the employee. */
select e.name, e.salary, e.designation from employee_info e;

/*2.Write a query to obtain name and his current salary and new salary with a hike 25 % for all the Employee. */
select e.name, e.salary as current_salary, e.salary * 1.25 as new_salary from employee_info e;

/*3.Write a query to display all the details of the Employee who are working as salesman. */
select * from employee_info e where e.designation = "Salesman";

/*4.Write a query to display all the employees of Dept.no 20. */
select * from employee_info e where e.dept_id = 20;

/*5.Write a query to display all the Employees DOB before 1994. */
select * from employee_info e where e.dob < '1994-01-01';

/*6.Write a query to display all the employees whose annual salary is less than 30,000. */
select * from employee_info e where e.salary*12 < 30000;

/*7.Write a query to display name, salary and Annual salary of all the clerks. */
select e.name, e.salary as monthly_salary, e.salary * 12 as annual_salary from employee_info e where e.designation = 'Clerk';

/*8.Write a query to display all the details of Employee Whoever Hired after Feb of 2013. */
select * from employee_info e where e.joining_date > '2013-02-28'

/*9.Write a query to display managers working in deptno 20 only if salary is greater than 2500.*/
/* using mngr_id to find out who are managers */
select * from employee_info e where e.dept_id = 20 and e.salary > 2500 and e.id in (select e1.mngr_id from employee_info e1 where e1.mngr_id = e.id);
/*using designation='Manager' to find out who are managers*/
select * from employee_info e where e.designation = 'Manager' and e.dept_id = 20 and e.salary > 2500

/*10.Write a query to display all the employee excluding Analyst.*/
select * from employee_info e where e.designation !='Analyst';

/*11.Write a query to display all the employees excluding salesman who are working in department 30.*/
select * from employee_info e where e.dept_id = 30 and e.designation != 'Salesman'

/*12.Write a query to display names of all the employees who are working in dept 30 as manager 
OR all the names of employee who are working as a clerk and salary less than 2000. */
/* using mngr_id to find out who are managers */
select e.name from employee_info e where (e.dept_id = 30 and e.id in (select e1.mngr_id from employee_info e1 where e1.mngr_id = e.id)) 
OR e.designation='Clerk' and e.salary < 2000;
/*using designation='Manager' to find out who are managers*/
select e.name from employee_info e where (e.dept_id = 30 and e.designation = 'Manager')
OR e.designation='Clerk' and e.salary < 2000;

/*13.Write a query to display all the Employees in dept 20 only if their salary is greater than 1000 and less than 3500, including 1000 & 3500. */
select * from employee_info e where e.dept_id = 20 and e.salary >= 1000 and e.salary <=3500;

/*14.Write a query to display all the details of Employees who are working as clerk in deptno 20,30 or 40.*/
select * from employee_info e where e.designation = 'Clerk' and e.dept_id in (20, 30, 40);

/*15.Write a query to display the details of software developer, manager or clerk who are working in dept.  10 or 20 and salary is greater than 1500.*/
select * from employee_info e where e.designation in ('Software Developer', 'Manager', 'Clerk') and e.dept_id in (10, 20) and e.salary > 1500;

/*16. Write a query to display all the details of Employees who are working in department 10,20 excluding all the Salesman and Analyst.*/
select * from employee_info e where e.dept_id in (10, 20) and e.designation not in ('Salesman', 'Analyst')

/*17. Write a query to display name, Salary for all the Employees who are working in dept 10 or 20 and their annual salary between 20,000 and 40,000 including the limits.*/
select e.name, e.salary from employee_info e where e.dept_id in (10, 20) and (e.salary * 12) BETWEEN 20000 and 40000;

/*18.Write a query to display all the details of employees who were hire in the month of September working in dept 20 or 30.*/
select * from employee_info e where e.joining_date like '____-09-__'; /*:))*/

/*19.Write a query to display their name and DOJ of employee who works as salesman or clerk and their names has at least one S or E.*/
select e.name,e.joining_date from employee_info e where e.designation in ('Salesman','Clerk') 
and (e.name like '%s%' or e.name like '%e%') 

/*20.Write a query to display Average salary and Highest salary of dept. 20.*/
select avg(e.salary) as Average_salary, max(e.salary) as Max_salary from employee_info e where e.dept_id = 20;

/*21.Write a query to display date of first and last Hired Employees.*/
select min(e.joining_date) as first_joining , max(e.joining_date) as last_joining from employee_info e

/*22.Write a query to display AVG Salary of Employees by excluding president and manager(job). */
select avg(salary) as average_salary from employee_info where designation not in ('President','Manager');

/*23.Write a query to display the total salary and average salary of each department*/
select sum(e.salary) as total_salary, avg(e.salary) as average_salary, e.dept_id from employee_info e group by dept_id;

/*24.Write a query to find the highest and least salary of an Employee in each job by excluding the employees whose name has ‘R’ as the last but one character.*/
select max(e.salary), min(e.salary) from employee_info e where e.name like '%R_' group by dept_id

/*26. Write a query to list the employee whose designation are same as Vikas    or Rahul.*/
select * from employee_info e where e.designation in (select e1.designation from employee_info e1 where e1.name in ('Vikas', 'Rahul'));

/*27. Write a query to List the employee whose salary is equal to the average of max and minimum.*/
select * from employee_info e where e.salary = avg( max(e.salary), min(e.salary));

select avg (select max(e.salary), min(e.salary) from employee_info e) 

/*28. Write a query to display employee name, department name and the location of all employee.*/
select e.name as employee_name , d.dept_name as department_name from employee_info e, department_info d where e.dept_id = d.dept_id

/*29. Write a query to display all the details of employee whose name begins with the consonants.*/
select * from employee_info e where e.name not like 'A%' and e.name not like 'e%' and e.name not like 'i%' and e.name not like 'o%' and e.name not like 'u%'

30. Create a Views from Employee_Info table .Views should have all  the record whose salary is greater than 10000.
/*
DELIMITER $$

DROP VIEW IF EXISTS `workspace`.`view2`$$
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view1` 
    VIEW `workspace`.`view2` 
    AS
    (select 	id, 
	dept_id, 
	mngr_id, 
	name, 
	age, 
	gender, 
	joining_date, 
	email, 
	account_number, 
	phone_number, 
	salary, 
	designation, 
	dob
	 
	from 
	workspace.employee_info where e.salary > 10000)$$

DELIMITER ;
*/
31.  Create a trigger which will work before deletion in employee_info table     and create a duplicate copy of the record in another table employee_backup

/*32.What is Driver Class?
 Driver class as an external file, provided by the db vendor within the jar file. 
It is used by jdbc api to connect to the RDBMS (i.e. to create a Connection object).
The Driver provided by the db vendor is an implementation of the java.sql.Driver interface in the jdbc api. */

/*33.What is DB URL? 
DB URL means -> Database Uniform Resource Locator. It uniquely identifies a database within a network.
It consists of protocol:sub-protocol:hostname
protocol is alway "jdbc"
sub-protocol is obtained within the documentation provided by the db vendor of the db we are connecting to.
hostname consists of computer name or ip-address and port number. 
Port number is an integer which uniquely identifies an application (rdbms application) running on that computer.
*/






