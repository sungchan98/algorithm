-- 코드를 작성해주세요
WITH EMP_SCORES AS (
    SELECT EMP_NO, SUM(SCORE) AS SCORE
    FROM HR_GRADE
    WHERE YEAR = 2022
    GROUP BY EMP_NO
)
SELECT E.SCORE, E.EMP_NO, EMP.EMP_NAME, EMP.POSITION, EMP.EMAIL
FROM EMP_SCORES E
JOIN HR_EMPLOYEES EMP ON E.EMP_NO = EMP.EMP_NO
WHERE E.SCORE = (SELECT MAX(SCORE) FROM EMP_SCORES);