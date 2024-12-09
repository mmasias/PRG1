# Expresión `switch`

## ¿Por qué?

La expresión switch, introducida en Java 12, resuelve los problemas de seguridad y verbosidad de la sentencia switch tradicional eliminando el riesgo de fall-through y la necesidad de break.

## ¿Qué?

Una estructura de control que evalúa una expresión y retorna un valor basado en casos coincidentes, usando la sintaxis con flecha (->).

## ¿Para qué?

- Código más seguro y conciso
- Evaluación de múltiples condiciones
- Asignación directa de valores
- Garantía de exhaustividad en los casos

La expresión switch debe ser la opción predeterminada para nuevo código Java, dejando obsoleta la sentencia `switch` tradicional.

## ¿Cómo?

<div align=center>

<table>
<tr>
<th>Sentencia switch</th>
<th>Expresión switch</th>
</tr>
<tr>
<td valign=top>

```java
String categoria;
switch (puntos) {
   case 90:
   case 91:
   case 92:
       categoria = "A";
       break;
   case 80:
   case 81:
       categoria = "B"; 
       break;
   default:
       categoria = "C";
}
```
</td>
<td valign=top>

```java
String categoria = switch (puntos) {
   case 90, 91, 92 -> "A";
   case 80, 81 -> "B";
   default -> "C";
};
```
</td>
</tr>
<tr>
<td valign=top>

```java

```
</td>
<td valign=top>

```java

```
</td>
</tr>
<tr>
<td valign=top>

```java
int dia = 3;
String nombreDia;

switch (dia) {
    case 1:
        nombreDia = "Lunes";
        break;
    case 2:
        nombreDia = "Martes";
        break;
    case 3:
        nombreDia = "Miércoles";
        break;
    default:
        nombreDia = "Día inválido";
}
```
</td>
<td valign=top>

```java
String nombreDia = switch (dia) {
    case 1 -> "Lunes";
    case 2 -> "Martes";
    case 3 -> "Miércoles";
    default -> "Día inválido";
};
```
</td>
</tr>
<tr>
<td valign=top>

```java

```
</td>
<td valign=top>

```java

```
</td>
</tr>
</tr>
<tr>
<td valign=top>

```java

```
</td>
<td valign=top>

```java

```
</td>
</tr>
</tr>
<tr>
<td valign=top>

```java

```
</td>
<td valign=top>

```java

```
</td>
</tr>
</tr>
<tr>
<td valign=top>

```java

```
</td>
<td valign=top>

```java

```
</td>
</tr>
</table>

</div>