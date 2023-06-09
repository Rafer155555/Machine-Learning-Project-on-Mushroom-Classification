%sql

select count(odor), 
CASE 
	WHEN class = "e" THEN "Edible"
	ELSE "Poisonous"
END AS CLASSES,
CASE 
	WHEN odor = "a" THEN "almond"
	WHEN odor = "l" THEN "anise"
	WHEN odor = "c" THEN "creosote"
	WHEN odor = "y" THEN "fishy"
	WHEN odor = "f" THEN "foul"
	WHEN odor = "m" THEN "musty"
	WHEN odor = "n" THEN "none"
	WHEN odor = "p" THEN "pungent"
	ELSE "spicy"
END AS odor 
from MushroomData group by odor, class order by count(odor) desc;  
