# Estructuras de control: repetitivas

## ¿Por qué?

||||
|-|-|-|
|En programación se requiere ejecutar repetidamente un conjunto de instrucciones.|Realizar estas repeticiones manualmente implicaría duplicar código, lo cual es ineficiente, propenso a errores y difícil de mantener.|Las estructuras repetitivas permiten automatizar la ejecución de bloques de código bajo condiciones específicas, siendo fundamentales para implementar algoritmos que procesan colecciones de datos, validan entradas o ejecutan operaciones hasta alcanzar un resultado deseado.|

## ¿Qué?

Las estructuras repetitivas, también denominadas bucles o iteraciones, son **construcciones que permiten ejecutar un bloque de código múltiples veces según una condición establecida**. Existen tres tipos principales que difieren en cuándo evalúan la condición de continuación y cómo gestionan el control del flujo.

## ¿Para qué?

|||
|-|-|
Automatización|Ejecutar operaciones repetitivas sin duplicar código
Procesamiento de colecciones|Recorrer y manipular conjuntos de datos
Validación|Solicitar entrada hasta obtener datos válidos
Cálculo iterativo|Realizar operaciones que requieren múltiples pasos
Búsqueda|Localizar elementos que cumplan criterios específicos

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

while (!encontrado && intentos < 5) {
    encontrado = buscarElemento();
    intentos++;
}
```

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
int valorIngresado;
do {
    System.out.print("Ingrese un valor entre 1 y 10: ");
    valorIngresado = scanner.nextInt();
} while (valorIngresado < 1 || valorIngresado > 10);
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

### Comparación entre estructuras

<div align=center>

|Característica|while|do-while|for|
|-|:-:|:-:|:-:|
|Evaluación inicial|Sí|No|Sí|
|Ejecuciones mínimas|0|1|0|
|Uso típico|Condición indefinida|Validación de entrada|Iteraciones conocidas|

</div>

### Casos de uso documentados

El repositorio incluye implementaciones de patrones comunes que ilustran el uso apropiado de estructuras repetitivas:

- [Menu](../temario/casosDeUso/menu.md): Bucle principal que mantiene la aplicación en ejecución hasta recibir señal de salida
- [Contador](../temario/casosDeUso/contador.md): Incremento sucesivo de una variable según condición
- [Acumulador](../temario/casosDeUso/acumulador.md): Suma progresiva de valores
- [Verificador](../temario/casosDeUso/verificador.md): Validación de entrada hasta obtener dato correcto

Todos estos casos emplean el patrón de [gestión de bucles con estados](../documentos/gestionDeBuclesConEstados.md).
