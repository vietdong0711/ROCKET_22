USE testINg_system_ASsignment;

-- 
	-- veiw
   CREATE VIEW QuestiON1 AS(
    SELECT a.*, d.DepartmentName
    FROM acCOUNT a JOIN department d ON a.DepartmentID = d.DepartmentID
    WHERE d.DepartmentName = "Sale");
    
    -- CTE 
    with QuestiON1_CTE AS
	(SELECT a.*, d.DepartmentName
    FROM acCOUNT a JOIN department d ON a.DepartmentID = d.DepartmentID
    WHERE d.DepartmentName = "Sale")
    SELECT * FROM QuestiON1_CTE;
    
-- 
	-- view
   CREATE VIEW QuestiON2 AS(
    SELECT a.*
    FROM groupacCOUNT g JOIN acCOUNT a ON g.AcCOUNTID = a.AcCOUNTID
    WHERE a.AcCOUNTID IN (SELECT AcCOUNTID 
    FROM groupacCOUNT
    GROUP BY AcCOUNTID
    HAVING COUNT(*) = (SELECT COUNT(AcCOUNTID)
    FROM groupacCOUNT
    GROUP BY AcCOUNTID
    LIMIT 1)));
    
    -- CTE
    with QuestiON2_CTE AS
	(SELECT a.*
    FROM groupacCOUNT g JOIN acCOUNT a ON g.AcCOUNTID = a.AcCOUNTID
    WHERE a.AcCOUNTID IN (SELECT AcCOUNTID 
    FROM groupacCOUNT
    GROUP BY AcCOUNTID
    HAVING COUNT(*) = (SELECT COUNT(AcCOUNTID)
    FROM groupacCOUNT
    GROUP BY AcCOUNTID
    ORDER BY COUNT(AcCOUNTID) desc
    LIMIT 1)))
    SELECT * FROM QuestiON2_CTE;
    
-- 
	-- view
   CREATE VIEW QuestiON3 AS (
    SELECT * 
    FROM questiON 
    WHERE length(CONtent) > 300);
    
    drop view QuestiON3;

--
	-- view
   CREATE VIEW QuestiON4 AS (
    SELECT d.DepartmentName, COUNT(d.DepartmentID) AS So_nhan_vien
    FROM acCOUNT a JOIN department d ON a.DepartmentID = d.DepartmentID
    GROUP BY d.DepartmentID
    HAVING d.DepartmentID IN (SELECT DepartmentID
    FROM acCOUNT 
    GROUP BY DepartmentID
    HAVING COUNT(DepartmentID) = (SELECT COUNT(DepartmentID)
    FROM acCOUNT 
    GROUP BY DepartmentID
    HAVING COUNT(*)
    ORDER BY COUNT(DepartmentID) DESC
    LIMIT 1)));
    
    -- CTE
    with QuestiON4_CTE AS(
    SELECT d.DepartmentName, COUNT(d.DepartmentID) AS So_nhan_vien
    FROM acCOUNT a JOIN department d ON a.DepartmentID = d.DepartmentID
    GROUP BY d.DepartmentID
    HAVING d.DepartmentID IN (SELECT DepartmentID
    FROM acCOUNT 
    GROUP BY DepartmentID
    HAVING COUNT(DepartmentID) = (SELECT COUNT(DepartmentID)
    FROM acCOUNT 
    GROUP BY DepartmentID
    HAVING COUNT(*)
    ORDER BY COUNT(DepartmentID) DESC
    LIMIT 1)))
    SELECT * FROM QuestiON4_CTE;
    
-- 
	-- view 
   CREATE VIEW QuestiON5 AS(
    SELECT q.*, a.FullName
    FROM questiON q JOIN acCOUNT a ON q.CreatorID = a.AcCOUNTID
    WHERE substrINg_INdex(a.FullName,' ',1) = "Nguyễn");
    
	-- CTE
    with QuestiON5_CTE AS(
	SELECT q.*, a.FullName
    FROM questiON q JOIN acCOUNT a ON q.CreatorID = a.AcCOUNTID
    WHERE substrINg_INdex(a.FullName,' ',1) = "Nguyễn")
    SELECT * FROM QuestiON5_CTE;


















