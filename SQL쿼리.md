## 1) NVL 함수
NVL 함수는 값이 NULL인 경우 지정값을 출력하고, NULL이 아니면 원래 값을 그대로 출력한다.

- 함수  :  NVL("값", "지정값") 

## 2) (+)
해당 쿼리가 OUTER JOIN을 위한 표현입니다.

SELECT * FROM a, b WHERE b.id(+)  = a.id  -- Oracle OUTER JOIN

SELECT * FROM a LEFT OUTER JOIN b ON b.id = a.id -- 동일한 표현

a.id = b.id (+) -- LEFT OUTER
A.id(+) = b.id  -- RIGHT OUTER


EQUI JOIN 문장들의 한 가지 제약점은 그것들이 조인을 생성하려 하는 두개의 테이블의 
두개 컬럼에서 공통된 값이 없다면 테이블로부터 데이터를 반환하지 못한다는 것이다.

- 정상적으로 조인 조건을 만족하지 못하는 행들을 보기위해 OUTER JOIN을 사용한다. 

OUTER JOIN 연산자는 "(+)"이다.

- 조인시킬 값이 없는 조인측에 "(+)"를 위치 시킨다.

## 3) ORDER BY
order by 정렬 기준 값 asc(오름차순), desc(내림차순)
오름차순이 기본

## 4) BETWEEN
1) 컬럼명 BETWEEN 시작일자 AND 종료일자
2) 컬럼명 >= 시작일자 AND 컬럼명 <= 종료일자
