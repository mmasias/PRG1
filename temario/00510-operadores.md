# Java: operadores adicionales

## ¿Por qué?

Con los operadores vistos en [Variables](00500-variables.md) (aritméticos, concatenación, relacionales y lógicos) se puede calcular cualquier cosa, pero hay patrones que aparecen en casi todos los programas y que, escritos solo con ellos, resultan repetitivos o directamente imposibles:

- Elegir entre dos valores según una condición, dentro de una expresión.
- Actualizar una variable a partir de su propio valor: contadores, acumuladores, cadenas que se van construyendo.
- Operar con valores de tipos distintos: la media de varios `int` no es un `int`.

## ¿Qué?

<div align=center>

|Operador|Sintaxis|Devuelve|Modifica la variable|
|-|-|-|:-:|
|Ternario|`condición ? expr1 : expr2`|`expr1` si la condición es `true`, `expr2` si es `false`|No
|Conversión de tipo (*cast*)|`(tipo) expr`|El valor de `expr` convertido a `tipo`|No
|Asignación compuesta|`variable op= expr`|El nuevo valor de la variable|Sí
|Incremento / decremento prefijo|`++variable`, `--variable`|El valor **después** de modificar la variable|Sí
|Incremento / decremento postfijo|`variable++`, `variable--`|El valor **antes** de modificar la variable|Sí

</div>

Los tres últimos tienen **efecto lateral**: además de devolver un valor, modifican el estado del programa. Esta es la propiedad que más condiciona cómo deben usarse.

## ¿Para qué?

<div align=center>

|Necesidad|Operador|Ejemplo|
|-|-|-|
|Elegir un valor según una condición|Ternario|`String paridad = n % 2 == 0 ? "par" : "impar";`
|Calcular con decimales a partir de enteros|Conversión de tipo|`double media = (double) suma / cantidad;`
|Quedarse con la parte entera de un decimal|Conversión de tipo|`int dado = (int) (Math.random() * 6) + 1;`
|Acumular|Asignación compuesta|`total += precio;`
|Construir una cadena por partes|Asignación compuesta|`linea += "*";`
|Contar|Incremento|`contador++;`

</div>

## ¿Cómo?

### Operador ternario

<div align=center>

```
<condición> ? <expresión> : <expresión>
```

</div>

- La condición tiene que ser de tipo `boolean`.
- Las dos expresiones tienen que ser de tipos compatibles: el resultado del ternario tiene un único tipo, conocido al compilar, sea cual sea la rama que se elija al ejecutar.
- Solo se evalúa una de las dos expresiones.

```java
final int MAYORIA_DE_EDAD = 18;
int edad = 20;
String estado = edad >= MAYORIA_DE_EDAD ? "adulto" : "menor";
```

Un ternario que devuelve `true` o `false` es redundante: la condición ya es ese valor.

<div align=center>

|Redundante|Equivalente|
|-|-|
|`boolean mayorDeEdad = edad >= MAYORIA_DE_EDAD ? true : false;`|`boolean mayorDeEdad = edad >= MAYORIA_DE_EDAD;`

</div>

Su uso se limita a elegir un valor. Para elegir entre acciones se usa `if` (ver [estructuras alternativas](00710-estructurasDeControlAlternativas.md) y [¿if u operador ternario?](../documentos/ternarioOif.md)).

### Conversión de tipos

Toda expresión tiene un tipo (ver [Expresiones](00520-expresiones.md)). Cuando se combinan o asignan valores de tipos numéricos distintos, Java convierte entre ellos de dos formas.

#### Conversión implícita (ampliación)

Java convierte automáticamente un valor a un tipo que puede representarlo sin pérdida:

<div align=center>

```
byte -> short -> int -> long -> float -> double
                  ^
                char
```

</div>

- En una operación aritmética entre dos tipos distintos, el de menor rango se convierte al de mayor rango: `5 / 2.0` es `double` y vale `2.5`.
- Las operaciones con `byte`, `short` y `char` se hacen siempre en `int`: `'a' + 1` vale `98`, no `'b'`.
- Se puede asignar un valor de un tipo a una variable de un tipo de mayor rango: `double d = 5;` es válido.

#### Conversión explícita (*cast*)

En sentido contrario, la conversión puede perder información y el compilador no la hace por su cuenta:

<div align=center>

|Código|Resultado|
|-|-|
|`int r = 3.5;`|Error de compilación: *possible lossy conversion from double to int*
|`int r = (int) 3.5;`|`r` vale `3`

</div>

<div align=center>

|Expresión|Valor|Observación|
|-|-|-|
|`(int) 3.99`|`3`|Trunca, no redondea
|`(int) -3.99`|`-3`|Trunca hacia cero
|`(char) ('a' + 1)`|`'b'`|Vuelve a `char` el resultado `int` de la suma
|`(double) suma / cantidad`|`3.5` (con `suma = 7`, `cantidad = 2`)|Convierte `suma` y después divide en `double`
|`(double) (suma / cantidad)`|`3.0`|Divide en `int` (`3`) y después convierte

