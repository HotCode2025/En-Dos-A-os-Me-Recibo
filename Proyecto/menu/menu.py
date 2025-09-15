opcion = 1
while opcion != 6:
    print("Menu principal")
    print("1. Calculadora")
    print("2. Gestor de notas")
    print("3. Adivina el numero")
    print("4. Sistema de ventas")
    print("5. Conversor de unidades")
    print("6. Salir")
    print("")

    opcion = input("Digite la opcion deseada: ")

    if opcion == "1":
        print("Calculadora")
    elif opcion == "2":
        print("Gestor de notas")
    elif opcion == "3":
        print("Adivina el numero")
    elif opcion == "4":
        print("Sistema de ventas")
    elif opcion == "5":
        print("Conversor de unidades")
    elif opcion == "6":
        print("Salir")
    else:
        print("Opcion no valida")      