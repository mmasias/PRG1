# Introducción

## ¿Por qué?

La humanidad gracias a sus herramientas y, en particular, al conocimiento (ciencias, ingenierías, etc.​), ha construido grandes sistemas artificiales: acueductos, telares con tarjetas perforadas, red eléctrica, red telefónica, etc.​ para automatizar tareas: simplificar y reutilizar.

|Año|Elemento/Evento|Descripción||
|:-:|-|-|:-:|
|3000 aec.|[Ábaco](https://es.wikipedia.org/wiki/%C3%81baco)|Los antiguos egipcios y mesopotámicos desarrollan una de las primeras herramientas de cálculo.|![](https://miro.medium.com/v2/resize:fit:640/format:webp/1*wYVwfI9eGZv9Tsx0DaY7Kw.jpeg)|
|100 ec.|[Mecanismo de Anticitera](https://es.wikipedia.org/wiki/Mecanismo_de_Anticitera)|Los griegos crean la primera computadora analógica conocida, diseñada para predecir posiciones astronómicas y eclipses de hasta diecinueve años con propósitos calendarios y astrológicos.|![](https://upload.wikimedia.org/wikipedia/commons/6/66/NAMA_Machine_d%27Anticyth%C3%A8re_1.jpg)|
|1642 ec.|[Pascalina](https://es.wikipedia.org/wiki/Pascalina)|Blaise Pascal construye la primera calculadora mecánica girando ruedas.|![](https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Arts_et_Metiers_Pascaline_dsc03869.jpg/1920px-Arts_et_Metiers_Pascaline_dsc03869.jpg)
|1801 ec.|[Telar de Jacquard](https://es.wikipedia.org/wiki/Telar_de_Jacquard)|Jacquard construye el primer telar mecánico y automático con tarjetas perforadas para definir los dibujos.|![](https://upload.wikimedia.org/wikipedia/commons/5/5f/Jacquard.loom.full.view.jpg)
|1936 ec.|["On computable numbers"](https://www.cs.virginia.edu/~robins/Turing_Paper_1936.pdf)|Alan Turing publica este artículo, estableciendo las [bases teóricas de la ciencia de la computación](99910-maquinaTuring.md).|![](/images/TuringPaper.png)
|1947 ec.|[Transistor](https://es.wikipedia.org/wiki/Transistor)|Se inventa el transistor en los Laboratorios Bell, revolucionando la electrónica y la computación.|![](https://upload.wikimedia.org/wikipedia/commons/f/f6/Replica_of_first_transistor.jpg)
|1969 ec.|[ARPANET](https://es.wikipedia.org/wiki/ARPANET)|Se crea ARPANET, precursora de Internet.|![](https://upload.wikimedia.org/wikipedia/commons/b/bf/Arpanet_logical_map%2C_march_1977.png)
|1981 ec.|[IBM PC](https://es.wikipedia.org/wiki/IBM_PC)|IBM introduce la IBM PC, popularizando las computadoras personales.|![](https://upload.wikimedia.org/wikipedia/commons/6/69/IBM_PC_5150.jpg)

> [Versión extendida](99900-hitosCompletos.md)

## ¿Qué?

|||
|-|-|
|**Software es la información que suministra el desarrollador al ordenador para que manipule de forma automática la información que suministrará el usuario** — Brad Cox|![](/images/modelosUML/software.svg)|

### Naturaleza de lenguajes y formatos

||||
|-|-|-|
Programas en lenguajes de programación (Java, C/C++, …​),|Scripts para la generación de páginas dinámicas en aplicaciones Web (JSP, PHP,…​),|Datos de configuración en diversos formatos (texto libre, XML, JSON, …​)
Scripts para la creación de las tablas de las bases de datos y su población (SQL),|Presentaciones en lenguajes de formato para aplicaciones Web (HTML, CSS, …​)|Multimedia en formatos de imagen, sonido o video para elementos gráficos en la Interfaz de Usuario (*.png, *.waw, *.mpeg, …​)

## ¿Para qué?

|Objeto|Capacidad cualitativa|Capacidad cuantitativa
|-|-|-|
Ser humano|Muy buena: reconocimiento de patrones, asociaciones, recursividad, …​|Muy mala: pequeña, errores por cansancio, desmotivación, …​ y muy lentos
Hardware|Muy mala: ningún computador superó la [prueba de Turing](https://es.wikipedia.org/wiki/Prueba_de_Turing)|Muy buena: sin errores y a toda velocidad

<div align="center">

![](/images/modelosUML/software002.svg)

</div>


- **Efectividad** en la gestión de sistemas de información, requeridos por clientes para diferentes usuarios, con:
  - **Eficacia**, sin errores en cálculos, filtrados, secuencias de acciones, …​
  - **Eficiencia**, con escaso consumo de recursos:
    - Hardware y energía eléctrica.
    - Tiempo de los usuarios para aprender y explotar el producto software.

### Sistema de información

#### Sistema

> Un Sistema es un conjunto de componentes interactuando o interdependientes formando un todo integrado. Cada sistema está delimitado por sus límites espacio/temporales e influenciado por su entorno, descrito por su estructura y propósito y expresado en su funcionamiento.

##### Sistema complejo

> Un Sistema Complejo es aquel cuya complejidad excede la capacidad intelectual humana — Booch

[Complejidad...](https://docs.google.com/presentation/d/1FBjSPhSYrgBQjVp8HefkiJA_AwJU_bq24b8WMz3xzOA/edit?usp=sharing)

#### Información

[Conocimiento...](https://docs.google.com/presentation/d/1QJdg8M0iOwv1gxydwcza6X0dkZmrlaxFf1PH87X7gRo/edit?usp=sharing) (*diapo 11*)

#### Sistema de Información

Un sistema de información es un conjunto de elementos orientados al tratamiento y administración de datos e información, organizados y listos para su uso posterior, generados para cubrir una necesidad o un objetivo.

<div align="center">

|Tratamiento|de la|información|
|-|:-:|-|
|**C**reate|+|Altas
|**R**ead|?|Consultas
|**U**pdate|~|Modificaciones
|**D**elete|-|Bajas

</div>

## ¿Cómo?

### Complejidad del software

*El trabajo con software es el más complejo que jamás haya emprendido la humanidad* — F. Brooks

<div align="center">

|Proyecto|Proyecto software|El Quijote de la Mancha
|-|-|-|
Extensión|100.000 lineas/proyecto mediano<br>~3 palabras/línea|300.000 palabras
Entidades|identificadores …​ centenares|Dulcinea, Sancho Panza, …​ decenas
Autor|6-8 personas|Miguel de Cervantes Saavedra
Duración|entre 6 meses y años|18 años
Coste|miles de €|gratis en la cárcel
Ámbito|Otra persona cambiante|Suyo

</div>

|Sistema|Sistema complejo|
|-|-|
Software es un conjunto de clases/módulos relacionándose por herencia, composición, … o interdependientes formando una aplicación. Cada aplicación está delimitada por su entorno tecnologíco-comercial, descrito por su arquitectura del software y requisitos y expresado en su ejecución|Software de una aplicación media (~100.000 líneas de código) tiene una complejidad que excede con creces la capacidad intelectual humana

|Sistema complejo|Software
|-|-|
Estructura jerárquica|Gracias a sus jerarquías de herencia, composición, paquetes con clases con atributos y métodos, métodos con sentencias, sentencias con expresiones, …​
Elementos primitivos relativos|Gracias a sus tipos primitivos dependiendo del lenguaje (enteros, cadena de caracteres?, fechas?, …) y los definidos por el usuario
Separación de asuntos|Gracias a la encapsulación y modularidad
Patrones comunes|Gracias a algunos métodos de clases que corresponden al paso de mensajes a objetos
Formas intermedias estables|Gracias a las metodologías iterativas o por culpa de nuevas tecnologías o nuevas necesidades

### Proyecto de Software

|Proyecto|Proyecto Software|
|-|-|
![](/images/2560px-Project-triangle-en.svg.png)|![](/images/modelosUML/variablesProyectoSoftware.svg)
|No hay una relación sencilla entre las cuatro variables.| *Ej.: no puedes reducir el tiempo a la mitad, gastando el doble*
*La forma de hacer en este modelo del juego del desarrollo del software es que las fuerzas externas (clientes, directores de proyecto) eligen los valores de tres variables cualquiera. El equipo de desarrollo determina el valor resultante de la cuarta variable* — Beck 1999|*Algunos directores de proyecto y clientes creen que pueden escoger el valor de las cuatro variables. Cuando esto suceda, la calidad siempre desaparecerá, ya que nadie hace bien el trabajo cuando está sujeto a una fuerte presión. También, probablemente, el tiempo estará fuera de control* — Beck 1999

#### Ámbito

Probablemente la más importante a tener en cuenta

|Naturaleza|Gestión|
|-|-|
Poco ámbito permite entregar más rápido, con más calidad (mientras el problema del cliente esté resuelto) y más barato|Intentando no hacer demasiado, mantenemos nuestra capacidad de producir la calidad requerida en un tiempo determinado.
El ámbito es variable porque:<br><br>- Los programadores y el personal del negocio no tienen más que una idea vaga sobre lo que tiene valor en el software que se está desarrollando<br>- Los requisitos nunca están claros al principio y los clientes no pueden decirnos exactamente lo que quieren.<br>- El desarrollo de una pieza de software cambia sus propios requisitos ya que tan pronto como el cliente ve la primera versión, aprenden lo que quieren para la segunda versión …​ o lo que realmente querían en la primera.|Si se gestiona activamente el ámbito, se puede proporcionar a los directores de proyecto y clientes control sobre el coste, calidad y tiempo.<br>Eliminar ámbito es una de las decisiones más importantes en la gestión del proyecto<br><br>- Si el tiempo está limitado por la fecha de lanzamiento de una versión, hay siempre algo que podemos diferir a la siguiente versión.<br>- Si dejas fuera importante funcionalidad al final de cada ciclo de versión, el cliente quedará disgustado.

#### Tiempo

||||
|-|-|-|
Si damos a un proyecto poco tiempo, la calidad sufre, con el ámbito. Las restricciones de controlar proyectos controlando el tiempo, generalmente vienen de fuera, de las manos del cliente.|Disponer de más tiempo para la entrega puede mejorar la calidad e incrementar el ámbito.|Ya que la realimentación desde los sistema en producción es de mayor calidad que cualquier otra clase de realimentación, dar a un proyecto demasiado tiempo será perjudicial.

#### Coste

Al comienzo de un proyecto no puedes gastar mucho, la inversión tiene que comenzar siendo pequeña y crecer con el tiempo. Después, se puede de forma productiva gastar más y más dinero.

||||
|-|-|-|
Mucho dinero puede engrasar la maquinaria un poco, pero demasiado dinero pronto crea más problemas que resuelve.|Dentro del rango de inversión que pueda sensatamente hacerse, gastando más dinero puedes aumentar el ámbito, o puedes intentar de forma más deliberada aumentar la calidad, o puedes (hasta cierto punto) reducir el tiempo de salida al mercado.|Muy poco dinero, no permite resolver el problema del negocio del cliente. Todas las restricciones sobre el coste pueden volver locos a los directores de proyecto.

#### Calidad

Hay una extraña relación entre la calidad interna (que miden los programadores) y externa (que mide el cliente).

|||
|-|-|
Sacrificar temporalmente la calidad interna para reducir el tiempo de salida al mercado del producto, con la esperanza que la calidad externa no se vea muy dañada es tentador a corto plazo. Y puedes con frecuencia hacerlo impunemente generando una confusión en cuestión de semanas o meses. Al fin y al cabo, los problemas de calidad interna te alcanzan a ti y hacen que tu software sea prohibitivamente caro de mantener.|A menudo, al insistir en la mejora de la calidad puedes hacer que el proyecto esté listo en menos tiempo, o puedes conseguir hacer más en un una cantidad de tiempo dada. Se trabaja mejor si no se desmoraliza al producir software basura.
*La observación general es que el principal enemigo de la fiabilidad, y tal vez de la calidad del software en general, es la complejidad* — Meyer|*Cuanto más complejo sea un sistema, más abierto está al colapso total. Gran parte de la complejidad que se tiene que dominar es la complejidad arbitraria* — Booch

##### Características del software

|||
|-|-|
Fiabilidad|Que cumpla una determinada función bajo ciertas condiciones durante un tiempo determinado
Extensibilidad|Habilidad de tener la posibilidad de se extendido con nuevas funcionalidades
Usabilidad|Sencillo de usar porque facilita la lectura de los textos, descarga rápidamente la información y presenta funciones y menús sencillos, por lo que el usuario encuentra satisfechas sus consultas y cómodo su uso
Accesibilidad|Que pueda ser accedido y usado por el mayor número posible de personas, indiferentemente de las limitaciones propias del individuo o de las derivadas del contexto de uso
Seguridad|Proteger los datos que tiene, maneja y dispone para preservar la confidencialidad, la integridad y la disponibilidad
Confidencialidad|Con acceso a la información mediante autorización y control para prevenir la divulgación no autorizada de la información
Integridad|para modificar la información mediante autorización
Disponibilidad|Degradación en cuanto a accesos para prevenir interrupciones no autorizadas
Interoperabilidad|Habilidad de dos o más sistemas o componentes para intercambiar información y utilizar la información intercambiada
Portabilidad|Habilidad de reutilizar en vez de crear un nuevo software cuando se pasa de una plataforma a otra
Escalabilidad|Habilidad para reaccionar y adaptarse sin perder calidad cuando aumentan el tamaña del sistema de información

#### Mantenibilidad

Habilidad de conservar su funcionamiento normal o para restituirlo una vez se ha presentado un evento de falla o un nuevo requisito

|Correctiva|Perfectiva|Adaptativa|
|-|-|-|
Para la eliminación de errores de cualquier otra cualidad.|Para la modificación de su funcionalidad con cualquier otra cualidad.|Para la modificación de su infraestructura para cualquier otra cualidad.

<div align="center">

|No mantenible|Mantenible|
|-|-|
**Viscoso**: no se puede entender con facilidad    |**Fluido**: se puede entender con facilidad
**Rígido**: no se puede cambiar con facilidad      |**Flexible**: se puede cambiar con facilidad
**Frágil**: no se puede probar con facilidad       |**Fuerte**: se puede probar con facilidad
**Inmóvil**: no se puede reutilizar con facilidad  |**Reusable**: se puede reutilizar con facilidad

</div>

##### Viscosidad vs Fluidez

Viscosidad es la dificultad para entender el código en su completitud.

<div align="center">

|Viscosidad del diseño|Viscosidad del entorno|
|-|-|
Se produce cuando nos enfrentamos a un cambio, los ingenieros suelen encontrar más de una manera de hacer el cambio. Algunas de las formas conservan el diseño, otros no lo hacen, es decir, son atajos.|Se produce cuando el entorno de desarrollo es lento e ineficiente. Por ejemplo, si los tiempos de compilación son muy largos, los ingenieros tendrán la tentación de hacer cambios que no obligan a grandes re-compilaciones, a pesar de que esos cambios no son óptimos desde el punto de vista del diseño.
*Cuando preservar el diseño es más difícil que emplear los atajos, a continuación, la viscosidad del diseño es alta.*|*Si el sistema de control de código fuente requiere horas para comprobar tan sólo unos pocos archivos, consecuentemente, los ingenieros tendrán la tentación de hacer cambios que requieren el menor número de subidas (commits) como sea posible, independientemente de si el diseño se conserva.*
*Es fácil de hacer las cosas mal, pero difícil de hacer lo correcto.*

</div>

#### Rigidez vs Flexibilidad

Rigidez es la tendencia del software a ser difícil de cambiar, incluso en formas simples.

<div align="center">

||||
|-|-|-|
Cada cambio provoca una cascada de cambios posteriores en los módulos dependientes. Lo que comienza como un simple cambio de dos días a un módulo se convierte en un maratón de varias semanas de cambios en el módulo después de otros módulos según los ingenieros persiguen el hilo del cambio a través de la aplicación.|Cuando el software se comporta de esta manera, los gerentes temen que no permitirá a los ingenieros solucionar problemas críticos. Esta resistencia se deriva del hecho de que ellos no saben, con confiabilidad, cuando terminarán. Si los gerentes insisten, los ingenieros se perderán en este tipo de problemas, que pueden desaparecer durante largos periodos de tiempo.|Cuando los miedos del gerente son tan agudos que se niegan a permitir cambios en el software, la rigidez oficial se instala. Por lo tanto, lo que comienza como una deficiencia de diseño, termina siendo una política de gestión adversa.

</div>

#### Inmovilidad vs Reusabilidad

Inmovilidad es la imposibilidad de volver a utilizar el software de otros proyectos o de partes del mismo proyecto.

<div align="center">

|||
|-|-|
A menudo sucede que un ingeniero descubrirá que necesita un módulo que es similar a uno que escribió otro ingeniero. Sin embargo, también sucede a menudo que el módulo en cuestión tiene demasiado equipaje del que depende.|Después de mucho trabajo, los ingenieros descubren que el trabajo y el riesgo requerido para separar las partes deseables del software de las partes no deseadas son demasiado grandes como para tolerarlo. Y así, el software es simplemente reescrito en lugar de reutilizado.

</div>

#### Fragilidad vs Fortaleza

Fragilidad es la tendencia del software para estropearse en muchos lugares cada vez que se cambia. A menudo, el error se produce en las zonas que no tienen ninguna relación conceptual con el área que se ha cambiado..

<div align="center">

|||
|-|-|
Según empeora la fragilidad, la probabilidad de error aumenta con el tiempo, asintóticamente acercándose al 100%. Este tipo de software es imposible de mantener. Cada solución hace que sea peor, la introducción de más problemas que soluciones.|Tales errores llenan las sensaciones de los gerentes de malos presagios. Cada vez que autorizan una solución, temen que el software va a estropearse de alguna manera inesperada. Este tipo de software hace que los gerentes y los clientes sospechen que los desarrolladores han perdido el control de su software. La desconfianza reina, y la credibilidad se pierde.

</div>

*No se convierte uno en un maestro del software aprendiendo una lista de heurísticas. El profesionalismo y la maestría provienen de valores impulsados por las disciplinas* — Martin Fowler

[El código debería ser poesía...](https://github.com/mmasias/carreraCaballos/blob/main/Carrera.java)

### Crisis del Software

La Crisis del Sotfware es la **incapacidad** para dominar la complejidad de los proyectos software.

*Como comparativa entre 2011 a 2015 se analizaron más de 50.000 proyectos alrededor del mundo, desde proyectos muy pequeños a proyectos grandes de implementación de sistemas:*

<div align=center>

|![](/images/grafica-exito-proyectos-software.png)|
|:-:|
Fuente: Informes CHAOS del [Standish Group](www.standishgroup.com).

</div>


<div align="center">

Motivos de Proyectos Fracasados/Problemáticos|Incidencia
|-|-:|
**Gestión**                                    |**31.0%**
Falta del involucración del usuario            |12.8%
Poco apoyo de las gerencias involucradas       |7.5% 
Falta de recursos                              |6.4% 
Tiempos poco realistas                         |4.3% 
**Requisitos**                                 |**35.3%**
Requerimientos y especificaciones poco claras  |12.3%
Cambio de requerimientos y especificaciones    |11.8%
Expectativas poco realistas                    |5.9% 
Objetivos poco claros                          |5.3% 
**Tecnologías**                                |**10.7%**
Tecnología deficiente                          |7.0% 
Nuevas tecnologías                             |3.7% 
**Otros**                                      |**23.0%**

</div>

### ¿Qué hacer?

- [Disciplinas del software](00001-disciplinasSw.md)