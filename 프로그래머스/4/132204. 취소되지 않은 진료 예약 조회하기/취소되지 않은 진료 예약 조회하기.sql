-- 코드를 입력하세요
SELECT 
    A.APNT_NO,
    P.PT_NAME,
    A.PT_NO,
    A.MCDP_CD,
    D.DR_NAME,
    A.APNT_YMD
FROM APPOINTMENT A
JOIN PATIENT P ON A.PT_NO = P.PT_NO
JOIN DOCTOR D ON A.MDDR_ID = D.DR_ID
WHERE A.APNT_YMD BETWEEN '2022-04-13 00:00:00' AND '2022-04-13 23:59:59'
  AND A.MCDP_CD = 'CS'
  AND A.APNT_CNCL_YN = 'N'
ORDER BY A.APNT_YMD ASC;
