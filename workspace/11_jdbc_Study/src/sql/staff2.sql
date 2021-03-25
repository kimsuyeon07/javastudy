-- 테이블 생성
CREATE TABLE staff2
(
	no NUMBER,
	name VARCHAR2(100),
	department VARCHAR2(100),
	hireDate DATE,
	PRIMARY KEY (no)
) ;

-- 전체 조회
SELECT FROM staff2;