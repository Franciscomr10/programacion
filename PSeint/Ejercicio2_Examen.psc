Algoritmo Ejercicio2
	Definir num, num2, res, res2, x Como Entero
	
	Escribir "Introduzca un número"
	Leer num
	Escribir "Introduce otro número"
	Leer num2
	
	Escribir "Los divisores propios de ", num, " son:" Sin Saltar
	Para x<-1 Hasta num-1 Con Paso 1 Hacer
		Si num%x = 0 Entonces
			Escribir " ", x, ", " Sin Saltar
			res<-x+res
		FinSi
	FinPara
	Escribir "y la suma de los mismos es ", res
	
	Escribir "Los divisores propios de ", num2, " son:" Sin Saltar
	Para x<-1 Hasta num2-1 Con Paso 1 Hacer
		Si num2%x = 0 Entonces
			Escribir " ", x, ", " Sin Saltar
			res2<-x+res2
		FinSi
	FinPara
	Escribir "y la suma de los mismos es ", res2
	
	Si res2 = num y res = num2 Entonces
		Escribir "Los dos números SÍ son amigos"
	SiNo
		Escribir "Los dos números NO son amigos"
	FinSi
	
FinAlgoritmo
