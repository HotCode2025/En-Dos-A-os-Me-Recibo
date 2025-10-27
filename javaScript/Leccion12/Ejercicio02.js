// Ejercicio 2: Crear un sistema simple de gestión de tareas

function createTaskManager() {
  // Array donde guardaremos todos los objetos de tareas.
  let tasks = [];

  // Un contador simple para asignar un ID único a cada nueva tarea.
  let nextId = 1;

  return {
    // --- 1. AÑADIR TAREA ---
    addTask: function (descripcion) {
      // Creamos el objeto de la nueva tarea.
      const newTask = {
        id: nextId, // Usamos el ID del contador
        descripcion: descripcion, // El texto que nos pasaron
        completada: false, // Siempre empieza como NO completada
      };

      tasks.push(newTask); // Añadimos el nuevo objeto al array 'tasks'.
      nextId++; // Incrementamos el contador para la próxima tarea.

      console.log(`TAREA #${newTask.id} añadida: "${descripcion}"`);
    },

    // --- 2. COMPLETAR TAREA ---
    completeTask: function (taskId) {
      // Buscamos la tarea por su ID. La forma más sencilla es usar .find()
      const task = tasks.find((t) => t.id === taskId);

      if (task) {
        // Si la tarea existe, cambiamos la propiedad 'completada'.
        task.completada = true;
        console.log(
          `TAREA #${taskId} marcada como completada: "${task.descripcion}"`
        );
      } else {
        // Si no se encuentra.
        console.log(`ERROR: No se encontró la tarea con ID ${taskId}.`);
      }
    },

    // --- 3. LISTAR TAREAS ---
    listTasks: function () {
      console.log("\n--- LISTA DE TAREAS ---");
      if (tasks.length === 0) {
        console.log("No hay tareas pendientes.");
        return;
      }

      // Recorremos el array de tareas para mostrarlas.
      tasks.forEach((task) => {
        // Una forma sencilla de mostrar el estado
        const estado = task.completada ? "[COMPLETADA]" : "[PENDIENTE]";
        console.log(`${estado} (ID: ${task.id}) - ${task.descripcion}`);
      });
      console.log("-----------------------");
    },
  };
}

// --- Uso de Ejemplo ---

const myTasks = createTaskManager();

// Uso de addTask
myTasks.addTask("Aprender JavaScript"); // ID 1
myTasks.addTask("Hacer ejercicio"); // ID 2
myTasks.listTasks();

// Uso de completeTask
myTasks.completeTask(2); // Completar "Hacer ejercicio"

myTasks.listTasks(); // Verificar los cambios
