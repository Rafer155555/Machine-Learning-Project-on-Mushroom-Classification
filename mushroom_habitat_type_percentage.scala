%sql

select count(habitat), 
CASE 
	WHEN class = "e" THEN "Edible"
	ELSE "Poisonous"
END AS CLASSES,
CASE 
	WHEN habitat = "g" THEN "grasses"
	WHEN habitat = "l" THEN "leaves"
	WHEN habitat = "m" THEN "meadows"
	WHEN habitat = "p" THEN "paths"
	WHEN habitat = "u" THEN "urban"
	WHEN habitat = "w" THEN "waste"
	ELSE "wood"
END AS Habitat
from MushroomData group by habitat, class
