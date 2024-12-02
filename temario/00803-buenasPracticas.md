# Buenas prácticas

## Validación de índices

Preste especial atención a los índices de acceso a los elementos de la matriz.

## Manejo de matrices vacías

Preste especial atención a si una matriz es nula o está vacía antes de trabajar con ella

```java
    if (matriz == null) 
        System.out.println("La matriz es nula");

    if (matriz.length == 0) 
        System.out.println("La matriz está vacía");
```

## Elección de estructura de datos

La elección entre una matriz y otra estructura de datos debe basarse en los requisitos específicos del programa: patrones de acceso, modificaciones esperadas y restricciones de rendimiento.

- **Cuándo usar matrices**
  - Tamaño fijo conocido.
  - Acceso directo por índice frecuente.
  - Operaciones simples (lectura/escritura).
  - Importancia del rendimiento en memoria.
- **Cuándo considerar otras estructuras**
  - Cuando el tamaño puede variar.
  - Cuando hay muchas inserciones/eliminaciones.
  - Cuando necesitamos elementos únicos.
  - Cuando necesitamos pares clave-valor.

## Documentación clara

- Es conveniente documentar el propósito y comportamiento esperado de las matrices
- Por supuesto ***no usando comentarios en código***

## Dimensionamiento adecuado

<div align=center>

|Planificación|Evitar|Considerar
|-|-|-|
|Definir el tamaño apropiado según el uso previsto|Sobredimensionar "por si acaso"|El impacto en memoria de matrices muy grandes

</div>
