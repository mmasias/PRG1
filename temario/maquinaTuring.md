# Máquina de Turing

Una *máquina de Turing*, según la describe Alan Turing en su paper de 1936, puede entenderse como:

1. Una cinta infinita dividida en cuadrados: Esta cinta es como un papel muy largo dividido en casillas.
1. Un cabezal de lectura/escritura: Este cabezal puede leer el símbolo en un cuadrado de la cinta, escribir un nuevo símbolo, y moverse a la izquierda o a la derecha.
1. Un número finito de estados o "configuraciones-m": Estos son como los "estados mentales" de la máquina.
1. Un conjunto finito de símbolos: La máquina puede leer y escribir estos símbolos en la cinta.
1. Una tabla de instrucciones: Esta tabla le dice a la máquina qué hacer (escribir un símbolo, moverse, cambiar de estado) basándose en el símbolo que está leyendo y su estado actual.

La máquina opera paso a paso, siguiendo las instrucciones de su tabla. En cada paso:

- Lee el símbolo en el cuadrado actual
- Basándose en este símbolo y su estado actual, la máquina:
  - Escribe un nuevo símbolo (o deja el mismo)
  - Se mueve a la izquierda o a la derecha
  - Cambia a un nuevo estado (o se mantiene en el mismo)

Este proceso continúa hasta que la máquina alcanza un estado de "alto" o continúa indefinidamente.

## Implementación

Supongamos que queremos diseñar una máquina de Turing que sume 1 a un número binario.

### Configuración inicial

|||
|-|-|
|**Estados**|`q1` (estado inicial), `q2`, `q3` (estado final)|
|**Símbolos**|`0`, `1`, `B` (blanco)|
|**Cinta**|Inicialmente contiene un número binario|

### Tabla de instrucciones

| Estado Actual | Símbolo Leído | Escribir | Movimiento | Nuevo Estado |
|:-:|:-:|:-:|:-:|:-:|
|q1|0|1|Derecha|q3|
|q1|1|0|Izquierda|q2|
|q1|B|1|Derecha|q3|
|q2|0|1|Derecha|q3|
|q2|1|0|Izquierda|q2|
|q2|B|1|Derecha|q3|

---

|Diagrama de actividades|Diagrama de Estados|
|:-:|:-:|
|![](/images/modelosUML/modelosUML/turingActividades.svg)|![](/images/modelosUML/modelosUML/turingEstados.svg)|

### Ejemplo de Operación

#### Sumar 1 al número 110

Estado: q1

```
   Cinta: ...B110B...
                ^
```

Lee 0 -> escribe 1 -> mueve derecha -> cambia a q3

```
   Cinta: ...B111B...
                 ^
```

Estado: q3

> Resultado: 111 (7 en decimal)

#### Sumar 1 a 111

Estado: q1

```
   Cinta: ...B111B...
                ^
```

Lee 1 -> escribe 0 -> mueve izquierda -> cambia a q2

```
   Cinta: ...B110B...
               ^
```

Lee 1 -> escribe 0 -> mueve izquierda -> cambia a q2

```
   Cinta: ...B100B...
              ^
```

Lee 1 -> escribe 0 -> mueve izquierda -> cambia a q2

```
   Cinta: ...B000B...
             ^
```

Lee B -> escribe 1 -> mueve derecha -> cambia a q3

```
   Cinta: ...1000B...
              ^
```

Estado: q3

> Resultado: 1000 (8 en decimal)