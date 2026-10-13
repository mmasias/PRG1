# Java: expresiones

## ¿Por qué?

`a + b * c - d / e` admite varias lecturas según qué operación se haga primero, y cada lectura da un resultado distinto. El compilador necesita reglas que elijan una sola, y quien escribe el código necesita conocerlas para que la lectura del compilador coincida con la suya.

Además, el resultado no depende solo de los valores: `7 / 2` vale `3` y `7 / 2.0` vale `3.5`. El tipo de cada parte de una expresión decide qué operación se aplica y qué tipo tiene el resultado, y es la fuente de la mayoría de errores de compilación de los primeros programas.

## ¿Qué?

Una **expresión** es:

- un literal: `3`, `"Hola"`, `true`;
- una variable o constante: `edad`, `IVA_GENERAL`;
- una llamada a un método que devuelve un valor: `Math.sqrt(2)`;
- un operador aplicado a otras expresiones: `edad + 1`, `!terminado`, `n % 2 == 0 ? "par" : "impar"`.

La definición es recursiva: los operandos de un operador son a su vez expresiones, así que `(a + b) * Math.sqrt(c - 1)` es una expresión formada por expresiones.

Toda expresión tiene:

- un **tipo**, que el compilador conoce sin ejecutar el programa;
- un **valor**, que se obtiene al **evaluarla** durante la ejecución.

<div align=center>

|Expresión|Tipo|Valor (con `edad = 20`)|
|-|-|-|
|`20`|`int`|`20`
|`edad / 3`|`int`|`6`
|`edad / 3.0`|`double`|`6.666666666666667`
|`edad >= 18`|`boolean`|`true`
|`"Edad: " + edad`|`String`|`"Edad: 20"`
|`edad >= 18 ? "adulto" : "menor"`|`String`|`"adulto"`

</div>

Para evaluar una expresión con varios operadores hacen falta tres reglas, que responden a preguntas distintas:

<div align=center>

|Regla|Pregunta que responde|
|-|-|
|Precedencia|Entre dos operadores de distinto nivel, ¿a cuál pertenece el operando que está entre ambos?
|Asociatividad|Entre dos operadores del mismo nivel, ¿a cuál pertenece el operando que está entre ambos?
|Orden de evaluación|Una vez agrupada la expresión, ¿en qué orden se calculan los operandos?

</div>

## ¿Para qué?

|||
|-|-|
|Predecir el resultado|Saber qué valor producirá una expresión sin ejecutarla, y por qué.
|Entender los errores de compilación|Muchos errores ("bad operand types", "incompatible types", "possible lossy conversion") son errores de tipo en una expresión.
|Escribir expresiones legibles|Poner los paréntesis necesarios y solo esos.
|Leer código ajeno|Interpretar expresiones escritas por otros tal como las interpreta el compilador.

## ¿Cómo?

### Tipo de una expresión

<div align=center>

