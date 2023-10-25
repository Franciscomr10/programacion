Algoritmo Ejercicio2_7
	Escribir "Introduce la altura de la piramide"
	Leer n
	Para i <- 1 Hasta n Con Paso 1 Hacer
		Para j <- 1 Hasta n - i Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		
		Para j <- 1 Hasta 2 * i - 1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		
		Escribir ""
	Fin Para
FinAlgoritmo
