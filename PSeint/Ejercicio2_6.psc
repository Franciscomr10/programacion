Algoritmo Ejercicio2_6
	Escribir  "Escribe un número"
	Leer n
	factor<-1
	Para x<-1 Hasta n Con Paso 1 Hacer
		factor<-factor*x
	Fin Para
	Escribir "El factorial de ", n, " es ", factor
FinAlgoritmo


//. Factorial de n = (n)*(n-1)*(n-2)*...*(1).