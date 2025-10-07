# Estructuras de control: alternativas

## ¿Por qué?

Los programas requieren tomar decisiones basadas en condiciones específicas. Sin estructuras alternativas, el código ejecutaría las mismas instrucciones independientemente del contexto o los datos de entrada, limitando drásticamente la capacidad de crear soluciones adaptativas. La toma de decisiones es fundamental para validar datos, manejar diferentes escenarios y construir lógica compleja que responda a situaciones variables.

## ¿Qué?

Las estructuras alternativas, también denominadas condicionales o de selección, son construcciones que permiten ejecutar diferentes bloques de código según el resultado de evaluar una o más condiciones. Estas estructuras determinan el flujo de ejecución del programa mediante expresiones booleanas que resultan en verdadero o falso.

## ¿Para qué?

|||
|-|-|
Validación|Verificar que los datos cumplan criterios establecidos
Control de flujo|Dirigir la ejecución según el estado del programa
Manejo de casos|Responder a diferentes escenarios posibles
Implementación de lógica|Materializar reglas de negocio complejas
Prevención de errores|Evitar operaciones inválidas mediante verificaciones previas

## ¿Cómo?

### Condición simple

Evaluar una condición y ejecuta el bloque de código solo si esa condición es verdadera.

<div align=center>

![](/images/modelosUML/alternativas001.svg)

</div>

```java
if (condicion) 
    // Código o bloque de código que se ejecuta si la condición es verdadera
```

### Condición con alternativa

Evalua una condición y ofrece un segundo bloque de código como alternativo, si la condición resulta ser falsa.

<div align=center>

![](/images/modelosUML/alternativas002.svg)

</div>

```java
if (condicion) 
    // Código o bloque de código que se ejecuta si la condición es verdadera
else 
    // Código o bloque de código que se ejecuta si la condición es falsa
```

### Condiciones anidadas

Evalua múltiples condiciones en cadena y decide qué bloque de código ejecutar basado en la primera condición verdadera. Adicionalmente, se puede proponer un bloque de código a ejecutarse si ninguna condición resulta ser verdadera.

<div align=center>

![](/images/modelosUML/alternativas003.svg)

</div>

```java
if (condicion1) 
    // Código o bloque de código para condicion1
else if (condicion2) 
    // Código o bloque de código para condicion2
else 
    // Código o bloque de código si ninguna de las condiciones anteriores es verdadera
```

### Condición múltiple por casos

<div align=center>

![](/images/modelosUML/alternativas004.svg)

</div>

Se diferencia de las condiciones anidadas porque no evalúa diferentes variables o expresiones, sino diferentes valores de una misma expresión.

> Se recomienda el uso de la [expresión switch](00715-expresionSwitch.md)

<div align=center>

<table>
<tr>
<th>Sentencia switch</th>
<th>Expresión switch</th>
</tr>
<tr>
<td valign=top>

```java
switch(opcion) {
   case 1:
       System.out.println("Iniciando proceso");
       iniciarProceso();
       break;
   case 2:
       System.out.println("Deteniendo proceso");
       detenerProceso();
       break;
   default:
       System.out.println("Opción no válida");
       break;
}
```
</td>
<td valign=top>

```java
switch(opcion) {
   case 1 -> {
       System.out.println("Iniciando proceso");
       iniciarProceso();
   }
   case 2 -> {
       System.out.println("Deteniendo proceso");
       detenerProceso();
   }
   default -> System.out.println("Opción no válida");
}
```
</td>
</tr>
<tr>
<td valign=top>

```java
switch(nota) {
   case 'A':
       mensaje = "Excelente";
       break;
   case 'B':
       mensaje = "Notable";
       break;
   case 'C':
       mensaje = "Aprobado";
       break;
   default:
       mensaje = "Suspenso";
       break;
}
```
</td>
<td valign=top>

```java
mensaje = switch(nota) {
   case 'A' -> "Excelente"
   case 'B' -> "Notable" 
   case 'C' -> "Aprobado"
   default -> "Suspenso"
};
```
</td>
</tr>
</table>

</div>

### Comparación entre estructuras

<div align=center>

|Estructura|Uso típico|Número de condiciones|Valor de retorno|
|-|:-:|:-:|:-:|
|if simple|Validación única|1|No|
|if-else|Decisión binaria|1|No|
|if-else if|Múltiples condiciones|2+|No|
|switch|Múltiples valores de una expresión|2+|Sí (expresión)|

</div>

### Operador ternario

Para asignaciones simples basadas en condiciones, existe el [operador ternario](../documentos/ternarioOif.md):

```java
int max = (a > b) ? a : b;
```

**Uso recomendado:** Asignaciones o retornos simples basados en una única condición.

**Cuándo no usarlo:**
- Condiciones anidadas
- Lógica compleja
- Múltiples instrucciones por rama

Consultar [¿If u operador ternario?](../documentos/ternarioOif.md) para criterios detallados.

### Casos de uso documentados

Varios [casos de uso](../temario/casosDeUso/README.md) ilustran el uso de estructuras alternativas:

- [Menu](../temario/casosDeUso/menu.md): Selección entre múltiples opciones
- [Verificador](../temario/casosDeUso/verificador.md): Validación con if y ternario

### Consideraciones de legibilidad

La elección entre estructuras debe priorizar la claridad:

- **if-else if** es más legible cuando las condiciones evalúan diferentes aspectos
- **switch** es más claro cuando se evalúan múltiples valores posibles de una misma expresión
- **Operador ternario** solo para asignaciones simples y directas

Cuando la legibilidad se compromete, se opta por la estructura más explícita, incluso si resulta más verbosa.
