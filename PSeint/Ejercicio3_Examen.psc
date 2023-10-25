Funcion res <- rectangulo ( base, altura )
	
	Definir x, j Como Entero
	Para x<-1 Hasta altura Con Paso 1 Hacer
		Para j<-1 Hasta base Con Paso 1 Hacer
			Si j>1 y j<base y x>1 y x<altura Entonces
				Escribir " " Sin Saltar
			SiNo
				Escribir "*" Sin Saltar
			FinSi
		FinPara
		Escribir ""
	FinPara
	
Fin Funcion

Algoritmo Ejercicio3
	Definir base, altura, temp, p Como Entero
	base<-0
	altura<-0
	Repetir
	Escribir "1. Introduzca la dimesión de la base del rectángulo"
	Escribir "2. Introduzca la dimensión de la altura del rectángulo"
	Escribir "3. Pinta el rectángulo"
	Escribir "4. Intercambia base por altura"
	Escribir "5. Salir"
	Leer p
	
	// En las distintas opciones que he puesto la intrucción Esperar ha sido para que el menú no salga tan rápido para
	// que así el usuario tenga un cierto tiempo para ver la respuesta del programa con claridad
	// También he puesto que pegue un salto de linea al final de cada opción para que sea más bonito a la vista
	
	Segun p Hacer
		1:
			Escribir ""
			Escribir "Introduce la base del rectángulo"
			Leer base
			Escribir "La base del rectángulo es: ", base
			Esperar 1 segundos
			Escribir ""
		2:
			Escribir ""
			Escribir "Introduce la altura del rectángulo"
			Leer altura
			Escribir "La altura del rectangulo es: ", altura
			Esperar 1 Segundos
			Escribir ""
		3:
			Escribir ""
			// Incluí También los números negativos ya que entonces solo dejaría el espacio que ocupa el rectángulo
			Si altura<=0 o base<=0 Entonces
				Escribir "Los valores de altura y base no pueden ser 0 o números negativos"
			SiNo
				Escribir "El rectángulo dibujado tiene una base de ", base, " y una altura de ", altura
				Escribir rectangulo(base, altura)
			FinSi
			Esperar 1 Segundos
			Escribir ""
		4:
			Escribir ""
			temp<-base
			base<-altura
			altura<-temp
			Escribir "Se han intercambiado los valores de base y altura por lo que, base = ", base, " y altura = ", altura
			Esperar 1 Segundos
			Escribir ""
		5:
			Escribir ""
			Escribir "Saliendo del programa"
		De Otro Modo:
			Escribir "No has introducido una opción válida"
			Esperar 1 Segundos
			Escribir ""
	Fin Segun
Hasta Que p=5
FinAlgoritmo
