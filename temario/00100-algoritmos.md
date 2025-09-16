# Algoritmos

## ¿Por qué?

- Necesidad de sistematización.
  - Los seres humanos siempre han buscado formas de sistematizar procesos para resolver problemas recurrentes.
  - Los algoritmos proporcionaron un método para describir estos procesos de manera precisa y repetible.
- Evolución del pensamiento matemático.
  - Las civilizaciones antiguas desarrollaron métodos sistemáticos para realizar cálculos y resolver problemas geométricos.
  - Estos métodos pueden considerarse como los precursores de los algoritmos modernos.
- Avances en la computación.
  - Con el desarrollo de las primeras computadoras en el siglo XX, surgió la necesidad de instrucciones precisas que estas máquinas pudieran seguir.
  - Los algoritmos se convirtieron en el lenguaje fundamental para comunicar instrucciones a las computadoras.

## ¿Qué?

|||
|-|-|
|Secuencia finita y bien definida de instrucciones o pasos que se siguen para resolver un problema o realizar una tarea específica.|Es una herramienta conceptual que puede implementarse de diversas formas, independientemente de la tecnología utilizada.|

|||
|-|-|
Carácter finito|Los algoritmos deben terminar en un **número finito** de pasos, esto garantiza que se pueda dar respuesta al problema planteado.
Precisión|Cada paso del algoritmo debe ser especificado de manera precisa, rigurosa y **sin ambigüedades**. Estos deben definirse de manera que su significado sea entendido. Cuando los algoritmos cumplen con esta propiedad solo dependen de los datos de entrada y de los resultados de pasos anteriores.
Entrada|Un algoritmo tiene **cero o más entradas** para ser procesadas y dar solución al problema.
Salida|Los algoritmos producen **una o más salidas**; siempre deben generan al menos un resultado que está relacionados con sus datos de entrada.
Efectividad|Todas las operaciones que realiza deben ser suficientemente básicas como para ser desarrolladas de modo exacto y en un tiempo finito.

## ¿Para qué?

- Resolver problemas de manera eficiente.
- Automatizar procesos.
- Obtener consistencia y precisión en las operaciones.

### Para

- Solución de problemas en matemáticas, ciencia, ingeniería.
- Procesamiento de datos e información.
- Automatización en la industria.
- Tomar decisiones basadas en datos.
- Desarrollo de software y aplicaciones.
- Inteligencia artificial y aprendizaje automático.

## ¿Cómo?

### Componentes y Estructura

|Entrada|Proceso|Salida|
|-|-|-|
|Datos iniciales sobre los que se va a operar.|Una serie de pasos que se siguen en un orden específico.<br>Operaciones básicas (suma, resta, comparaciones).<br>Decisiones y repeticiones.|Solución al problema inicial.|

### Diseño de Algoritmos

Se trata de construir/diseñar/crear un algoritmo efectivo

- Definir claramente el problema
- Identificar las entradas y salidas esperadas
- Diseñar los pasos del proceso
- Verificar la lógica y corregir errores
- Optimizar para mejorar la eficiencia

#### Técnicas comunes

- Divide y vencerás
- Programación dinámica
- Algoritmos voraces (greedy)
- Backtracking

### Complejidad algorítmica

La eficiencia de un algoritmo se mide en términos de:

- Tiempo de ejecución (complejidad temporal)
- Uso de memoria (complejidad espacial)

Se utiliza la notación Big O para expresar la complejidad, por ejemplo:

- O(1): Tiempo constante
- O(log n): Logarítmico
- O(n): Lineal
- O(n²): Cuadrático

---

**Hemos visto qué son los algoritmos y sus características fundamentales. Para implementar estos algoritmos en soluciones ejecutables, necesitamos herramientas de comunicación con las máquinas.**

> **Siguiente**: [Lenguajes de programación](00200-lenguajesDeProgramacion.md) - Explorando las herramientas que nos permiten expresar algoritmos de forma que las computadoras puedan ejecutarlos.
