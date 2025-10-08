# Estructuras de control: repetitivas

## ¿Por qué?

||||
|-|-|-|
|En programación se requiere ejecutar repetidamente un conjunto de instrucciones.|Realizar estas repeticiones manualmente implicaría duplicar código, lo cual es ineficiente, propenso a errores y difícil de mantener.|Las estructuras repetitivas permiten automatizar la ejecución de bloques de código bajo condiciones específicas, siendo fundamentales para implementar algoritmos que procesan colecciones de datos, validan entradas o ejecutan operaciones hasta alcanzar un resultado deseado.|

## ¿Qué?

Las estructuras repetitivas, también denominadas bucles o iteraciones, son **construcciones que permiten ejecutar un bloque de código múltiples veces según una condición establecida**. Utilizan los **bloques de código** que vimos anteriormente. Existen tres tipos principales que difieren en cuándo evalúan la condición de continuación y cómo gestionan el control del flujo.

## ¿Para qué?

<div align=center>

|||
|-|-|
Automatización|Ejecutar operaciones repetitivas sin duplicar código
Procesamiento de colecciones|Recorrer y manipular conjuntos de datos
Validación|Solicitar entrada hasta obtener datos válidos
Cálculo iterativo|Realizar operaciones que requieren múltiples pasos
Búsqueda|Localizar elementos que cumplan criterios específicos

</div>

## ¿Cómo?

### Iterativa indeterminada 0..N (while)

<div align=center>

![](/images/modelosUML/repetitiva001.svg)

</div>

```java
while (condición) {
    // Bloque de código
}
```

Evalúa la condición **antes** de ejecutar el bloque. Si la condición es falsa desde el inicio, el bloque nunca se ejecuta.

**Uso recomendado:** Cuando no se garantiza que el bloque deba ejecutarse al menos una vez.

**Ejemplo:**

```java
int intentos = 0;
boolean encontrado = false;
boolean debeContinuar = !encontrado && intentos < 5;

while (debeContinuar) {
    encontrado = buscarElemento();
    intentos++;
    debeContinuar = !encontrado && intentos < 5;
}
```

***NOTA:*** En código existente, es frecuente encontrar la condición directamente en el while. Aunque funcional, este enfoque carece del ritual de cierre que garantiza verificación completa de estados antes de cada iteración. Lo siguiente es una forma no recomendada (pero común en código existente)

```java
while (!encontrado && intentos < 5) {
    encontrado = buscarElemento();
    intentos++;
}
```

Consulte la [gestión de bucles con estados](../documentos/gestionDeBuclesConEstados.md) para comprender por qué el primer enfoque es superior.

### Iterativa indeterminada 1..N (do-while)

<div align=center>

![](/images/modelosUML/repetitiva002.svg)

</div>

```java
do {
    // Bloque de código
} while (condición);
```

Evalúa la condición **después** de ejecutar el bloque, garantizando al menos una ejecución.

**Uso recomendado:** Cuando el bloque debe ejecutarse obligatoriamente una vez antes de evaluar la condición de continuación.

**Ejemplo:**

```java
int edad;
boolean esValido;

do {
    System.out.print("Ingrese edad: ");
    edad = scanner.nextInt();
    esValido = edad >= 18 && edad <= 100 && edadCoherenteConDNI(edad);
} while (!esValido);
```

***NOTA:*** La forma común (pero no recomendada) sería evaluar la condición directamente:

```java
do {
    System.out.print("Ingrese edad: ");
    edad = scanner.nextInt();
} while (edad < 18 || edad > 100 || !edadCoherenteConDNI(edad));
```

### Iterativa determinada (for)

```java
for (inicialización; condición; incremento) {
    // Bloque de código
}
```

Estructura que integra la inicialización, evaluación de condición y actualización del iterador en una única línea. Se ejecuta en el siguiente orden:

1. Se ejecuta la inicialización (una sola vez)
2. Se evalúa la condición
3. Si es verdadera, se ejecuta el bloque
4. Se ejecuta el incremento
5. Se repite desde el paso 2

**Uso recomendado:** Cuando se conoce de antemano el número de iteraciones o se itera sobre una secuencia definida.

**Ejemplo:**

```java
for (int i = 0; i < 10; i++) {
    System.out.println("Iteración: " + i);
}
```

El bucle `for`, por su estructura formal con inicialización, condición e incremento explícitos, raramente requiere gestión de estados adicional. Su diseño ya proporciona control claro y predecible del flujo.

### Comparación entre estructuras

<div align=center>

|Característica|while|do-while|for|
|-|:-:|:-:|:-:|
|Evaluación inicial|Sí|No|Sí|
|Ejecuciones mínimas|0|1|0|
|Uso típico|Condición indefinida|Validación de entrada|Iteraciones conocidas|

</div>

### Ámbito en estructuras repetitivas

Las variables declaradas dentro del bloque de un bucle se crean y destruyen en cada iteración, siguiendo las reglas establecidas para bloques de código:

#### Variables en bucles for

```java
for (int i = 0; i < 3; i++) {
    int temporal = i * 2;
    System.out.println(temporal);
}
```

- La variable `i` existe solo dentro del bucle for
- La variable `temporal` se crea y destruye en cada iteración
- Al finalizar el bucle, tanto `i` como `temporal` dejan de existir

#### Ámbito de variables externas

```java
int contador = 0;
while (contador < 5) {
    int cuadrado = contador * contador;
    System.out.println(cuadrado);
    contador++;
}
```

- `contador` existe antes y después del bucle (ámbito exterior)
- `cuadrado` solo existe durante cada iteración (ámbito interior)
- `contador` puede modificarse desde dentro del bucle

### Casos de uso documentados

El repositorio incluye implementaciones de patrones comunes que ilustran el uso apropiado de estructuras repetitivas:

- [Menu](../temario/casosDeUso/menu.md): Bucle principal que mantiene la aplicación en ejecución hasta recibir señal de salida
- [Contador](../temario/casosDeUso/contador.md): Incremento sucesivo de una variable según condición
- [Acumulador](../temario/casosDeUso/acumulador.md): Suma progresiva de valores
- [Verificador](../temario/casosDeUso/verificador.md): Validación de entrada hasta obtener dato correcto

Todos estos casos emplean el patrón de [gestión de bucles con estados](../documentos/gestionDeBuclesConEstados.md).
