Funcion res <- rombo1 ( altura )
	Para i <- 1 Hasta altura Con Paso 1 Hacer
		Para j <- 0 Hasta altura - i Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		
		Para j <- 1 Hasta 2 * i - 1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		
		Escribir ""
	Fin Para
	Para i<-0 Hasta j+i-altura-1 Con Paso 1 Hacer
		Escribir "*" Sin Saltar
	Fin Para
	Escribir " "
Fin Funcion
Funcion res<-rombo2 (altura)
	Para i <- altura Hasta 1 Con Paso -1 Hacer
		Para j <- 0 Hasta altura - i Con Paso 1 Hacer
			Escribir " " Sin Saltar
		Fin Para
		
		Para j <- 1 Hasta 2 * i - 1 Con Paso 1 Hacer
			Escribir "*" Sin Saltar
		Fin Para
		
		Escribir ""
	Fin Para
FinFuncion
Algoritmo Ejercicio2_12_funciones
	Escribir "dime la altura"
	Leer altura
	Escribir rombo1(altura) Sin Saltar
	Escribir rombo2(altura)
FinAlgoritmo
