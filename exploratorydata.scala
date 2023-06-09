%sql

select count(class), 
CASE 
	WHEN class = "e" THEN "Edible"
	ELSE "Poisonous"
END AS CLASSES,
bruises from MushroomData group by CLASSES, bruises;  
