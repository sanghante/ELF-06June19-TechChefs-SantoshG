select emp.*,dept.location  from emp inner join dept on emp.deptno = dept.deptno;

select emp.*,dept.location  from emp join dept on emp.deptno = dept.deptno;

select emp.*,dept.location  from emp inner join dept where emp.deptno = dept.deptno;

select emp.*,dept.location  from emp cross join dept;

select *  from emp right join dept on emp.deptno = dept.deptno;

select *  from emp right join employee on emp.deptno = employee.dept_no;

select *  from emp left join employee on emp.deptno = employee.dept_no;

select *  from emp join employee on emp.deptno = employee.dept_no;

select * from emp left join dept on emp.deptno = dept.deptno where emp.firstname like 'r%a';

select * from view1;

delete from view1 where deptno=30;

select * from emp;

update view1 set firstname='Bore' where firstname='bore';

call myfirstsp('Aalu');