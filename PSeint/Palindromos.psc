Algoritmo Palindromos
	Repetir
	Escribir "Escribe una frase y te diré si es palíndroma o no"
	Leer n
	Hasta Que Longitud(n)>1
	
	Definir izq, der Como Entero
	Definir es_palindromo Como Logico
	izq<- 1
	der<- Longitud(n)
	es_palindromo <- Verdadero
	
	Repetir
		Mientras Subcadena(n,izq,izq)= " " Hacer
			izq <- izq + 1
		FinMientras
		Mientras Subcadena(n,der,der)= " " Hacer
			der <- der - 1
		Fin Mientras
		Si Subcadena(n,izq,izq)<> Subcadena(n,der,der) Entonces
			es_palindromo <- Falso
		FinSi
		izq<- izq + 1
		der<- der - 1
	Hasta Que izq>=der o es_palindromo = Falso
	
	Si es_palindromo = Falso Entonces
		Escribir "La frase ", n, " no es palíndromo"
	SiNo
		Escribir "La frase ", n, " es palíndromo"
	FinSi
FinAlgoritmo
