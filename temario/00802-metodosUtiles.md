# Métodos útiles: clase `Arrays`

|||
|-|-|
|Estos métodos de la clase Arrays proporcionan funcionalidades comunes que nos ayudan a evitar escribir código repetitivo y propenso a errores.|Es importante importar `java.util.Arrays` para utilizarlos.

## `Arrays.toString()` - Para visualizar matrices

>**Uso**: Permite obtener una representación en String del contenido de la matriz

```java
int[] numeros = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(numeros));
```

Muestra por pantalla `[1, 2, 3, 4, 5]`

## `Arrays.sort()` - Para ordenar

>**Uso**: Ordena los elementos de la matriz (de menor a mayor en tipos primitivos)

```java
int[] desordenados = {5, 2, 8, 1, 9};
Arrays.sort(desordenados);
```

La matriz queda: `{1, 2, 5, 8, 9}`

## `Arrays.copyOf()` - Para copiar matrices

>**Uso**: Crea una nueva matriz con una copia de los elementos

```java
int[] original = {1, 2, 3, 4, 5};
int[] copia = Arrays.copyOf(original, original.length);
```

Crea una copia **independiente**

## `Arrays.fill()` - Para inicializar con valores

>**Uso**: Rellena toda la matriz con un valor específico

```java
int[] matriz = new int[5];
Arrays.fill(matriz, 10);
```

La matriz queda: `{10, 10, 10, 10, 10}`

## `Arrays.binarySearch()` - Para búsqueda eficiente

>**Uso**: Busca un elemento en una matriz ordenada

```java
int[] numeros = {1, 2, 3, 4, 5};
int posicion = Arrays.binarySearch(numeros, 3);
```

`posicion` valdrá 2

> Importante: La matriz debe estar ordenada previamente para usar binarySearch

## `Arrays.deepToString()` - Para matrices multidimensionales

>**Uso**: Similar a `toString()` pero para matrices de más de una dimensión

```java
int[][] matriz2D = {{1, 2}, {3, 4}};
System.out.println(Arrays.deepToString(matriz2D));
```

Devuelve `[[1, 2], [3, 4]]`
