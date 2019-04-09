-- Q1.
SELECT emp.last_name, emp.salary, dept.department_name
FROM employees emp, departments dept
WHERE emp.department_id = dept.department_id(+) AND commission_pct is not null;

-- Q2.
SELECT emp.last_name, emp.salary, emp.job_id
FROM employees emp, employees man
WHERE emp.manager_id = man.employee_id AND man.last_name = 'King';

-- Q3.
SELECT emp.last_name, emp.salary
FROM employees emp, employees man
WHERE emp.manager_id = man.employee_id AND emp.salary > man.salary;

-- Q4.
SELECT MIN(salary) 최소급여, 
    MAX(salary) 최대급여, 
    SUM(salary) "급여의 합", 
    ROUND(AVG(salary), 0) "평균 급여"
FROM employees;

-- Q5.
select last_name, salary
from employees outer
where salary < (select avg(salary)
                from employees
                where department_id = outer.department_id);
