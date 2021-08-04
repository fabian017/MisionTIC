import random

def run():
    aleatorio = random.randint(25,25)
    vidas = 5
    for contador in range(0,5):
        if vidas >= 1:
            numero = int(input(f"Tiene {vidas} vidas. Ingrese un numero: "))
            if numero > aleatorio:
                print("MAS PEQUEÑO")
                vidas -= 1
            elif numero < aleatorio:
                print("MAS GRANDE")
                vidas -= 1
            elif numero == aleatorio:
                print("GANASTE")
                break
        if vidas == 0:
            if numero != aleatorio:
                print("PERDISTE")
                break
        
if __name__ == '__main__':
    print("Videojuego G-27")
    print("Jose Fabian Jimenez Ovalle")
    jugar = input("¿Desea jugar? ")
    if jugar.upper() == "SI" or jugar.upper() == "S":
        run()
    elif jugar.upper() == "NO" or jugar.upper()=="N":
        print("Fin del juego")
    else:
        while jugar.upper() != "SI" or jugar.upper() != "S":
            jugar = input("Opcion inválida. ¿Desea jugar? ")
            if jugar == "SI" or jugar == "sI" or jugar == "Si" or jugar == "si" or jugar == "S" or jugar == "s":
                run()
                break
    
        
