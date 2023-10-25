Algoritmo Ejercicio2_5
	Escribir "Escribe un número"
	Leer num
	m<-1
	x<-0
	Para n<-1 Hasta num Con Paso 1 Hacer
		l<-m+x
		m<-x
		x<-l
		Escribir l
	Fin Para
FinAlgoritmo