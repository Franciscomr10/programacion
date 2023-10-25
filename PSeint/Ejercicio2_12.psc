Algoritmo Ejercicio2_12
	Escribir "Escribe la altura del rombo"
	Leer n
	Para i <- 1 Hasta n Con Paso 1 Hacer
		Para j <- 0 Hasta n - i Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		
		Para j <- 1 Hasta 2 * i - 1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		
		Escribir ""
	Fin Para
	
	Para i<-0 Hasta j+i-n-1 Con Paso 1 Hacer
		Escribir "*" Sin Saltar
	Fin Para
	Escribir " "
	
	Para i <- n Hasta 1 Con Paso -1 Hacer
		Para j <- 0 Hasta n - i Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		
		Para j <- 1 Hasta 2 * i - 1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		
		Escribir ""
	Fin Para
FinAlgoritmo
