# Notas sobre rendimiento

El rendimiento de las matrices las hace ideales para muchas aplicaciones, pero es importante considerar sus limitaciones, especialmente en términos de memoria y flexibilidad.

## Acceso a elementos

- **Tiempo de acceso**: *O(1)* - Constante
- **¿Por qué?**: La matriz almacena elementos en posiciones de memoria contiguas
- **Ventaja**: Acceso directo mediante el índice sin necesidad de recorrer elementos previos

```java
int elemento = matriz[5];
```

## Memoria

Los elementos se guardan en bloques consecutivos de memoria: ***Almacenamiento contiguo***.

- **Ventajas**:
  - Mejor uso de la caché del procesador
  - Predicción de acceso más eficiente
  - Menos fragmentación de memoria
- **Desventajas**:
  - Necesita un bloque continuo de memoria
  - Puede ser un problema con matrices muy grandes
  - No puede crecer dinámicamente

## Operaciones comunes

**Recorrido**: *O(n)* - Lineal. Cada elemento se visita una vez:

```java
for (int i = 0; i < matriz.length; i++) {
    (...)
}
```

**Búsqueda (lineal)**: *O(n)* - Lineal. Hay que recorrer hasta encontrar el elemento:

```java
for (int elemento : matriz) {
    if (elemento == buscado) { 

    }
}
```

## Impacto en memoria

<div align=center>

|Tipos primitivos|Objetos|Matrices multidimensionales|
|-|-|-|
|Tamaño fijo conocido|Referencias + espacio del objeto|Multiplicación de dimensiones|

</div>

```java
int[] matriz = new int[1000000];
```

Para el ejemplo anterior, alrededor de 4MB (4 bytes por int)
