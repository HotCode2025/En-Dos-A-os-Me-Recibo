1. Manipulación de Datos (Data Manipulation) 
Funciones centradas en la transformación, validación o subselección de información.

calculateTotalPrice() (Calcular Precio Total):
    Proceso: Suma los precios y cantidades de varios ítems.

    Salida: Devuelve un único valor numérico (el total).

    Operandos: Requiere una lista de objetos o valores de ítems.

    Lógica: Puede incluir cálculos de impuestos o descuentos.

    Errores: Debe manejar entradas no numéricas o nulas.

formatUserInput() (Formatear Entrada del Usuario):
    Propósito: Limpiar y estandarizar el texto de un usuario.

    Tareas: Puede recortar espacios en blanco (trim).

    Estandarización: Convierte el texto a un caso específico (ej: todo a minúsculas).

    Seguridad: A veces incluye sanitización básica.

    Salida: Devuelve la cadena de texto modificada y limpia.

validateEmailAddress() (Validar Dirección de Correo):
    Objetivo: Verifica que un string cumpla con el formato de email.

    Reglas: Comprueba la presencia del símbolo @ y el dominio.

    Implementación: Suele usar Expresiones Regulares (Regex).

    Salida: Devuelve un valor booleano (true/false).

    Flujo: Es crucial antes de enviar datos de registro o inicio de sesión.

convertToCamelCase() (Convertir a "Camel Case"):
    Propósito: Aplica la convención de nomenclatura camelCase.

    Regla: Convierte la primera letra de cada palabra subsiguiente en mayúscula.

    Origen: Típicamente recibe texto con guiones (kebab-case) o guiones bajos (snake_case).

    Ejemplo: Transforma nombre-usuario a nombreUsuario.

    Uso: Estándariza nombres de variables o claves de objeto.

filterActiveUsers() (Filtrar Usuarios Activos):
    Proceso: Examina una lista completa de usuarios.

    Criterio: Solo selecciona usuarios con el atributo isActive en verdadero.

    Salida: Devuelve un NUEVO array (subconjunto).

    Inmutabilidad: La lista original de usuarios no se modifica.

    Eficiencia: Mejora el rendimiento al reducir el conjunto de datos a procesar.

2. Eventos o Interacción (Events/Interaction) 
Funciones que responden a acciones del usuario, al estado de la interfaz o al flujo de la aplicación.

handleButtonClick() (Manejar Clic del Botón):
    Gatillo: Se ejecuta al ocurrir un evento de clic en un elemento.

    Propósito: Contiene la lógica principal que el clic debe activar.

    Tareas: Puede iniciar operaciones, alternar visibilidad o llamar a APIs.

    Entrada: A menudo recibe el objeto del evento (event).

    Interfaz: Es la clave para la interactividad inmediata de la UI.

onFormSubmit() (Al Enviar el Formulario):
    Gatillo: Se activa cuando el usuario intenta enviar un formulario.

    Prioridad: Su primera tarea es la validación final de los campos.

    Control: Debe llamar a preventDefault() para evitar el envío clásico del navegador.

    Comunicación: Si es válido, inicia la operación CRUD (Crear/Actualizar) con la API.

    Retroalimentación: Muestra mensajes de éxito o error al usuario.

toggleDarkMode() (Alternar Modo Oscuro):
    Función: Invierte el tema de color (claro ↔ oscuro) de la interfaz.

    Mecanismo: Cambia una clase CSS (ej: dark-mode) en el elemento raíz del documento.

    Estado: Debe guardar la preferencia del usuario (ej: en localStorage).

    Uso: Es una función de UX/accesibilidad muy solicitada.

    Lógica: Simplemente alterna un estado booleano de la aplicación.

updateProgressBar() (Actualizar Barra de Progreso):
    Propósito: Refleja el avance visual de una tarea.

    Entrada: Recibe un valor numérico (porcentaje).

    Mecanismo: Modifica la propiedad de estilo (width) o el atributo (value) de la barra.

    Uso: Común durante cargas, descargas o pasos de un proceso largo.

    Función: No ejecuta la tarea, solo muestra su estado.

