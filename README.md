# Modificación Dinámica de Componentes (Ejercicio 17)

Este proyecto ilustra el principio básico de reactividad en interfaces gráficas, demostrando cómo la interacción con un control de entrada (botón) puede alterar el estado visual de un control de salida (etiqueta) en tiempo real.

## 🚀 Funcionalidades
* **Interactividad Básica:** Utiliza un botón como disparador de acciones.
* **Mutación de Estado UI:** Cambia el contenido de texto de una etiqueta (`Label`) de forma dinámica tras la interacción del usuario.
* **Diseño Minimalista:** Emplea una estructura vertical simple para presentar los elementos de forma clara y directa.

## 🛠️ Estructura técnica
El código se centra en la manipulación de propiedades dentro del hilo de la interfaz de usuario:
* **`setText(String)`**: Método fundamental llamado dentro del manejador de eventos para actualizar el grafo de escena (*Scene Graph*) forzando un redibujado de la etiqueta.
* **Gestión de Eventos con Lambdas**: Emplea una expresión lambda `e -> { ... }` en el método `setOnAction` para definir la respuesta al clic de forma concisa.
* **Layout `VBox`**: Actúa como contenedor raíz de la escena, apilando la etiqueta y el botón verticalmente en el centro del flujo de la ventana.
* **Ciclo de Vida Simple**: Se establece un tamaño de ventana de 300x200 píxeles, adecuado para un ejemplo de prueba de concepto (Proof of Concept).