|Operación|Tipo del resultado|
|-|-|
|Aritmética (`+ - * / %`) entre numéricos|El de mayor rango de los operandos, como mínimo `int` (ver [conversión de tipos](00510-operadores.md#conversión-de-tipos))
|`+` con al menos un operando `String`|`String`
|Relacional (`< <= > >= == !=`)|`boolean`
|Lógica (`! && \|\|`)|`boolean`
|Ternario|El tipo común de las dos ramas
|Asignación (`=`, `+=`, ...)|El tipo de la variable
|Conversión `(tipo) expr`|`tipo`

</div>

El compilador comprueba que cada operador recibe operandos de tipos que admite. Por eso hay expresiones que se leen bien en matemáticas pero no compilan:

<div align=center>

|Código|Resultado|
|-|-|
|`boolean enRango = 1 < x < 10;`|Error de compilación: *bad operand types for binary operator '<'*
|`boolean enRango = 1 < x && x < 10;`|Correcto

</div>

`1 < x` es de tipo `boolean`, y `<` no admite un `boolean` como operando.

### Precedencia

Un operando situado entre dos operadores pertenece al de mayor precedencia. En `2 + 3 * 4`, el `3` está entre `+` y `*`; como `*` tiene más precedencia, la expresión se agrupa como `2 + (3 * 4)` y vale `14`.

<div align=center>

|Nivel|Tipo|Operadores|Asociatividad|
|:-:|-|-|-|
|1 (máx)|Unarios|`+` `-` `!`|derecha a izquierda|
|2|Multiplicativos|`*` `/` `%`|izquierda a derecha|
|3|Aditivos|`+` `-`|izquierda a derecha|
|4|Relacionales|`<` `>` `<=` `>=`|no asociativo (*)|
|5|Igualdad|`==` `!=`|izquierda a derecha|
|6|Y lógico|`&&`|izquierda a derecha|
|7 (mín)|O lógico|`\|\|`|izquierda a derecha|

</div>

(*) Los relacionales no se pueden encadenar: `a < b < c` no compila.

Los paréntesis rompen las reglas de precedencia y asociatividad.

La tabla incluye solo los operadores de esta asignatura. La tabla completa, con operadores de bits, de desplazamiento e `instanceof`, está en la [documentación de Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html).

Consecuencias que conviene tener presentes:

- `&&` tiene más precedencia que `||`: `a || b && c` es `a || (b && c)`.
- Los relacionales tienen más precedencia que los lógicos, así que `edad >= 18 && edad < 65` no necesita paréntesis.
- La conversión de tipo tiene más precedencia que cualquier operador binario: `(double) suma / cantidad` convierte solo `suma`.
- La asignación tiene la menor precedencia: en `x = a + b`, primero se calcula `a + b`.

### Asociatividad

Si el operando está entre dos operadores del mismo nivel, decide la asociatividad del nivel.

<div align=center>

|Expresión|Agrupación|Valor|
|-|-|:-:|
|`10 - 4 - 3`|`(10 - 4) - 3`|`3`
|`100 / 10 / 5`|`(100 / 10) / 5`|`2`
|`x = y = z`|`x = (y = z)`|el valor de `z`
|`"Total: " + 1 + 2`|`("Total: " + 1) + 2`|`"Total: 12"`
|`1 + 2 + " total"`|`(1 + 2) + " total"`|`"3 total"`
|`'a' + 'b' + "c"`|`('a' + 'b') + "c"`|`"195c"`

</div>

Las tres últimas filas son la trampa habitual al imprimir resultados: el mismo `+` suma o concatena según el tipo de los operandos, y lo que importa es el tipo del operando izquierdo en cada paso. Mientras los dos operandos sean numéricos (o `char`), `+` suma; en cuanto uno es `String`, concatena. Para imprimir una suma junto a un texto, la suma va entre paréntesis: `"Total: " + (1 + 2)`.

La asignación encadenada `x = y = z` ya aparecía en [Variables](00500-variables.md); funciona porque la asignación asocia de derecha a izquierda y devuelve el valor asignado.

### Paréntesis

Los paréntesis agrupan una subexpresión de forma explícita y se imponen a la precedencia y a la asociatividad: lo que está dentro forma un único operando.

Se usan en dos casos:

- Cuando la agrupación que se necesita no es la que dan las reglas: `(a + b) / 2`.
- Cuando la agrupación coincide con las reglas, pero no es evidente para quien lee: `(a && b) || c` se entiende antes que `a && b || c`.

No se usan para envolver lo que cualquier lector agrupa sin dudar: `((a * b)) + (c)` es ruido.

#### #2Think

<div align=center>

|||
|-|:-:|
|`100/(2-1)`|¿100 o 49?
|`4>=7 && (2==4 \|\| 5<6)`|¿false o true?
|`100/(2/2)`|¿100 o 25?
|`1-(1-1)`|¿1 o -1?
|`5 * (4+4) * 2`|¿80 o 28?
|`(5+4) / (4+2)`|¿1 u 8?

</div>

En cada fila, la segunda opción es el valor de la misma expresión sin paréntesis. Para comprobarlo:

```java
class Precedencia {
    public static void main(String[] args) {
        System.out.println(100/(2-1));
        System.out.println(100/2-1);
        System.out.println(4>=7 && (2==4 || 5<6));
        System.out.println(4>=7 && 2==4 || 5<6);
        System.out.println(100/(2/2));
        System.out.println(100/2/2);
        System.out.println(1-(1-1));
        System.out.println(1-1-1);
        System.out.println(5 * (4+4) * 2);
        System.out.println(5 * 4+4 * 2);
        System.out.println((5+4) / (4+2));
        System.out.println(5+4 / 4+2);
    }
}
```

La última pareja depende también del tipo: `(5+4) / (4+2)` vale `1` y no `1.5` porque `9 / 6` es una división entera.

### Orden de evaluación

Precedencia y asociatividad deciden cómo se **agrupa** la expresión, no en qué orden se **calculan** sus operandos. Son preguntas distintas: en `f() + g() * h()`, la agrupación es `f() + (g() * h())`, pero eso no dice si `f()` se calcula antes o después que `g()`.

En otros lenguajes, como C, ese orden no está definido. En Java sí lo está:

- El operando izquierdo de un operador binario se evalúa completo antes que el derecho.
- Todos los operandos se evalúan antes de aplicar el operador.
- Las excepciones son `&&`, `||` y `? :`, que pueden no evaluar alguno de sus operandos (evaluación en cortocircuito, ver [operadores lógicos](00500-variables.md#operadores-lógicos)).

Calcular el valor de una expresión implica, por tanto, tres momentos distintos:

<div align=center>

|Momento|Cuándo|Qué decide|
|-|-|-|
|Agrupación|Al compilar|Qué operador recibe qué operandos. Lo deciden la precedencia, la asociatividad y los paréntesis
|Evaluación de los operandos|Al ejecutar, de izquierda a derecha|El valor de cada operando. Los efectos laterales ocurren aquí
|Aplicación del operador|Al ejecutar, con sus operandos ya evaluados|El resultado, calculado con los valores obtenidos en el momento anterior

</div>

La diferencia entre estos momentos solo se nota cuando hay efectos laterales:

```java
int i = 1;
int r = i + i++ * 2;
```

<div align=center>

|Paso|Qué se hace|Resultado|
|:-:|-|-|
|1|Agrupación por precedencia|`i + (i++ * 2)`
|2|Se evalúa el operando izquierdo de `+`: `i`|`1`
|3|Se evalúa el operando derecho de `+`: primero `i++`|devuelve `1`; `i` pasa a valer `2`
|4|`1 * 2`|`2`
|5|`1 + 2`|`r` vale `3`

</div>

Aunque `*` tiene más precedencia que `+`, la `i` de la izquierda se evalúa antes que el `i++`.

En el paso 5, cuando `+` opera, la variable `i` ya vale `2`, pero `+` suma `1`: el valor que se leyó en el paso 2. **Un operando es una lectura hecha en un instante concreto, no una referencia a la variable.** Lo que le ocurra a la variable después de esa lectura no afecta al valor que el operador va a usar.

Una consecuencia directa: con efectos laterales, cambiar el orden de los sumandos cambia el resultado, aunque `+` sea conmutativa.

<div align=center>

|Código (con `i = 1`)|Evaluación|Resultado|
|-|-|:-:|
|`i + i++ * 2`|`i` -> `1`; `i++` -> `1` (`i` pasa a `2`); `1 * 2` = `2`; `1 + 2`|`3`
|`i++ * 2 + i`|`i++` -> `1` (`i` pasa a `2`); `1 * 2` = `2`; `i` -> `2`; `2 + 2`|`4`

</div>

La conmutatividad es una propiedad de los valores, no de las expresiones que los producen. Si leer un operando cambia el estado, el orden de lectura forma parte del resultado.

La agrupación construye un árbol; la evaluación lo recorre visitando, en cada nodo, primero el subárbol izquierdo, después el derecho y por último el propio nodo, que opera con los valores que le devuelven sus hijos. Los números indican el orden:

<div align=center>

|||
|:-:|:-:|
|![](/images/modelosUML/ordenEvaluacion001.svg)|![](/images/modelosUML/ordenEvaluacion002.svg)

</div>

Los dos árboles se recorren con la misma regla. Lo que cambia es en qué momento se lee cada `i`.

El resultado está definido en ambos casos, pero obtenerlo exige reconstruir la evaluación paso a paso: por eso el criterio de [efectos laterales](00510-operadores.md#efectos-laterales) es no mezclarlos con otras operaciones.
