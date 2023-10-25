Algoritmo Ejercicio1
	Definir num, res, x Como Entero
	Escribir "Introduzca un número"
	Leer num
	Escribir "Los divisores propios de ", num, " son:" Sin Saltar
	Para x<-1 Hasta num-1 Con Paso 1 Hacer
		Si num%x = 0 Entonces
			Escribir " ", x, ", " Sin Saltar
			res<-x+res
		FinSi
	FinPara
	Escribir "y la suma de los mismos es ", res
FinAlgoritmo
