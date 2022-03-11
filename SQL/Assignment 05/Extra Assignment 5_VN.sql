
-- Ex 1: SubStrINg
-- 1
SELECT a.Name
FROM product a 
WHERE a.ProductSubcategoryID IN (SELECT b.ProductSubcategoryID FROM  Productsubcategory b WHERE b.Name = "Saddles");

-- 2 
SELECT a.Name
FROM product a 
WHERE a.ProductSubcategoryID IN (SELECT b.ProductSubcategoryID FROM  Productsubcategory b WHERE b.Name IN ("Bottles and Cages", "BottON Brackets")) and substrINg_INdex(substrINg_INdex(a.Name,' ',2),' ',-1) like "Bo%";

-- 3
SELECT z.Name
FROM product z
WHERE z.ListPrice = (SELECT MIN(y.ListPrice) FROM (SELECT a.ListPrice
FROM product a 
WHERE a.ProductSubcategoryID IN (SELECT b.ProductSubcategoryID FROM  Productsubcategory b WHERE b.Name ="TourINg Bikes") ) AS y);

-- Ex 2: JOIN
-- 1
SELECT c.Name AS Country, s.Name AS ProvINce
FROM stateprovINce s JOIN countryregiON c ON s.CountryRegiONCode = c.CountryRegiONCode;

-- 2
SELECT c.Name AS Country, s.Name AS ProvINce
FROM stateprovINce s JOIN countryregiON c ON s.CountryRegiONCode = c.CountryRegiONCode
WHERE c.Name = "Canada" or c.Name = "Germany";

-- 3
SELECT ss.SalesOrderID, ss.OrderDate, s.SalesPersONID, s.SalesPersONID AS BusINessEntityID, s.BONus, s.SalesYTD
FROM  salespersON s JOIN salesorderheader ss ON s.TerritoryID = ss.TerritoryID;

-- 4
SELECT ss.SalesOrderID, ss.OrderDate, e.Title AS Jobtitle, s.BONus, s.SalesYTD
FROM  salespersON s 
JOIN salesorderheader ss ON s.TerritoryID = ss.TerritoryID
JOIN employee e ON e.EmployeeID = s.SalesPersONID;