initializeApp() (Inicializar Aplicación):
    Propósito: Es el punto de entrada y configuración inicial de la app.

    Configuración: Carga settings, variables de entorno o tokens.

    Autenticación: Verifica si existe una sesión de usuario activa.

    Montaje: Inicia el renderizado de la primera vista o componente raíz.

    Flujo: Se ejecuta solo una vez al cargar la aplicación.

3. Operaciones CRUD (CRUD Operations) 
Funciones que interactúan con la capa de persistencia de datos (API o base de datos).

createNewUser() (Crear Nuevo Usuario) - Create:
    Método: Utiliza una petición HTTP POST.

    Datos: Recibe la información (nombre, email, etc.) a insertar.

    Resultado: Devuelve el nuevo objeto con su ID único asignado.

    Seguridad: La contraseña debe ser hasheada antes de guardarse.

    Uso: Se activa al registrar un usuario.

fetchUserData() (Obtener Datos del Usuario) - Read:
    Método: Utiliza una petición HTTP GET.

    Asíncrono: Es casi siempre una operación que requiere espera.

    Propósito: Recupera el estado actual de los datos para la interfaz.

    Identificador: Requiere el ID del usuario o un token de sesión.

    Función: No modifica los datos; solo los consulta.

updateUserProfile() (Actualizar Perfil de Usuario) - Update:
    Método: Utiliza petición PUT o PATCH.

    Identificador: Debe incluir el ID para especificar qué registro cambiar.

    Datos: Envía la información modificada del usuario.

    Seguridad: Requiere verificación de permisos de edición.

    Flujo: Sincroniza los cambios del frontend con el backend.

deleteUserAccount() (Eliminar Cuenta de Usuario) - Delete:
    Método: Utiliza una petición HTTP DELETE.

    Alerta: Debe ser precedido por una confirmación de seguridad al usuario.

    Permanencia: Elimina el registro y datos asociados permanentemente.

    Flujo: Después del éxito, suele cerrar la sesión o redirigir al login.

    Uso: Es el final del ciclo de vida de un dato.

4. Utilidades (General Utilities) 
Funciones de soporte general, reusables y sin lógica específica de negocio.

generateRandomId() (Generar ID Aleatorio):
    Propósito: Crea una cadena única de caracteres o números.

    Uso: Asigna identificadores a nuevos objetos o elementos del DOM.

    Algoritmo: Idealmente usa estándares como UUID/GUID.

    Salida: El ID debe tener una alta probabilidad de ser único.

    Estado: Es una función pura (no usa ni modifica estado externo).

formatCurrency() (Formatear Moneda):
    Propósito: Muestra un número con formato monetario estándar.

    Mecanismo: Agrega el símbolo de la divisa (ej: $).

    Localización: Usa la configuración regional para separadores de miles/decimales.

    Salida: Devuelve una cadena de texto con el formato listo.

    Función: No cambia el valor numérico subyacente.

debounceSearch() (Retrasar Búsqueda):
    Concepto: Es una técnica de optimización de rendimiento.

    Mecanismo: Limita la frecuencia de ejecución de la función envuelta.

    Uso: Fundamental en campos de búsqueda (input).

    Flujo: Solo se ejecuta después de que haya pasado un tiempo sin que se haya vuelto a llamar.

    Objetivo: Evita sobrecargar el servidor con peticiones excesivas.

sanitizeInput() (Sanitizar Entrada):
    Seguridad: Elimina o escapa código potencialmente malicioso de una cadena.

    Riesgo: Previene ataques de Cross-Site Scripting (XSS).

    Proceso: Remueve etiquetas HTML peligrosas (ej: <script>).

    Uso: Debe aplicarse a toda entrada de usuario antes de mostrarla o guardarla.

    Rol: Es una capa de seguridad esencial.

checkPermissions() (Comprobar Permisos):
    Seguridad: Determina si el usuario tiene autorización para realizar una acción.

    Entrada: Recibe el rol o ID del usuario y el permiso requerido.

    Control: Controla el flujo de la aplicación (ej: oculta botones).

    Salida: Devuelve un valor booleano (true/false).

    Ubicación: Se ejecuta tanto en frontend para la UI, como en el servidor para la validación final.