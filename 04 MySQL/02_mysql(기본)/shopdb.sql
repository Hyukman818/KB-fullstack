
-- productTBL의 데이터를 출력하세요.
SELECT * FROM shopdb.producttbl;

-- memberTBL의 데이터를 출력하세요.
-- 단, memberName 과 memberAddress만 출력함
SELECT memberName, memberAddress FROM membertbl;

-- memberTBL의 데이터 중 이름이 '지운이'인 데이터만 출력하세요.
SELECT * FROM membertbl WHERE memberName = '지운이';

-- 앞에서 작성한 3개의 SQL 문을 한 번에 실행하세요.
