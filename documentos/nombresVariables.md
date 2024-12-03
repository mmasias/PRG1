# Nombres para variables

En Java se proponen convenciones comunes para nombrar variables, que aunque no son reglas estrictas del lenguaje, ayudan a mejorar su legibilidad.

> El nombre de la variable debe indicar claramente qué contiene o para qué se usa.

## Formato básico

- Usar camelCase (primera letra minúscula, siguientes palabras empiezan en mayúscula)
- Debe ser un sustantivo o frase nominal

```java
int edad;
String nombreCompleto;
double precioTotal;
```

## Constantes

- Todo en mayúsculas
- Palabras separadas por guión bajo

```java
final int MAX_EDAD = 120;
final double PI = 3.14159;
final String NOMBRE_EMPRESA = "MiEmpresa";
```

## booleanos

- Suelen empezar con is (está), has (tiene), can (puede) o similar

```java
boolean isActivo;
boolean hasChildren;
boolean canVote;
```

## Variables de bucle

- Tradicionalmente i, j, k para índices simples
- Nombres más descriptivos para bucles complejos

```java
for (int i = 0; i < 10; i++) { (...) }  
for (int indiceEstudiante = 0; indiceEstudiante < total; indiceEstudiante++) { (...) }  
```

## Buenas prácticas

- Nombres significativos y descriptivos
- Evitar nombres de una letra (excepto índices simples)
- No usar nombres que empiecen con número
- Evitar abreviaturas no estándar

|Bien|Mal|
|-|-|
|`int edad;`|`int a;`|
|`String nombreUsuario;`|`String n;`|
|`double precioUnitario;`|`double x123;`|
