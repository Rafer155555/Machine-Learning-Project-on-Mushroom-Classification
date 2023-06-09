%sql

select count(population), 
CASE 
	WHEN population = "a" THEN "abundant"
	WHEN population = "c" THEN "clustered"
	WHEN population = "n" THEN "numerous"
	WHEN population = "s" THEN "scattered"
	WHEN population = "v" THEN "several"
	ELSE "solitary"
END AS Population 
from MushroomData group by Population; 
