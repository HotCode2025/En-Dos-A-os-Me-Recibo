import math

def desea_otro_calculo():
    while True:
        respuesta = input("¿Desea realizar otra operación? (S/N): ").strip().upper()
        if respuesta == "S":
            return True
        elif respuesta == "N":
            return False
        else:
            print("La opción marcada es incorrecta. Debe ser 'S' o 'N'.")

def formatear_numero(num):
    if num == int(num):
        return str(int(num))
    else:
        return str(num)

def calculadora():
    continuar = True

    while continuar:
        print("\nIndica el tipo de operación que deseas realizar:")
        print("1: Suma")
        print("2: Resta")
        print("3: División")
        print("4: Multiplicación")
        print("5: Raíz Cuadrada")
        print("6: Raíz Cúbica")
        print("7: Exponencial")
        print("0: Salir")

        opcion = input("Ingrese una opción: ")

        if opcion == "0":
            print("Saliendo de la calculadora.")
            break

        elif opcion == "1":
            num1 = float(input("Digite el primer número: "))
            num2 = float(input("Digite el segundo número: "))
            resultado = num1 + num2
            print(f"La suma de {formatear_numero(num1)} + {formatear_numero(num2)} es: {formatear_numero(resultado)}")

        elif opcion == "2":
            num1 = float(input("Digite el primer número: "))
            num2 = float(input("Digite el segundo número: "))
            resultado = num1 - num2
            print(f"La resta de {formatear_numero(num1)} - {formatear_numero(num2)} es: {formatear_numero(resultado)}")

        elif opcion == "3":
            num1 = float(input("Digite el primer número: "))
            num2 = float(input("Digite el segundo número: "))
            if num2 == 0:
                print("No se puede dividir entre cero.")
            else:
                resultado = num1 / num2
                print(f"La división de {formatear_numero(num1)} / {formatear_numero(num2)} es: {formatear_numero(resultado)}")

        elif opcion == "4":
            num1 = float(input("Digite el primer número: "))
            num2 = float(input("Digite el segundo número: "))
            resultado = num1 * num2
            print(f"La multiplicación de {formatear_numero(num1)} * {formatear_numero(num2)} es: {formatear_numero(resultado)}")

        elif opcion == "5":
            num1 = float(input("Digite el número: "))
            if num1 < 0:
                print("No se puede calcular la raíz cuadrada de un número negativo.")
            else:
                resultado = math.sqrt(num1)
                print(f"La raíz cuadrada de {formatear_numero(num1)} es: {formatear_numero(resultado)}")

        elif opcion == "6":
            num1 = float(input("Digite el número: "))
            if num1 < 0:
                resultado = -((-num1) ** (1/3))
            else:
                resultado = num1 ** (1/3)
            print(f"La raíz cúbica de {formatear_numero(num1)} es: {formatear_numero(resultado)}")

        elif opcion == "7":
            num1 = float(input("Digite el número base: "))
            num2 = float(input("Digite el exponente: "))
            resultado = num1 ** num2
            print(f"{formatear_numero(num1)} elevado a {formatear_numero(num2)} es: {formatear_numero(resultado)}")

        else:
            print("Opción incorrecta. Intenta de nuevo.")
            continue 

        continuar = desea_otro_calculo()

if __name__ == "__main__":
    calculadora()

