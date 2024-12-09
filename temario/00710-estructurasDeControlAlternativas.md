
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