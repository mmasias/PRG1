# Nombres para métodos

En Java existen convenciones de nomenclatura para métodos bastante establecidas.

> El nombre del método debe explicar claramente qué hace, sin necesidad de mirar su implementación.

## Formato básico

- Comienzan con verbo en infinitivo
- Usa camelCase (primera letra minúscula, siguientes palabras empiezan en mayúscula)

```java
calcularTotal();
obtenerNombre();
esValido();
establecerValor();
```

## Prefijos comunes según propósito

- get: para obtener un valor
- set: para establecer un valor
- is/has/can: para preguntas booleanas
- calculate/compute: para cálculos

```java
getNombre();
setEdad();
isActivo();
hasChildren();
canVote();
calculateTotal();
```

## Específicos++

- Para constructores: mismo nombre que la clase
- Para *getters*: get + *Sustantivo*
- Para *setters* (a.k.a. mutadores): set + *Sustantivo*

```java
public Persona();
public String getNombre();
public void setNombre();
```

## Buenas prácticas

- Nombres descriptivos que indiquen qué hace el método
- Evitar abreviaturas (salvo muy comunes como max, min, avg. Y aun así....)
- Mantener consistencia en todo el código

|Bien|Mal|
|-|-|
|`calcularPromedioNotas()`|`calc();`|
|`obtenerEstudiantePorId()`|`getX();`|
||`hacerCosas();`|
