USE testing_system_ASsignment;

-- 1
SELECT * FROM `account` ac 
JOIN department de 
ON ac.departmentID = de.departmentID;


-- 2
SELECT *
FROM `account` ac 
JOIN department de 
ON ac.departmentID = de.departmentID
JOIN positiON po 
ON ac.positiONID = po.positiONID
WHERE ac.CreateDate > '2020/12/20';

-- 3
SELECT *
FROM `account` ac 
JOIN department de 
ON ac.departmentID = de.departmentID
JOIN positiON po 
ON ac.positiONID = po.positiONID
WHERE po.PositiONName = 'Dev';

-- 4
SELECT de.DepartmentName FROM `account` ac 
JOIN department de 
ON ac.DepartmentID = de.DepartmentID
GROUP BY de.DepartmentID
HAVING COUNT(de.DepartmentID) >3;

-- 5
SELECT  q.QuestiONID, q.CONtent
FROM examquestiON e JOIN questiON q
ON e.QuestiONID =  q.QuestiONID 
GROUP BY q.QuestiONID 
HAVING  q.QuestiONID IN(SELECT QuestiONID
FROM examquestiON 
GROUP BY QuestiONID
HAVING count(QuestiONID) = (SELECT count(QuestiONID) FROM examquestiON GROUP BY QuestiONID limit 1));

-- 6
SELECT c.categoryID, c.categoryName, count(c.categoryID) AS so_lan
FROM questiON q JOIN categoryquestiON c
ON q.categoryID = c.categoryID
GROUP BY c.categoryID;

-- 7
SELECT q.QuestiONID, qu.CONtent, count(q.questiONID) AS so_lan
FROM examquestiON q JOIN exam e
ON q.examID = e.examID
JOIN questiON qu ON q.QuestiONID = qu.QuestiONID
GROUP BY q.questiONID;
 
-- 8
SELECT q.QuestiONID, q.CONtent, count(q.questiONID) AS so_lan
FROM answer a JOIN questiON q
ON q.QuestiONID = a.QuestiONID
GROUP BY q.QuestiONID;

-- 9 
SELECT ga.GroupID, g.GroupName, count(ga.GroupID) AS So_thanh_vien
FROM groupaccount ga JOIN `group` g
ON ga.GroupID = g.GroupID
GROUP BY ga.GroupID;

-- 10
SELECT p.PositiONID, count(a.PositiONID) AS so_nhan_vien
FROM `account` a JOIN positiON p
ON a.PositiONID = p.PositiONID
GROUP BY a.PositiONID
HAVING count(a.PositiONID) = (SELECT MIN(solan) 
FROM (SELECT count(p.PositiONID) AS solan
FROM `account` a JOIN positiON p
ON a.PositiONID = p.PositiONID
GROUP BY a.PositiONID) AS c);

-- 11
SELECT de.DepartmentID, de.DepartmentName, po.PositiONName, count(po.PositiONName) AS so_nhan_vien
FROM department de left JOIN `account` ac ON de.DepartmentID = ac.DepartmentID
left JOIN positiON po ON ac.PositiONID = po.PositiONID
GROUP BY po.PositiONID,de.DepartmentID;

-- 12
SELECT q.QuestiONID, q.CONtent, c.CategoryName, a.FullName AS Nguoi_tao, an.CONtent
FROM questiON q JOIN typequestiON t ON q.TypeID = t.TypeID
	JOIN categoryquestiON c ON c.CategoryID = q.CategoryID
    JOIN `account` a ON a.AccountID = q.CreatorID
    JOIN answer an ON q.QuestiONID = an.QuestiONID AND an.isCorrect = 1;

-- 13
SELECT t.TypeName, count(t.TypeID) AS So_luONg
FROM questiON q JOIN typequestiON t ON q.TypeID = t.TypeID
GROUP BY t.TypeID;

-- 14
SELECT g.GroupName
FROM `group` g left JOIN `groupaccount` ga ON g.GroupID = ga.GroupID
where ga.GroupID is null;

-- 16 
SELECT q.CONtent
FROM questiON q left JOIN answer an ON q.QuestiONID = an.QuestiONID
where an.AnswerID is null;

-- 17
	-- a
	SELECT * FROM `account` a JOIN groupaccount ga ON a.AccountID = ga.AccountID AND ga.GroupID=1;
    -- b
	SELECT * FROM `account` a JOIN groupaccount ga ON a.AccountID = ga.AccountID AND ga.GroupID=2;
	-- c
	SELECT * FROM `account` a JOIN groupaccount ga ON a.AccountID = ga.AccountID AND ga.GroupID=1
    uniON
    SELECT * FROM `account` a JOIN groupaccount ga ON a.AccountID = ga.AccountID AND ga.GroupID=2;
    
-- 18 
	-- a
    SELECT * FROM `group` g JOIN groupaccount ga ON g.GroupID = ga.GroupID
    GROUP BY g.GroupID
    HAVING count(g.GroupID)>5;
    -- b
    SELECT * FROM `group` g JOIN groupaccount ga ON g.GroupID = ga.GroupID
    GROUP BY g.GroupID
    HAVING count(g.GroupID)<7;
    -- c
	SELECT * FROM `group` g JOIN groupaccount ga ON g.GroupID = ga.GroupID
    GROUP BY g.GroupID
    HAVING count(g.GroupID)>5
    uniON
    SELECT * FROM `group` g JOIN groupaccount ga ON g.GroupID = ga.GroupID
    GROUP BY g.GroupID
    HAVING count(g.GroupID)<7;