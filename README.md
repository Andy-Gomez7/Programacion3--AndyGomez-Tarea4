# Programacion3--AndyGomez-Tarea4

# Andy Delcio Gomez Moya

# Matricula: 1000-6215

# Materia: Programacion 3

# Objetivo:
Aplicar los conocimientos adquiridos sobre programación concurrente, manejo de excepciones y manejo de archivos mediante la implementación de programas prácticos en Java.

---

# Ejercicio 1 - Hilos

## Simulador de Descargas

Desarrolle un programa que simule la descarga de tres archivos al mismo tiempo.

Cada archivo deberá ejecutarse en un hilo independiente y mostrar su progreso en pantalla hasta completar la descarga.

### Ejemplo de salida

```text
Descargando Archivo1...
Descargando Archivo2...
Descargando Archivo3...

Archivo1 20%
Archivo2 20%
Archivo3 20%

...

Archivo1 completado.
Archivo2 completado.
Archivo3 completado.
```

### Requisitos

* Crear una clase que herede de `Thread`.
* Utilizar el método `start()`.
* Utilizar `sleep()` para simular el tiempo de descarga.
* Mostrar el nombre del hilo que realiza la descarga.
* Mostrar el progreso desde 0% hasta 100%.
* Mostrar un mensaje cuando cada descarga finalice.

---

# Ejercicio 2 - Hilos

## Carrera de Corredores

Desarrolle un programa que simule una carrera entre cuatro corredores.

Cada corredor deberá ejecutarse en un hilo independiente y avanzar desde el metro 1 hasta el metro 10.

### Ejemplo de salida

```text
Juan avanzó al metro 1
Pedro avanzó al metro 1
Ana avanzó al metro 1
Carlos avanzó al metro 1
```

Al finalizar:

```text
Juan llegó a la meta.
```

### Requisitos

* Utilizar una clase que herede de `Thread`.
* Utilizar `sleep()` para simular el tiempo entre avances.
* Mostrar el estado inicial y final de cada hilo utilizando `getState()`.
* Mostrar cuál corredor llegó primero a la meta.

---

# Ejercicio 3 - Excepciones

## Validador de Edad

Desarrolle un programa que solicite una edad al usuario.

Si la edad es menor que 18 años, el programa deberá lanzar una excepción personalizada llamada:

```java
EdadInvalidaException
```

### Requisitos

* Crear una excepción personalizada.
* Utilizar `throw`.
* Utilizar `throws`.
* Utilizar `try-catch`.
* Mostrar el mensaje de error utilizando `getMessage()`.

### Ejemplo de salida

```text
Ingrese su edad:
15

Error: Debe ser mayor de edad.
```

---

# Ejercicio 4 - Excepciones

## Calculadora Segura

Desarrolle una calculadora que permita realizar las siguientes operaciones:

```text
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
```

El programa deberá manejar adecuadamente los errores producidos por entradas inválidas.

### Casos a manejar

* División entre cero.
* Entrada de texto cuando se esperan números.

### Ejemplo de salida

```text
Ingrese el primer número:
10

Ingrese el segundo número:
0

Error: No se puede dividir entre cero.
```

### Requisitos

* Utilizar `try-catch-finally`.
* Capturar al menos:

  * `ArithmeticException`
  * `InputMismatchException`
* Mostrar mensajes amigables para el usuario.
* Utilizar `finally` para mostrar:

```text
Proceso finalizado.
```

---

# Ejercicio 5 - Archivos

## Registro de Actividades

Desarrolle un programa que permita registrar actividades realizadas por un usuario utilizando archivos de texto.

El programa deberá mostrar el siguiente menú:

```text
1. Agregar actividad
2. Mostrar actividades
3. Salir
```

### Opción 1 - Agregar actividad

Permite ingresar una actividad y almacenarla en un archivo llamado:

```text
actividades.txt
```

Cada actividad deberá guardarse en una línea diferente.

### Ejemplo

```text
Ingrese una actividad:
Estudiar Java
```

### Opción 2 - Mostrar actividades

Permite leer el archivo y mostrar todas las actividades registradas.

### Ejemplo

```text
Actividades registradas:

Estudiar Java
Hacer tarea de hilos
Leer capítulo 13
```

### Requisitos

* Utilizar `FileWriter` para guardar información.
* Utilizar `FileReader` o `BufferedReader` para leer información.
* Utilizar `try-catch` para manejar errores.
* Mostrar un mensaje amigable si el archivo no existe.
* Permitir agregar múltiples actividades sin borrar las anteriores.
* Crear un menú repetitivo hasta que el usuario seleccione la opción Salir.

---

# Forma de Entrega

Cada estudiante deberá entregar:

* Repositorio GitHub con el código fuente.
* Archivo README.md explicando cómo ejecutar cada ejercicio.
* Capturas de pantalla demostrando la ejecución correcta de los cinco ejercicios.