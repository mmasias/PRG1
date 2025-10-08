# Estructuras de control: bloques de código

## ¿Por qué?

El ***bloque de código*** surge de la necesidad de agrupar y organizar múltiples instrucciones en una unidad lógica. En programación, a menudo queremos que ciertas instrucciones se ejecuten juntas o que se traten como una sola entidad.

Los bloques de código nos permiten crear **modularidad** al encapsular funcionalidad relacionada. Además, cada bloque establece su propio **ámbito**, creando fronteras claras que determinan dónde viven y mueren nuestras variables. Esta combinación de agrupación lógica y control de ámbito es fundamental para escribir código organizado y predecible.

## ¿Qué?

Un bloque de código es un conjunto de instrucciones agrupadas que se tratan como una sola unidad. En muchos lenguajes de programación, se delimita utilizando llaves { }, aunque la sintaxis puede variar.

## ¿Para qué?

- **Organización**: Facilita la lectura y comprensión del código al agrupar instrucciones relacionadas.
- **Ámbito**: Define el ámbito de las variables. El ámbito determina dónde una variable puede ser accesible y dónde no. Cada bloque crea su propio "mundo de visibilidad" donde las variables del exterior pueden verse desde el interior, pero las del interior no pueden verse desde el exterior.
- **Control de Flujo**: Sirve como base para estructuras de control de flujo, permitiendo que ciertos bloques de código se ejecuten bajo condiciones específicas o repetidamente.

## ¿Cómo?

En un lenguaje de programación típico como Java o C++:

```java
{
    instrucción1;
    instrucción2;
    instrucción3;
    ...
    ...
    instrucciónN;
}
```

Dentro de las llaves, las instrucciones se ejecutan en orden, desde el inicio del bloque hasta su final. Al introducir estructuras de control de flujo, como sentencias if o bucles for, estos bloques determinan qué instrucciones se ejecutan en función de las condiciones especificadas.

## Ámbito en la práctica

Veamos cómo funciona el ámbito con un ejemplo concreto:

### Reglas de visibilidad

```java
class Ambito {
    public static void main(String[] args) {
        int a = 10;
        {
            int b = 20;
            System.out.println(a);
        }
        System.out.println(b);
    }
}
```

### Principios fundamentales

1. **Visibilidad desde el exterior**: Las variables del ámbito exterior son accesibles desde ámbitos interiores
2. **Invisibilidad desde el interior**: Las variables del ámbito interior NO son accesibles desde el ámbito exterior
3. **Destrucción automática**: Al terminar un bloque, su ámbito y todas sus variables desaparecen

### ¿Por qué es importante?

El ámbito es un concepto fundamental en programación que determina dónde y cuándo podemos usar nuestras variables. Comprender estas reglas de visibilidad nos ayudará a:

- Declarar variables en el lugar correcto
- Evitar errores de compilación
- Escribir código más limpio y organizado
- Controlar el ciclo de vida de nuestras variables
