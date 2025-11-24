# Anatomía de los métodos estáticos

## ¿Por qué?

<div align=center>

||||
|-|-|-|
Cuando se empiezan a utilizar métodos estáticos, surge una pregunta natural: ¿cómo se pasa información a un método? ¿Cómo se obtienen resultados de él? |El código en `main` necesita comunicarse con los métodos que crea, y para eso existen los **parámetros** y los **valores de retorno**. |Sin entender esta anatomía completa, los métodos estáticos serían como cajas negras sin manera de interactuar con ellas.

</div>

## ¿Qué?

Un método estático *puede tener* dos elementos fundamentales para la comunicación:

- **Parámetros**: Son los datos que le enviamos al método (entrada)
- **Valor de retorno**: Es el resultado que el método nos devuelve (salida)

Estos elementos definen la **firma** del método (su interfaz de comunicación) y determinan cómo se usa.

## ¿Para qué?

Entender la anatomía completa de los métodos permite:

- **Diseñar funciones reutilizables**: Un método que calcula algo puede usarse en múltiples contextos
- **Separar responsabilidades**: Un método hace cálculos, otro muestra resultados
- **Crear código testeable**: Un método que devuelve un valor es fácil de probar
- **Construir abstracciones**: Ocultar complejidad detrás de una interfaz simple

## ¿Cómo?

### Tipos de métodos según su comunicación

#### 1. Métodos que solo ejecutan (procedimientos)

**Sin parámetros ni retorno:**

<div align=center>

<table>
<tr><th>Implementación</th><th>Uso</th></tr>
<tr><td valign=top>

```java
public static void mostrarBienvenida() {
    System.out.println("===================");
    System.out.println("  Bienvenido/a");
    System.out.println("===================");
}
```
</td><td valign=top>

```java
mostrarBienvenida();
```
</td></tr>
</table>

</div>

**Con parámetros, sin retorno:**

<div align=center>

<table>
<tr><th>Implementación</th><th>Uso</th></tr>
<tr><td valign=top>

```java
public static void mostrarTablero(int posicion) {
    System.out.println("-".repeat(posicion) + "X");
}
```
</td><td valign=top>

```java
mostrarTablero(15);
```
</td></tr>
</table>

</div>

**Múltiples parámetros:**

<div align=center>

<table>
<tr><th>Implementación</th><th>Uso</th></tr>
<tr><td valign=top>

```java
public static void mostrarPosicion(String nombre, int posicion, int turno) {
    System.out.println("Turno " + turno + ": " + nombre + " está en " + posicion);
}
```
</td><td valign=top>

```java
mostrarPosicion("Juan", 15, 3);
```
</td></tr>
</table>

</div>

#### 2. Métodos que devuelven valores (funciones)

**Sin parámetros, con retorno:**

<div align=center>

<table>
<tr><th>Implementación</th><th>Uso</th></tr>
<tr><td valign=top>

```java
public static int lanzarDado() {
    return (int)(Math.random() * 6) + 1;
}
```
</td><td valign=top>

```java
int resultado = lanzarDado();
System.out.println("Sacaste: " + resultado);
```
</td></tr>
</table>

</div>

**Con parámetros y retorno:**

<div align=center>

<table>
<tr><th>Implementación</th><th>Uso</th></tr>
<tr><td valign=top>

```java
public static int calcularAvance(int dado) {
    if (dado >= 5) {
        return 3;
    } else if (dado >= 3) {
        return 2;
    } else {
        return 1;
    }
}
```
</td><td valign=top>

```java
int dado = lanzarDado();
int avance = calcularAvance(dado);
```
</td></tr>
</table>

</div>

**Múltiples parámetros con retorno:**

<div align=center>

<table>
<tr><th>Implementación</th><th>Uso</th></tr>
<tr><td valign=top>

```java
public static boolean estaEnRango(double valor, double minimo, double maximo) {
    return valor >= minimo && valor <= maximo;
}
```
</td><td valign=top>

```java
double temperatura = 25.5;
if (estaEnRango(temperatura, 20.0, 30.0)) {
    System.out.println("Temperatura agradable");
}
```
</td></tr>
</table>

</div>

**Retorno de diferentes tipos:**

<div align=center>

<table>
<tr><th>Implementación</th><th>Descripción</th></tr>
<tr><td valign=top>

```java
public static int calcularPuntos(int aciertos) {
    return aciertos * 10;
}
```
</td><td valign=top>
Devuelve entero
</td></tr>
<tr><td valign=top>

```java
public static double calcularPromedio(int suma, int cantidad) {
    return (double) suma / cantidad;
}
```
</td><td valign=top>
Devuelve decimal
</td></tr>
<tr><td valign=top>

