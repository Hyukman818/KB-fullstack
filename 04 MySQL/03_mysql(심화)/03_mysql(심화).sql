USE sqldb;

-- 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.

SELECT userID AS '사용자 아이디', SUM(amount) AS '총 구매 개수'
FROM buytbl
GROUP BY userID;

SELECT userID AS '사용자 아이디', SUM(amount*price) AS '총 구매액'
FROM buytbl
GROUP BY userID;


-- 다음 결과가 나오도록 buytbl에 대한 SQL 문을 각각 작성하세요.

SELECT AVG(amount) AS '평균 구매 개수'
FROM buytbl;

SELECT userID, AVG(amount) AS '평균 구매 개수'
FROM buytbl
GROUP BY userID;


-- 다음 결과가 나오도록 usertbl에 대한 SQL 문을 작성하세요.
-- 가장 키가 큰 사람과 가장 키가 작은 사람을 출력함

SELECT name, height
FROM usertbl
WHERE height = (SELECT MAX(height) FROM usertbl)
OR height = (SELECT MIN(height) FROM usertbl);


-- 다음 결과가 나오도록 usertbl에 대한 SQL 문을 작성하세요.

SELECT COUNT(*) AS '휴대폰이 있는 사용자' -- COUNT(*)이면 NULL 포함 개수임
FROM usertbl;

SELECT COUNT(mobile1) AS '휴대폰이 있는 사용자'
FROM usertbl;


-- 사용자별 총 구매액을 출력하세요
SELECT userID AS '사용자', SUM(price*amount) AS '총구매액'
FROM buytbl
GROUP BY userID;

-- 총 구매액이 1000 이상인 사용자만 출력하세요
SELECT userID AS '사용자', SUM(price*amount) AS '총구매액'
FROM buytbl
GROUP BY userID
HAVING SUM(price * amount) >= 1000;


-- world 데이터베이스에서 다음 질문을 처리하세요.
USE world;

-- 1
select sum(population) from city where countrycode ='KOR';
-- 2
select min(population)as'최소값' from city where countrycode ='KOR';
-- 3
select avg(population) from city where countrycode ='KOR';
-- 4
select max(population)as'최대값' from city where countrycode ='KOR';
-- 5
select length(name) from country;
-- 6 
select upper(mid(Name, 1, 3)) from country;
-- 7
select name as '이름' , round(lifeexpectancy,1) as '기대수명' from country;


-- employees db에서 각 부서별 관리자를 출력하세요
USE employees;

-- 단, 현 재지작자만 출력한다
select * from dept_manager
where to_date = '9999-01-01';

-- 부서번호 d005 부서의 현재 관리자 정보를 출력하세요
select * from employees
where emp_no = (
select emp_no from dept_manager 
where dept_no = 'd005' and to_date = '9999-01-01'
);

-- employees 테이블에서 페이지네이션으로 페이지를 추출하려고 한다.
-- 다음 조건하에서 8번 페이지의 데이터를 출력하세요.
-- * 입사일을 내림차순으로 정렬한다.
-- * 한 페이지당 20명의 정보를 출력한다.
select * from employees
	order by hire_date DESC
    limit 140,20;
    
-- employees db에서 재직자의 총 수를 구하시오
-- 재직자의 to_date 값은 '9999-01-01'로 저장되어 있음
select count(*) from dept_emp
	where to_date = '9999-01-01';
    
-- employees db에서 재직자의 평균 급여를 출력하시오
select avg(salary) from salaries
	where to_date = '9999-01-01';

-- 재직자 전체 평균 급여 보다 급여를 더 많이 받는 재직자를 출력하세요.
select * from salaries
	where to_date = '9999-01-01'
	and salary > (
		select avg(salary) from salaries
		where to_date = '9999-01-01'
		);

-- employees db에서 각 부서별 재직자의 수를 구하시오
-- * 부서 번호로 구분하고, 부서번호로 오름차순 정렬하여 출력한다
select dept_no, count(*) from dept_emp
where to_date = '9999-01-01'
group by dept_no
order by dept_no;

    











