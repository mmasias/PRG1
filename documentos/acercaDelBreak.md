# `break` y `continue`

## ¿Por qué?

Muchos lenguajes (incluyendo Java) incluyen `break` y `continue` como mecanismos heredados de C que permiten alterar el flujo normal de los bucles. Estos operadores existen en el lenguaje y aparecen frecuentemente en código existente, por lo que resulta necesario conocerlos para comprender programas escritos por otros.

Sin embargo, su uso genera código difícil de mantener y comprender. Este documento explica qué son, dónde aparecen y por qué no deben utilizarse.

## ¿Qué?

|||
|-|-|
`break`|Termina inmediatamente la ejecución del bucle más interno que lo contiene, transfiriendo el control a la siguiente instrucción después del bucle.
`continue`|Salta el resto de la iteración actual y transfiere el control directamente a la evaluación de la condición del bucle para la siguiente iteración.

```java
while (condicion) {
    // Código antes
    if (situacionA) break;      // Sale del bucle
    if (situacionB) continue;   // Salta a siguiente iteración
    // Código después (no se ejecuta si break o continue actúan)
}
```

Estos operadores **rompen la estructura modular** del bucle al crear múltiples puntos de salida dispersos en el código.

## ¿Para qué?

Se diseñaron originalmente para:

- Simplificar código en situaciones donde la condición de salida emerge durante la ejecución
- Evitar anidamiento excesivo de condicionales
- Optimizar rendimiento al evitar procesamiento innecesario

En la práctica, estos beneficios *aparentes* se ven superados por los problemas que generan en comprensión y mantenibilidad del código.

## ¿Cómo?

### El problema fundamental

`break` y `continue` fragmentan la lógica de control del bucle. Un bucle bien estructurado tiene un único punto de evaluación claro; estos operadores crean múltiples puntos de decisión ocultos que se requiere rastrear leyendo todo el cuerpo del bucle.

**Código con break (encontrado frecuentemente):**

```java
final int MAXIMO_INTENTOS = 5;
int intentos = 0;
boolean encontrado = false;

while (intentos < MAXIMO_INTENTOS) {
    if (buscarElemento()) {
        encontrado = true;
        break;  // Punto de salida oculto
    }
    intentos++;
}
```

**Problema:** La condición real de salida está fragmentada entre la condición del `while` y el `break`. No se puede comprender el comportamiento del bucle sin leer su implementación completa.

### La alternativa correcta: gestión con estados

El enfoque mediante estados explicita todas las condiciones de continuación:

```java
final int MAXIMO_INTENTOS = 5;
int intentos = 0;
boolean encontrado = false;
boolean debeContinuar = !encontrado && intentos < MAXIMO_INTENTOS;

while (debeContinuar) {
    encontrado = buscarElemento();
    intentos++;
    debeContinuar = !encontrado && intentos < MAXIMO_INTENTOS;
}
```

**Ventajas:**

1. **Visibilidad completa**: La variable `debeContinuar` concentra toda la lógica de control
2. **Verificación garantizada**: Todas las condiciones se evalúan en cada iteración
3. **Trazabilidad**: El estado del bucle es explícito y verificable
4. **Modificabilidad**: Agregar condiciones requiere solo modificar la asignación del estado

### Ejemplo con continue

**Código encontrado en proyectos existentes:**

```java
for (int i = 0; i < elementos.length; i++) {
    if (!elementos[i].esValido()) continue;
    if (elementos[i].estaVacio()) continue;
    
    procesarElemento(elementos[i]);
}
```

**Alternativa correcta:**

```java
for (int i = 0; i < elementos.length; i++) {
    boolean debeProcesar = elementos[i].esValido() && !elementos[i].estaVacio();
    
    if (debeProcesar) {
        procesarElemento(elementos[i]);
    }
}
```

### Impacto en mantenibilidad

<div align=center>

|Cualidad|Con break/continue|Con gestión de estados|
|-|:-:|:-:|
|Fluidez (comprensión)|Baja|Alta|
|Flexibilidad (modificación)|Baja|Alta|
|Fortaleza (pruebas)|Media|Alta|
|Reusabilidad|Baja|Alta|

</div>

### Caso aparentemente inevitable

Código frecuente que parece requerir `break`:

```java
while (true) {
    String entrada = leerEntrada();
    if (entrada.equals("salir")) break;
    procesarEntrada(entrada);
}
```

Solución correcta con estados:

```java
String entrada = leerEntrada();
boolean debeTerminar = entrada.equals("salir");

while (!debeTerminar) {
    procesarEntrada(entrada);
    entrada = leerEntrada();
    debeTerminar = entrada.equals("salir");
}
```

### Relación con bucles for

El bucle `for`, por su estructura formal con inicialización, condición e incremento explícitos, raramente presenta situaciones donde `break` o `continue` parezcan necesarios. Su diseño ya proporciona control claro del flujo.

Cuando se considera `break` en un `for`, suele indicar que el problema requiere realmente un `while` con gestión de estados.

## Consideraciones finales

`break` y `continue` permanecen en Java por compatibilidad con código existente. Encontrarlos en proyectos no significa que sean aceptables en código nuevo.

La gestión explícita de estados mediante variables booleanas:

- Hace visible la lógica de control
- Facilita la comprensión y modificación
- Elimina puntos de salida ocultos
- Se alinea con los principios de código limpio

Este enfoque requiere disciplina inicial pero produce código significativamente más mantenible.

> Consulte [gestión de bucles con estados](gestionDeBuclesConEstados.md) para profundizar en el patrón recomendado.
