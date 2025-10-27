// Ejercicio 1: Función que valide una contraseña (mínimo 8 caracteres, 1 número, 1 mayúscula)

function validatePassword(contrasena) {
  // 1. Verificar la longitud
  if (contrasena.length < 8) {
    console.log("ERROR: Es demasiado corta.");
    return false;
  }

  // 2. Verificar el número
  let encontrarNumero = false;
  // Recorremos la contraseña caracter por caracter
  for (let i = 0; i < contrasena.length; i++) {
    let caracter = contrasena[i];
    // Preguntamos si el caracter es un número (0-9).
    // NOTA: '0' <= caracter <= '9' es la forma más "humana" de pensar esto.
    // La función 'isNaN' es la forma sencilla de JS para ver si algo NO es un Número.
    if (!isNaN(parseInt(caracter)) && caracter !== " ") {
      encontrarNumero = true;
      break; // Si encuentra un número, detenemos la búsqueda.
    }
  }

  if (encontrarNumero === false) {
    console.log("ERROR: Le falta un número.");
    return false;
  }

  // 3. Verificar la mayúscula
  let encontrarMayuscula = false;
  // Volvemos a recorrer la contraseña caracter por caracter
  for (let i = 0; i < contrasena.length; i++) {
    let caracter = contrasena[i];
    // Preguntamos si el caracter NO es igual a su versión minúscula
    // y si es una letra (no un número o símbolo).
    if (caracter >= "A" && caracter <= "Z") {
      encontrarMayuscula = true;
      break; // Si encuentra una mayúscula, detenemos la búsqueda.
    }
  }

  if (encontrarMayuscula === false) {
    console.log("ERROR: Le falta una letra mayúscula.");
    return false;
  }

  console.log("¡Contraseña APROBADA!");
  return true;
}

console.log(validatePassword("Abc12345")); // true
console.log(validatePassword("weak")); // false
