# Saldo inicial de la cuenta
saldo = 1000.00

while True:
    print("\n--- Cajero Automático ---")
    print("1. Ingresar dinero en la cuenta")
    print("2. Retirar dinero")
    print("3. Consultar saldo")
    print("4. Salir")

    # Pedir al usuario que elija una opción
    opcion = input("Seleccione una opción (1-4): ")

    if opcion == "1":        
        # Depositar dinero
        try:
            deposito = float(input("Ingrese la cantidad a depositar: $"))
            if deposito > 0:
                saldo += deposito
                print(f"Depósito exitoso. Su nuevo saldo es: ${saldo:.2f}")
            else:
                print("Error: El monto a depositar debe ser positivo.")
        except ValueError:
            print("Error: Por favor, ingrese un número válido.")

    elif opcion == "2":
         # Retirar dinero
        try:
            retiro = float(input("Ingrese la cantidad a retirar: $"))
            if retiro > 0:
                if retiro <= saldo:
                    saldo -= retiro
                    print(f"Retiro exitoso. Su nuevo saldo es: ${saldo:.2f}")
                else:
                    print("Error: Saldo insuficiente.")
            else:
                print("Error: El monto a retirar debe ser positivo.")
        except ValueError:
            print("Error: Por favor, ingrese un número válido.")

    elif opcion == "3":
               # Consultar saldo
        print(f"\nSu saldo actual es: ${saldo:.2f}")
    elif opcion == "4":
        # Salir del programa
        print("Gracias por usar el cajero automático.")
        break  # Romper el bucle y finalizar el programa

    else:
        # Opción no válida
        print("Opción no válida. Por favor, intente de nuevo.")