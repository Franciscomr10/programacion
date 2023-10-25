Algoritmo Ejercicio2_10
	Escribir "Escribe un número"
	Leer n
	m<-0
	Para i <- 1 Hasta n Con Paso 1 Hacer
        Si n % i = 0 Entonces
            m <- m + 1
        FinSi
    FinPara
	
    Si m = 2 Entonces
        Escribir "El número ", n, " es primo."
    Sino
        Escribir "El número ", n, " no es primo."
    FinSi
FinAlgoritmo