```java
public static boolean esPositivo(int numero) {
    return numero > 0;
}
```
</td><td valign=top>
Devuelve booleano
</td></tr>
<tr><td valign=top>

```java
public static String obtenerEstado(boolean ganado, boolean vivo) {
    if (ganado && vivo) {
        return "Victoria";
    } else if (!vivo) {
        return "Derrota";
    } else {
        return "En progreso";
    }
}
```
</td><td valign=top>
Devuelve String
</td></tr>
</table>

</div>

### Anatomía visual

<div align=center>

<table>
<tr><th>Implementación</th><th>Uso</th></tr>
<tr><td valign=top>

```java
public static int calcularSuma(int a, int b) {
    int resultado = a + b;
    return resultado;
}
```

||||
|-|-|-|
|`public static`|Modificador static||
|`int`|Tipo de retorno (salida)||
|`calcularSuma`|Nombre del método||
|`int a, int b`|Parámetros (entrada)||

</td><td valign=top>

```java
int total = calcularSuma(5, 3);
```

||||
|-|-|-|
|`total`|Variable que recibe el retorno||
|`calcularSuma`|Llamada al método||
|`5, 3`|Argumentos (valores concretos)||

</td></tr>
</table>

</div>

### Diferencia clave: void vs tipo de retorno

<div align=center>

<table>
<tr><th>Implementación</th><th>Descripción</th></tr>
<tr><td valign=top>

```java
public static void imprimirResultado(int valor) {
    System.out.println("El resultado es: " + valor);
}
```
</td><td valign=top>

`void` = no devuelve nada, solo HACE algo

No válido: `int x = imprimirResultado(5);`

</td></tr>
<tr><td valign=top>

```java
public static int duplicar(int valor) {
    return valor * 2;
}
```
</td><td valign=top>

Tipo de retorno = devuelve algo, CALCULA o EVALÚA

Válido: `int x = duplicar(5);`

</td></tr>
</table>

</div>

### Reglas de oro

1. **Un método solo puede devolver UN valor** (pero puede recibir múltiples parámetros)

   <div align=center>

   <table>
   <tr><th>Código</th><th>Descripción</th></tr>
   <tr><td valign=top>

   ```java
   public static int sumar(int a, int b, int c) {
       return a + b + c;
   }
   ```
   </td><td valign=top>

   Correcto: devuelve un único valor

   </td></tr>
   </table>

   </div>

   No se puede devolver dos valores directamente (más adelante se verán técnicas con objetos o arrays)

2. **Los parámetros son copias** (cambios no afectan al original)

   <div align=center>

   <table>
   <tr><th>Código</th><th>Descripción</th></tr>
   <tr><td valign=top>

   ```java
   public static void intentarModificar(int numero) {
       numero = 100;
   }

   public static void main(String[] args) {
       int x = 5;
       intentarModificar(x);
       System.out.println(x);
   }
   ```
   </td><td valign=top>

   Solo cambia la copia local del parámetro

   El valor original sigue siendo 5

   </td></tr>
   </table>

   </div>

3. **El tipo de retorno debe coincidir**

   <div align=center>

   <table>
   <tr><th>Código</th><th>Descripción</th></tr>
   <tr><td valign=top>

   ```java
   public static int calcular() {
       return 3.14;
   }
   ```
   </td><td valign=top>

   Error: devuelve double, espera int

   </td></tr>
   <tr><td valign=top>

   ```java
   public static int calcular() {
       return (int) 3.14;
   }
   ```
   </td><td valign=top>

   Correcto: conversión explícita

   </td></tr>
   </table>

   </div>

4. **return termina la ejecución del método**

   <div align=center>

   <table>
   <tr><th>Código</th><th>Descripción</th></tr>
   <tr><td valign=top>

   ```java
   public static int buscarPrimero(int[] numeros, int objetivo) {
       for (int i = 0; i < numeros.length; i++) {
           if (numeros[i] == objetivo) {
               return i;
           }
       }
       return -1;
   }
   ```
   </td><td valign=top>

   Sale inmediatamente cuando encuentra el objetivo

   Solo ejecuta el segundo return si no lo encontró

   </td></tr>
   </table>

   </div>

### Patrones comunes en PRG1

#### Patrón 1: Calcular y mostrar (separación de responsabilidades)

<div align=center>

<table>
<tr><th>Código</th><th>Descripción</th></tr>
<tr><td valign=top>

