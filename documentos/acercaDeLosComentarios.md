# Comentarios en código

## ¿Por qué?

||||
|-|-|-|
El código se escribe una vez y se lee decenas de veces. Cada vez que un desarrollador abre un archivo, debe comprender qué hace el código para modificarlo, depurarlo o extenderlo.|Históricamente, los comentarios surgieron como solución a código incomprensible: si el código no se explica por sí mismo, se añade texto explicativo. Esta solución genera un problema mayor: ahora se requiere mantener dos representaciones del mismo concepto: el código ejecutable y su descripción en lenguaje natural.|El código evoluciona. Los comentarios, frecuentemente, no. Esta divergencia genera confusión, errores y pérdida de tiempo buscando la verdad entre lo que el código hace y lo que el comentario dice que hace.

## ¿Qué?

Un comentario es texto no ejecutable insertado en código fuente que pretende explicar qué hace el código, por qué lo hace o cómo lo hace.

Los comentarios no son compilados, no son probados y no generan errores cuando se desactualizan. Esta característica los convierte en documentación de segunda clase: opcional, no verificable y frecuentemente incorrecta.

## ¿Para qué?

La ausencia de comentarios fuerza una única representación de la lógica: el código mismo. Esto obliga a:

|||
|-|-|
Nombrado descriptivo|Variables, métodos y clases deben explicar su propósito mediante sus nombres
Métodos pequeños|Funciones que hacen una cosa y la hacen bien, con nombre que describa exactamente qué hacen
Código auto-documentado|La estructura del código revela su intención sin necesidad de explicación adicional

El objetivo no es eliminar toda comunicación escrita sobre el código, sino concentrarla donde realmente aporta valor: nombres claros, estructura lógica y, cuando sea estrictamente necesario, comentarios que expliquen el *por qué* de decisiones no obvias.

## ¿Cómo?

### Taxonomía de comentarios

<div align=center>

|👍|😐|💩|
|-|-|-|
|Comentario aclaratorio|Comentario legal|Comentarios redundantes|
||Comentario esporádico y "oportuno"|Comentarios de sección|
|||Comentarios no mantenidos|
|||Comentarios excesivos|
|||Comentarios como documentación|
|||Comentarios confusos|
|||Comentarios inexactos|
|||Comentarios de atribución|
|||Código comentado|

</div>

### Comentario aceptable

#### Comentario aclaratorio

```java
// Regex para validar email según RFC 5322 simplificado
String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
```

Justificable cuando la alternativa sería crear abstracción excesiva para código que se ejecuta una vez. Usar con extrema moderación.

### Comentarios tolerables

#### Comentario legal

```java
/*
 * Copyright (c) 2024 Universidad Europea del Atlántico
 * Este código se distribuye bajo licencia MIT
 */
```

