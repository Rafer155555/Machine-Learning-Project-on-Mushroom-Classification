%sql

select count(capcolor),
CASE 
	WHEN class = "e" THEN "Edible"
	ELSE "Poisonous"
END AS CLASSES,
CASE 
	WHEN capcolor = "n" THEN "Brown"
	WHEN capcolor = "b" THEN "Buff"
	WHEN capcolor = "c" THEN "Cinnamon"
	WHEN capcolor = "g" THEN "Gray"
	WHEN capcolor = "r" THEN "Green"
	WHEN capcolor = "p" THEN "Pink"
	WHEN capcolor = "u" THEN "Purple"
	WHEN capcolor = "e" THEN "Red"
	WHEN capcolor = "w" THEN "White"
	ELSE "Yellow"
END AS ColorOfCap 
from MushroomData group by capcolor,class order by count(capcolor) desc;
