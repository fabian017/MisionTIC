Algoritmo RETO1CalculadoraG27
	Definir opcion Como Entero
	Escribir 'Calculadora Reto 1 C1-G27'
	Escribir 'Jose Fabian Jimenez Ovalle'
	Escribir 'Seleccione la operación que quiere hacer'
	Escribir '1. Suma'
	Escribir '2. Resta'
	Escribir '3. Multiplicacion'
	Escribir '4. Division'
	Leer opcion
	Mientras opcion>4 O opcion<1 Hacer // Comprobar que la opción es correcta
		Escribir 'Opcion inválida, digite una opción correcta'
		Leer opcion
	FinMientras
	Si opcion==1 Entonces // Suma
		Escribir 'Escriba los valores a sumar: '
		Leer numero1
		Escribir '+'
		Leer numero2
		suma <- numero1+numero2
		Escribir 'El resultado de la suma es: ',suma
	FinSi
	Si opcion==2 Entonces // Resta
		Escribir 'Escriba los valores a restar: '
		Leer numero1
		Escribir '-'
		Leer numero2
		resta <- numero1-numero2
		Escribir 'El resultado de la resta es: ',resta
	FinSi
	Si opcion==3 Entonces // Multiplicación
		Escribir 'Escriba los valores a multiplicar: '
		Leer numero1
		Escribir '*'
		Leer numero2
		multiplicacion <- numero1*numero2
		Escribir 'El resultado de la multiplicación es: ',multiplicacion
	FinSi
	Si opcion==4 Entonces // División
		Escribir 'Escriba los valores a dividir: '
		Leer numero1
		Escribir '/'
		Leer numero2
		division <- numero1/numero2
		Escribir 'El resultado de la división es: ',division
	FinSi
FinAlgoritmo
