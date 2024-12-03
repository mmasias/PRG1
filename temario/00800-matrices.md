# Matrices

<div align=right>

***Disclaimer***: *matriz* ~ *array* ~ *tabla*

</div>

## ¿Por qué?

Habiendo manejado información, a menudo nos encontramos con el desafío de manejar y organizar datos de manera eficiente. 

<div align=center>

|||
|-|-
|A medida que abordamos problemas más complejos, nos damos cuenta de que se vuelve inmanejable tener variables separadas para datos que están relacionados entre sí.|Necesitamos una evolución natural que nos permita organizar variables del mismo tipo de manera sistemática.
|Al usar bucles para procesar variables individuales relacionadas, notamos que los patrones se repiten.|Necesitamos una forma de aplicar las mismas operaciones a conjuntos de datos del mismo tipo.
|Los bucles nos permiten repetir operaciones, pero cuando necesitamos acceder o modificar un elemento específico entre muchos, tener que recorrer todo desde el principio no es eficiente.|Necesitamos una forma de alcanzar de manera eficiente cualquier elemento.
|A medida que combinamos variables primitivas y estructuras de control, vemos que necesitamos patrones regulares para organizar datos relacionados.|Necesitamos poder escalar (crecer) de manera ordenada para abordar problemas más complejos.
|Aunque los bucles y las variables individuales son herramientas poderosas, cuando la cantidad de datos crece, el código se vuelve difícil de mantener.|Necesitamos una estructura que mantenga la simplicidad de las variables primitivas pero que escale mejor.

</div>

> Una **estructura de datos** es una forma específica de organizar y almacenar datos para que puedan ser utilizados de manera eficiente. Define no solo la organización física de los datos, sino también las relaciones entre ellos y las operaciones que se pueden realizar sobre estos datos.

## ¿Qué?

**Una matriz (o array (o tabla (o vector))) es una colección de elementos, todos del mismo tipo, almacenados en una estructura de datos contigua.**

Los elementos de un array se almacenan en posiciones consecutivas en la memoria y cada uno de ellos se puede acceder directamente utilizando un índice o una clave numérica. Las matrices pueden ser de una dimensión (como una lista lineal de elementos) o multidimensionales (como tablas de dos o más dimensiones).

## ¿Para qué?

|||
|-|-|
|Almacenamiento organizado|Permiten almacenar conjuntos de datos de manera ordenada y estructurada, facilitando su acceso y manipulación.
|Procesamiento de datos|Son esenciales para realizar operaciones en conjuntos de datos, como cálculos matemáticos o análisis estadísticos.
|Eficiencia en el acceso y la modificación|Ofrecen una forma rápida y eficiente de acceder y modificar datos mediante el uso de índices.
|Base para estructuras de datos más complejas|Las matrices son el fundamento sobre el cual se construyen estructuras de datos más avanzadas y especializadas.
|Simplicidad en la implementación|Proporcionan una manera relativamente simple y directa de manejar colecciones de datos, lo cual es ideal para entender conceptos básicos de programación y algoritmos.

## ¿Cómo? - *En java*

### Variable referencia

<div align=center>

`tipo[] <referencia>`

||Una<br>Referencia|Así como un<br>Acceso direto|
|-|-|-|
|**No es**|Matriz|Archivo
|**Tampoco es**|Dirección de la matriz|Dónde está el archivo

</div>

### Operadores

#### Operador *new*

<div align=center>

||Operador|Operandos|Devuelve|
|-|-|-|-|
**new**|unario prefijo|tipo de matriz|Dirección de memoria donde se ha reservado el espacio para dicha matriz

</div>

#### Otros operadores

<div align=center>

|||||
|-|-|-|-|
|`=`|Asignación|`<referenciaV>=<direcciónV>`|Asigna la dirección a la referencia, siendo del mismo tipo.
|`.length`|Longitud|`<direcciónV>.length`|Devuelve la longitud de la matriz.
|`==`|Comparación|`<direcciónV-I>==<direcciónV-II>`|determina si dos direcciones a vectores del mismo tipo son iguales.
|`!=`|Comparación|`<direcciónV-I>!=<direcciónV-II>`|determina si dos direcciones a vectores del mismo tipo son distintas.
|`[expresión]`||`<direcciónV-I>[expresión]`|accede a la variable que ocupa la posición dada por la expresión entera, numerada de cero al anterior a la longitud.

</div>

> #*2Think*: Igual no es lo mismo que lo mismo.

```java
int[] a = {1,2,3};
int[] b = a;
int[] c = {1,2,3};
```

<div align=center>

<table>
<tr><td align=center><b>¿Igual?</b></td><td align=center><b>¿Lo mismo?</b></td></tr>
<tr><td>

