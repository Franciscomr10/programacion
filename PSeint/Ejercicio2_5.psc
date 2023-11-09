Algoritmo Ejercicio2_5
	Escribir "Escribe un número"
	Leer num
	num1<-1
	num2<-0
	Para n<-1 Hasta num Con Paso 1 Hacer
		suma<-num1+num2
		num1<-num2
		num2<-suma
		Escribir suma
	Fin Para
FinAlgoritmo