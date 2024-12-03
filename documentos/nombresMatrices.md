# Nombres para matrices

En Java se proponen convenciones comunes para nombrar matrices, que aunque no son reglas estrictas del lenguaje, ayudan a mejorar su legibilidad.

> Lo más importante es que el nombre comunique claramente el propósito y contenido de la matriz.

## Múltiples elementos

Para matrices que contienen múltiples elementos del mismo tipo, se prefiere usar el PLURAL.

```java
String[] names;
int[] ages;
Student[] students;
```

## Colecciones específicas

Para matrices que representan una colección específica o un conjunto con significado propio, a veces se usa un nombre COLECTIVO.

```java
int[] phoneDirectory;
char[] alphabet;
byte[] buffer;
```

## Nombres compuestos

Cuando el nombre de la matriz es un nombre compuesto, se suele usar la forma que mejor exprese su propósito.

```java
int[] primeNumbers;
String[] userInputLines;
double[] monthlyRevenue;
```

## Conceptos

Si la matriz representa un concepto (sea matemático o de otra área de conocimiento), es pertinente usar nombres que sugieran esta naturaleza:

```java
int[][] matrix;
char[][] grid;
double[][] coordinates;
```

La clave es mantener la consistencia dentro del proyecto. Si están usando plurales, se ha de mantener esa convención a lo largo del código.

## Variables acompañantes de la matriz

Si se está iterando sobre la matriz, el nombre de la variable iteradora suele ser la versión en singular del nombre de la matriz:

```java
for (String name : names) {
    // ...
}

for (Student student : students) {
    // ...
}
```
