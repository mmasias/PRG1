<div align=right>

|[![](https://img.shields.io/badge/-Playlist-FFF?style=flat&logo=spotify)](https://open.spotify.com/playlist/5GkfEI8f3B2PJou79lGP2x?si=a457980778d34971)
|-

</div>

# Matrices

## [`Matrices.java`](Matrices.java)

|Momento|¿Por qué?/¿Qué?/¿Para qué?|¿Cómo?|Canción|
|-|-|-|-|
|1|Entender qué referencias apuntan al mismo bloque de memoria; saber *qué* comparan `==` y `!=` y *para qué* sirve distinguirlas.|Declarar `original`, `alias`, `independiente`, `espejo`, `fantasma` y `copiaFantasma` y comparar con `==`. |  [*Shine on you crazy diamond*](https://www.youtube.com/watch?v=lKJ8n8xYd-Q) |
|1 bis|Reforzar que “igual” no es “lo mismo”: comparar contenido para anticipar cuándo usar `Arrays.equals` o bucles manuales.|Recorrer `original` e `independiente`, y tratar aparte el caso `null`.|  [*Come together*](https://www.youtube.com/watch?v=oolpPmuK2I8) |
|2|Mostrar que las primitivas son copias, no referencias compartidas, y por qué eso importa.|Crear un array con primitivas, cambiar las variables y comprobar que el array no cambia.|  [*Sympathy for the devil*](https://www.youtube.com/watch?v=Jwtyn-L-2gQ) |
|3|Practicar el clonado manual para valorar cuándo usar utilidades y por qué un clone superficial duplica contenido.|Copiar elemento a elemento y comparar direcciones y valores.|  [*Comfortably numb*](https://www.youtube.com/watch?v=oIZUJ4Msv7U&t=32s) |
|4|Ver el efecto inmediato de modificar referencias y cómo cambian varias variables a la vez.|Reasignar posiciones y comparar con alias/espajo.|  [*Start me up*](https://www.youtube.com/watch?v=SGyOaCXr8Lw) |
|5|Explorar qué pasa cuando una referencia se separa del array original y se queda con un nuevo objeto.|Reasignar `alias` a un nuevo array y comparar valores.|  [*Freebird*](https://www.youtube.com/watch?v=QxIWDmmqZzY) |
|6|Practicar intercambio de referencias sin crear arrays: el “para qué” es entender el modelo mental de punteros.|Hacer swaps entre `independiente` y `alias` con un temp.|  [*Jumpin' jack flash*](https://www.youtube.com/watch?v=G3dFpQzu54w) |
|7|Construir un array nuevo a partir de otro para visualizar cuándo se pierde una referencia y por qué.|Invertir manualmente `independiente` en `reconstruido`.|  [*Stairway to heaven*](https://www.youtube.com/watch?v=QkF3oxziUI4) |
|8|Recordar que `null` necesita encarnarse antes de usarse y practicar el acceso a referencias compartidas.|Crear `fantasma`, reasignarlo y comprobar aliasing.|  [*Wish you were here*](https://www.youtube.com/watch?v=IXdNnw99-Ic) |
|9|Cerrar todas las ideas comprobando quién sigue apuntando a qué y asegurando que se entiende el estado final.|Crear un bloque final con referencias compartidas y comparar.|  [*The end*](https://www.youtube.com/watch?v=12R4FzIhdoQ) |

## [`Matrices2.java`](Matrices2.java)

|Momento|¿Por qué?/¿Qué?/¿Para qué?|¿Cómo?|Canción|
|-|-|-|-|
|A|Panorámica inicial para ver qué es cada fila y cómo se comportan las referencias en 2D.|Comparar referencias entre filas de una matriz rectangular.| [*A day in the life*](https://www.youtube.com/watch?v=usNsCeOV4GM)|
|B|Demostrar que una misma fila puede repetirse y reflejar cambios como un eco.|Reutilizar `unaFila` en varias posiciones y alterar un valor.| [*Echoes*](https://www.youtube.com/watch?v=OF4rw3LOfqY)|
|C|Introducir matrices irregulares y la rotación de filas como intercambio de referencias.|Realizar swaps en un array ragged.| [*Kashmir*](https://www.youtube.com/watch?v=sfR_HWMzgyc)|
|D|Reforzar que las primitivas copian valores incluso dentro de arrays bidimensionales.|Crear filas desde primitivas y mostrar que luego siguen igual.| [*Across the universe*](https://www.youtube.com/watch?v=jfVOmE1yoRo)|
|E|Ilustrar la importancia de controlar filas `null` y cómo evitar `NullPointerException`.|Verificar `permiteNull` antes de acceder.| [*Under pressure*](https://www.youtube.com/watch?v=a01QQZyl-_I)|
|F|Mostrar el concepto de “historial” y cómo rescatar filas tras perder la matriz original.|Guardar y reconstruir filas desde otra estructura.| [*Back in black*](https://www.youtube.com/watch?v=pAgnJDJN4VA)|
|G|Comparar copia superficial vs profunda en 2D: para entender aliasing en matrices.|Clonar fila por fila y alterar cada copia.| [*Mirror in the bathroom*](https://www.youtube.com/watch?v=iFbwOhV137Q)|
|H|Ejercitar un recorrido final respetando `null`, reforzando el control de huecos.|Recorrer manualmente columnas y simular for-each.| [*Road to nowhere*](https://www.youtube.com/watch?v=LQiOA7euaYA)|
|I|Confirmar que clonar filas evita que los cambios externos rompan el “muro”.|Clonar `brickFila` antes de reasignar la referencia local.| [*Another brick in the wall*](https://www.youtube.com/watch?v=YR5ApYxkU-U)|
|J|Evidenciar cómo un clon protege del “delito” de modificar el original.|Clonar `original`, cambiar el original y comparar.| [*Breaking the law*](https://www.youtube.com/watch?v=L397TWLwrUU)|
|K|Dar un guiño a la tercera dimensión: comprobar accesos en 3 niveles y reconocer `null` intermedio.|Crear un `int[][][]` y mostrar accesos válidos y huecos.| [*¿Qué se puede hacer salvo ver películas?*](https://www.youtube.com/watch?v=6Lk5FrtASVo)|

