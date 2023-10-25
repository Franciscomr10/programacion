Algoritmo Ejercicio2_8
	Escribir "Introduce la altura de la piramide"
	Leer n
	Para i <- n Hasta 1 Con Paso -1 Hacer
		Para j <- 1 Hasta n - i Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		
		Para j <- 1 Hasta 2 * i - 1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		
		Escribir ""
	Fin Para
FinAlgoritmo