Requerido solo cuando la política de la organización lo "exige". Muchas empresas y proyectos institucionales requieren headers de copyright en cada archivo por política interna. Y ni así, porque técnicamente [las licencias habitualmente se satisfacen con un archivo LICENSE en la raíz del repositorio](https://choosealicense.com/licenses/). No aporta valor técnico ni cumple función organizacional: suele ser herencia de algo mal aplicado por desconocimiento.

#### Comentario esporádico y "oportuno"

```java
// FIXME: Este algoritmo falla con arrays vacíos - revisar antes de producción
public static int buscarMaximo(int[] numeros) {
    return numeros[0]; // Implementación temporal
}
```

Marca decisiones técnicas pendientes. Debe incluir fecha y responsable. Debe resolverse antes de producción. Su presencia indica código incompleto o problemático.

**Mejor alternativa**: Usar issues o discussions de GitHub con permalinks a las líneas específicas de código. Esto mantiene la conversación técnica fuera del código, permite seguimiento verificable y notificaciones a los responsables, sin contaminar el archivo fuente con marcadores temporales que frecuentemente se olvidan.

### Comentarios inaceptables

#### Comentarios redundantes

<div align=center>

<table>
<tr><th>Con comentario redundante</th><th>Sin comentario</th></tr>
<tr><td valign=top>

```java
// Incrementa el contador
contador++;
```
</td>
<td valign=top>


```java
contador++;
```
</td></tr>
<tr><td valign=top>

```java
// Constructor de la clase Persona
public Persona() {
```
</td>
<td valign=top>



```java
public Persona() {
```
</td></tr>
</table>

</div>

El código ya dice exactamente lo que hace. El comentario no aporta información adicional.

#### Comentarios de sección

<div align=center>

<table>
<tr><th>Con comentario de sección</th><th>Sin comentario</th></tr>
<tr><td valign=top>

```java
// ============
// Métodos públicos
// ============
public void iniciar() {
    (...)
}

// ============
// Métodos privados
// ============
private void procesar() {
    (...)
}
```

</td><td valign=top>

```java
public void iniciar() {
    (...)
}

private void procesar() {
    (...)    
}
```
</td></tr>
</table>

</div>

Si el archivo requiere secciones para ser comprensible, el archivo es demasiado grande. Refactorizar en clases más pequeñas.

#### Comentarios no mantenidos

```java
// Calcula el promedio de las notas (máximo 10 notas)
public static double calcularPromedio(int[] notas) {
    int suma = 0;
    for (int i = 0; i < notas.length; i++) { // Cambió: ahora soporta cualquier cantidad
        suma += notas[i];
    }
    return (double) suma / notas.length;
}
```

El comentario dice "máximo 10". El código soporta cualquier cantidad. El comentario miente. El desarrollador pierde tiempo verificando cuál es la verdad.

#### Comentarios excesivos

```java
// Método que suma dos números
// Parámetro a: primer número a sumar
// Parámetro b: segundo número a sumar  
// Retorna: la suma de a y b
public static int sumar(int a, int b) {
    return a + b;
}
```

**Solución correcta:**

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

La firma del método ya comunica toda la información relevante.

#### Comentarios como documentación

```java
// Este método recibe el nombre del estudiante y su edad
// Valida que el nombre no esté vacío
// Valida que la edad esté entre 18 y 100
// Si las validaciones pasan, crea el estudiante
// Si no, lanza excepción
public void registrarEstudiante(String nombre, int edad) {
    // implementación
}
```

**Solución correcta:**

```java
public void registrarEstudiante(String nombre, int edad) {
    validarNombreNoVacio(nombre);
    validarEdadEnRango(edad, 18, 100);
    crearEstudiante(nombre, edad);
}

private void validarNombreNoVacio(String nombre) {
    if (nombre.isEmpty()) {
        throw new IllegalArgumentException("Nombre no puede estar vacío");
    }
}

private void validarEdadEnRango(int edad, int minimo, int maximo) {
    if (edad < minimo || edad > maximo) {
        throw new IllegalArgumentException("Edad debe estar entre " + minimo + " y " + maximo);
    }
}
```

El código bien estructurado documenta su comportamiento mediante su organización.

#### Comentarios confusos

```java
// Si el usuario está activo y tiene permisos o es administrador temporalmente
if ((usuario.activo && usuario.permisos) || usuario.adminTemp) {
    procesarSolicitud();
}
```

El comentario intenta explicar lógica compleja. La solución no es comentar sino simplificar:

```java
boolean puedeRealizarAccion = tienePermisosActivos(usuario) || esAdministradorTemporal(usuario);

if (puedeRealizarAccion) {
    procesarSolicitud();
}

private boolean tienePermisosActivos(Usuario usuario) {
    return usuario.activo && usuario.permisos;
}

private boolean esAdministradorTemporal(Usuario usuario) {
    return usuario.adminTemp;
}
```

#### Comentarios inexactos

```java
// Retorna true si el número es primo
public static boolean esPrimo(int numero) {
    if (numero < 2) return false;
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) return false;
    }
    return true;
}
```

El comentario dice "retorna true". El método ya dice eso en su firma: `boolean esPrimo`. El nombre del método es más preciso que el comentario.

#### Comentarios de atribución

```java
// Modificado por Ibuprofeno Fernández y Dalsy Gómez - 15/01/2024
// Agregada validación de email
public void registrarUsuario(String email) {
    // implementación
}
```

Para esto existe el control de versiones. Git mantiene historial completo de cambios, autores y fechas de manera verificable y sin contaminar el código.

#### Código comentado

```java
public void procesarDatos() {
    limpiarDatos();
    // validarFormato();
    // verificarIntegridad();
    guardarDatos();
}
```

Código comentado genera incertidumbre: ¿por qué está comentado? ¿Es importante? ¿Se debe descomentar en algún momento? ¿Es código antiguo que ya no sirve?

Si el código no se necesita, se elimina. El control de versiones preserva el historial si alguna vez se requiere recuperarlo.

### Principio rector

> ***No comentes código malo, reescríbelo*** - Kernighan & Plaugher
>
> ***Si un nombre requiere un comentario, entonces el nombre no revela su intención.*** - Robert C. Martin
>
> ***Cada vez que te expresas en código, deberías darte una palmadita en la espalda. Cada vez que escribes un comentario, deberías hacer una mueca y sentir el fracaso de tu habilidad de expresión.*** - Robert C. Martin
>
> ***Los buenos comentarios son informativos y necesarios, pero siguen siendo una concesión a la incapacidad del código para expresarse adecuadamente.***  - Robert C. Martin

Cada vez que se escribe un comentario, se debe preguntar: ¿puedo hacer que el código sea lo suficientemente claro para que este comentario sea innecesario?

La respuesta casi siempre es sí.

### Relación con clean code

Este documento complementa y especifica el principio establecido en [Clean Code](cleanCode.md): "No comentar el código" no significa eliminar toda comunicación escrita, sino concentrar el esfuerzo en hacer que el código sea la documentación.

|||
|-|-|
Mal código con buenos comentarios|Peor que buen código sin comentarios
Buen código con comentarios redundantes|Ruido que dificulta lectura
Buen código sin comentarios|Objetivo a alcanzar
Buen código con comentarios esporádicos y oportunos|Aceptable cuando genuinamente necesario

El tiempo invertido en escribir un comentario es mejor invertido en mejorar el código hasta que el comentario sea innecesario.
