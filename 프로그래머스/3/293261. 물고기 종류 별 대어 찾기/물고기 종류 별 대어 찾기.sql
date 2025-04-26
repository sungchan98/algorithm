-- 코드를 작성해주세요
SELECT 
    F.ID, 
    FN.FISH_NAME, 
    F.LENGTH
FROM 
    FISH_INFO F
JOIN 
    FISH_NAME_INFO FN ON F.FISH_TYPE = FN.FISH_TYPE
WHERE 
    (F.FISH_TYPE, F.LENGTH) IN (
        SELECT 
            FISH_TYPE, MAX(LENGTH)
        FROM 
            FISH_INFO
        WHERE 
            LENGTH IS NOT NULL
        GROUP BY 
            FISH_TYPE
    )
ORDER BY 
    F.ID;
