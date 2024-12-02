# Errores comunes

***Atención:*** es crucial entender que muchos de estos errores producen excepciones en **tiempo de ejecución**, no en tiempo de compilación, lo que los hace especialmente peligrosos en un entorno de producción.

## IndexOutOfBoundsException

> **Error**: Intentar acceder a una posición que está fuera de los límites de la matriz

```java
int[] nums = new int[3];
(...)
System.out.println(nums[3]);
```

Esto devuelve un error de `IndexOutOfBoundsException`

> **Solución**: Asegurarse que el índice esté dentro del rango:

```java
boolean indexIsValid = index >= 0 && index < array.length;
```

## Comparación incorrecta de arrays

> **Error**: Usar el operador `==` para comparar arrays, lo que compara **referencias**, no **contenido**

```java
int[] numbersOne = {1, 2, 3};
int[] valuesTwo = {1, 2, 3};
System.out.println(numbersOne == valuesTwo);
```

La comparación anterior devuelve `false`, porque se trata de dos matrices.

> **Solución**: Usar `Arrays.equals(numbersOne, valuesTwo)` para comparar el contenido. 

```java
int[] numbersOne = {1, 2, 3};
int[] valuesTwo = {1, 2, 3};
System.out.println(Arrays.equals(numbersOne, valuesTwo));
```

La comparación anterior devuelve `true` porque los elementos de las matrices son los mismos.

## Confusión con length

> **Error**: Intentar usar `length()` para matrices o `length` para Strings

```java
int[] nums = new int[5];
int size = nums.length();  
```

Devuelve error porque intentamos llamar un método en lugar de invocar la propiedad.

> **Solución**: Recordar que las matrices usan `length` (propiedad) y Strings usan `length()` (método)

```java
int[] nums = new int[5];
int arraySize = nums.length;
String text = "Hello";
int stringSize = text.length();
```

## Modificación con for-each

> **Error**: Intentar modificar elementos usando foreach

```java
for (int num : nums) {
    num = num * 2;
}
```

> **Solución**: Usar un for tradicional cuando se necesite modificar elementos

```java
for (int i = 0; i < nums.length; i++) {
    nums[i] = nums[i] * 2; 
}
```

## Inicialización nula

> **Error**: Declarar un array sin inicializarlo

```java
int[] nums;
nums[0] = 1;
```

La expresión anterior devuelve un error de `NullPointerException`

> **Solución**: Siempre inicializar la matriz antes de usarla

```java
int[] nums = new int[5];
```

o bien 

```java
int[] nums = {1, 2, 3, 4, 5};
```