</div>

Las dos últimas filas muestran que el cast actúa sobre el operando que tiene inmediatamente a su derecha: tiene más precedencia que la división (ver [precedencia](00520-expresiones.md#precedencia)). Para convertir el resultado de una operación completa, la operación va entre paréntesis.

### Asignación compuesta

<div align=center>

|Operador|Equivale a|
|:-:|-|
|`a += b`|`a = a + b`
|`a -= b`|`a = a - b`
|`a *= b`|`a = a * b`
|`a /= b`|`a = a / b`
|`a %= b`|`a = a % b`

</div>

La equivalencia de la tabla es aproximada. La exacta incluye una conversión implícita al tipo de la variable:

<div align=center>

```
a op= b   equivale a   a = (tipoDeA) (a op b)
```

</div>

Esto tiene consecuencias que la versión larga no tiene:

<div align=center>

|Código|Resultado|
|-|-|
|`byte b = 10;`<br>`b = b + 5;`|Error de compilación: `b + 5` es `int`
|`byte b = 10;`<br>`b += 5;`|Compila: `b` vale `15`
|`int x = 5;`<br>`x += 3.7;`|Compila: `x` vale `8`. Los decimales se pierden sin aviso
|`int k = 3;`<br>`k *= 2 + 1;`|`k` vale `9`, no `7`: el lado derecho se evalúa completo antes de operar

</div>

Con `String`, `+=` concatena:

<div align=center>

|Código|Resultado|
|-|-|
|`String linea = "";`<br>`linea += "*";`<br>`linea += "*";`|`linea` vale `"**"`

</div>

Existen también `&=`, `|=`, `^=`, `<<=`, `>>=` y `>>>=`, asociados a los operadores de bits y de desplazamiento, que quedan fuera de esta asignatura.

### Incremento y decremento

`++` suma 1 a una variable y `--` le resta 1. La diferencia entre la forma prefija y la postfija está en el valor que devuelve la expresión, no en el efecto sobre la variable, que es el mismo:

<div align=center>

|Código|Valor de la expresión|Valor de `a` después|
|-|:-:|:-:|
|`int a = 5;`<br>`int p = ++a;`|`p` vale `6`|`6`
|`int a = 5;`<br>`int q = a++;`|`q` vale `5`|`6`

</div>

- Solo se aplican a variables: `5++` no compila.
- Incluyen la misma conversión implícita que la asignación compuesta: `char c = 'a'; c++;` deja `c` con `'b'`.
- Usados como sentencia independiente (`contador++;`), prefijo y postfijo son indistinguibles, porque nadie usa el valor devuelto. Es el uso recomendado.

### Efectos laterales

Una expresión sin efectos laterales se puede evaluar las veces que se quiera y siempre produce el mismo valor: `x + 1` no cambia `x`. Con efectos laterales esto deja de ser cierto: evaluar `x++` dos veces da dos valores distintos, porque la propia evaluación cambia `x`.

En [Variables](00500-variables.md) ya aparecía con la asignación: `System.out.println(x = x + 1)` imprime y modifica a la vez. Los operadores de esta sección hacen lo mismo de forma menos visible.

El resultado de mezclar efectos laterales con otras operaciones está definido en Java (ver [orden de evaluación](00520-expresiones.md#orden-de-evaluación)), pero exige al lector reconstruir paso a paso la evaluación para saber qué ocurre:

<div align=center>

|Código|Resultado|
|-|-|
|`int y = 5;`<br>`y = y++;`|`y` vale `5`: `y++` devuelve `5`, incrementa `y` a `6` y la asignación vuelve a dejar `5`
|`int z = 2;`<br>`z = z++ + ++z;`|`z` vale `6`

</div>

Criterio: **un efecto lateral por sentencia**, y nunca sobre una variable que se lee en otra parte de la misma expresión.

### #2Think

<div align=center>

|Código|¿Qué se imprime?|
|-|:-:|
|`int a = 3;`<br>`System.out.println(a++ + a);`|¿6, 7 u 8?
|`int a = 3;`<br>`System.out.println(++a + a);`|¿6, 7 u 8?
|`double m = (double) (7 / 2);`<br>`System.out.println(m);`|¿3.0 o 3.5?
|`int t = 10;`<br>`t /= 4;`<br>`System.out.println(t);`|¿2 o 2.5?
|`String s = "a";`<br>`s += 1 + 2;`<br>`System.out.println(s);`|¿a12 o a3?
|`int n = 4;`<br>`System.out.println(n % 2 == 0 ? n / 2 : n * 3 + 1);`|¿2 o 13?

</div>
