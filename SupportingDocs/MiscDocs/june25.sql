select * from emp where salary = (select max(salary) from emp where salary <> (select max(salary) from emp));

select max(salary) from emp where salary <> (select max(salary) from emp);

select max(salary) from emp;

select * from emp;

select max(salary) from emp group by deptno;

select firstname, salary from emp where salary in (select max(salary) from emp group by deptno);

select * from dept;

select emp.firstname as name, emp.salary as salary, dept.deptno as deptno from emp, dept where emp.deptno = dept.deptno and emp.deptno in (select deptno from dept where location != 'Mandya');

insert into data (select emp.firstname as name, emp.salary as salary, dept.deptno as deptno from emp, dept where emp.deptno = dept.deptno and emp.deptno in (select deptno from dept where location != 'Mandya'));

select * from data;