||a|b|c|
|-|:-:|:-:|:-:|
|**a**|🤔|🤔|🤔|
|**b**|🤔|🤔|🤔|
|**c**|🤔|🤔|🤔|

</td><td>

||a|b|c|
|-|:-:|:-:|:-:|
|**a**|🤔|🤔|🤔|
|**b**|🤔|🤔|🤔|
|**c**|🤔|🤔|🤔|
</td></tr>
</table>

</div>

#### Tipos de matrices

<div align=center>

|De tipos primitivos|De tipos estructurados/compuesto|
|-|-|
Number, string, boolean, undefined|Las propias matrices pudiendo construir matrices de matrices de tipos primitivos, matrices bidimensionales, …​ matrices de matrices de …​ de tipos primitivos, matrices n-dimensionales

</div>

### Entonces...

|||Ejemplo|
|-|-|-|
|Declaración de la variable referencia|Especificando el tipo de los elementos que contendrá, seguido de corchetes|```int[] numeros;```
||Usando [nombres adecuados](/documentos/nombresMatrices.md)||
|Inicialización|Definiendo su tamaño |```new int[10];```
||Directamente con los elementos|```{1, 2, 3, 4, 5};```
|Acceso a elementos|Mediante índices.<br>En Java, los índices comienzan en 0|```numeros[0]```<br> accede al primer elemento de la matriz.
|Modificación de elementos|Asignando un nuevo valor al índice correspondiente.|```numeros[0] = 100;```<br>cambia el primer elemento a 100.
|Matrices multidimensionales|Se pueden crear matrices multidimensionales.|```int[][] matriz = new int[3][4];```<br>crea una matriz de 3 por 4.
|Iteración|Se puede recorrer una matriz usando bucles, como `for`, `while` o `for-each`, para acceder o modificar sus elementos.

### Tras la creación

#### Por defecto

<div align=center>

|Tipo|Valor por defecto|
|-|-|
|Número|0|
|Lógico|false|
|Caracter|\0|
|String|null|

</div>

> Es altamente recomendado que la matriz se trate de una ***colección de elementos homogéneos, todos ellos del mismo tipo y de la misma naturaleza***: no combinar 5 contadores y un acumulador

#### Valor null

La dirección **null** es el valor de aquella dirección donde no hay valores

### Propiedad length

Mediante la propiedad `length` se accede a la cantidad del elementos de la matriz: uno más que el índice del último elemento porque empiezan por cero. ¿Por qué empiezan por cero?

```java
    numeros = new int[] { 1, 2, 3, 4, 5 };
    int tamaño = numeros.length;
```

### Modificación de elementos

Mediante la asignación del valor de la evaluación de una expresión, en la posición indexada mediante el valor entero de la expresión de la matriz dado por la primera expresión

```java
    numeros[0] = 12;
```

### Iteración de matrices

Se puede iterar de modo habitual mediante bucles `for` (habitual) o `while` `do/while` (menos habitual), o con el bucle especial `for-each`

#### for

```java
for (int numero = 0; i < numeros.length; numero++) {
    System.out.print(numeros[numero]);
}
```

#### for-each

```java
for (int numero : numeros) {
    System.out.print(numero);
}
```

|for|for-each|
|-|-|
|Acceder al índice durante la iteración|Solo se necesitan leer los elementos|
|Modificar elementos de la matriz|Se quiere iterar todo la matriz en orden|
|Iterar la matriz en orden atípico (ej: hacia atrás, saltar elementos)|No se necesita saber la posición del elemento|
|Iterar sobre múltiples arrays simultáneamente|Se quieres un código más limpio y menos propenso a errores|
|Detenerse antes del final bajo ciertas condiciones||

> Si solo se necesita leer los elementos en orden, `for-each` puede resultar útil. Si se necesita más control o modificar elementos, se debe usar el `for` tradicional.

Conocidas las ventajas, es fundamental tener en cuenta las limitaciones del for-each:

- No se pueden modificar los elementos de la matriz (los cambios a la variable iteradora no afectan a la matriz)
- No se tiene acceso al índice
- No se puede iterar en reversa ni saltar elementos
- No se puede iterar sobre múltiples matrices al mismo tiempo

#### ¡Cuidado!

Esto no hace lo que parece que hace

```java
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    number = number * 2;  
}
System.out.println(numbers[0]);
```

### Consideraciones adicionales

- [Errores comunes](00801-erroresComunes.md)
- [Métodos útiles](00802-metodosUtiles.md)
- [Buenas prácticas](00803-buenasPracticas.md)
- [Notas sobre rendimiento](00804-notasSobreRendimiento.md)
