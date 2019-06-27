SELECT
    count(*),deptno, job, avg(salary)
FROM
    workspace.emp
group by deptno;