```java
public static void main(String[] args) {
    int dado = lanzarDado();
    mostrarResultado(dado);
}

private static int lanzarDado() {
    return (int)(Math.random() * 6) + 1;
}

private static void mostrarResultado(int valor) {
    System.out.println("Resultado: " + valor);
}
```
</td><td valign=top>

Un método calcula

Otro método muestra

Responsabilidades separadas

</td></tr>
</table>

</div>

#### Patrón 2: Validar entrada

<div align=center>

<table>
<tr><th>Código</th><th>Descripción</th></tr>
<tr><td valign=top>

```java
public static int leerEntero(Scanner entrada, int min, int max) {
    int valor;
    do {
        System.out.print("Introduce un número entre " + min + " y " + max + ": ");
        valor = entrada.nextInt();
    } while (!esValido(valor, min, max));
    return valor;
}

private static boolean esValido(int valor, int min, int max) {
    return valor >= min && valor <= max;
}
```
</td><td valign=top>

Lectura con validación

Método auxiliar verifica rango

Reutilizable para diferentes límites

</td></tr>
</table>

</div>

#### Patrón 3: Cálculo con múltiples pasos

<div align=center>

<table>
<tr><th>Código</th><th>Descripción</th></tr>
<tr><td valign=top>

```java
public static int calcularPuntuacion(int aciertos, int fallos, int bonus) {
    int puntosBase = calcularPuntosBase(aciertos, fallos);
    int puntosBonus = aplicarBonus(puntosBase, bonus);
    return puntosBonus;
}

private static int calcularPuntosBase(int aciertos, int fallos) {
    return (aciertos * 10) - (fallos * 5);
}

private static int aplicarBonus(int puntos, int bonus) {
    return puntos + (puntos * bonus / 100);
}
```
</td><td valign=top>

Descompone cálculo complejo

Cada paso es un método

Fácil de probar y modificar

</td></tr>
</table>

</div>

### Nombres significativos para la anatomía

<div align=center>

<table>
<tr><th>Tipo de método</th><th>Patrón de nombre</th><th>Ejemplos</th></tr>
<tr><td valign=top>

Métodos que devuelven booleanos

</td><td valign=top>

Prefijos: es, tiene, puede, esta, ha

</td><td valign=top>

```java
esValido()
tienePermiso()
puedeAvanzar()
estaVivo()
haTerminado()
```

</td></tr>
<tr><td valign=top>

Métodos que devuelven valores

</td><td valign=top>

Verbos: calcular, obtener, buscar, contar

</td><td valign=top>

```java
calcularPromedio()
obtenerMaximo()
buscarPosicion()
contarAciertos()
```

</td></tr>
<tr><td valign=top>

Métodos void (acciones)

</td><td valign=top>

Verbos imperativos: mostrar, imprimir, actualizar, procesar

</td><td valign=top>

```java
mostrarMenu()
imprimirTablero()
actualizarEstado()
procesarTurno()
```

</td></tr>
</table>

</div>

### Ejemplo completo: Simulación de carrera

Ver código fuente completo: [CarreraSimple.java](../../src/casosDeUso/CarreraSimple.java)

<div align=center>

<table>
<tr><th>Método</th><th>Tipo</th><th>Responsabilidad</th></tr>
<tr><td valign=top>

```java
haGanado(int posicion)
```
</td><td valign=top>
Función que devuelve booleano
</td><td valign=top>
Verifica condición de victoria
</td></tr>
<tr><td valign=top>

```java
mostrarEstado(int turno, int posicion)
```
</td><td valign=top>
Procedimiento (void)
</td><td valign=top>
Muestra información del juego
</td></tr>
<tr><td valign=top>

```java
calcularAvance()
```
</td><td valign=top>
Función que devuelve int
</td><td valign=top>
Calcula avance aleatorio
</td></tr>
<tr><td valign=top>

```java
actualizarPosicion(int posicionActual, int avance)
```
</td><td valign=top>
Función que devuelve int
</td><td valign=top>
Calcula nueva posición
</td></tr>
<tr><td valign=top>

```java
mostrarVictoria(int turno)
```
</td><td valign=top>
Procedimiento (void)
</td><td valign=top>
Muestra mensaje final
</td></tr>
</table>

</div>

### Reflexión final

La anatomía de los métodos estáticos es el vocabulario para construir programas. Cada elemento (parámetros, retornos, nombres) comunica intención y propósito. Un método bien diseñado es como una frase bien construida: clara, directa y con un significado preciso.

**Puntos clave:**
- Si se necesita un resultado → usar tipo de retorno
- Si se necesitan datos de entrada → usar parámetros
- Si solo se ejecutan acciones → usar void
- Los nombres deben reflejar claramente qué hace el método
