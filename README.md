# POO_TALLER-7

Preguntas


1. ¿Por qué ArrayList<int> no compila y ArrayList<Integer> sí?

Los ArrayList y las colecciones en Java solo aceptan objetos (tipos de referencia), no aceptan tipos de datos primitivos (int, double, boolean, etc.).

int es un tipo primitivo puro, por lo que ArrayList<int> genera un error de compilación. Para solucionar esto, Java utiliza las clases envolventes (wrapper classes), donde Integer es la versión en objeto del primitivo int, permitiendo escribir correctamente ArrayList<Integer>.
   
2. ¿Por qué eliminar a Nevado de Favoritas no lo eliminó de Viaje? ¿Qué relación muestra eso?

Por qué no se eliminó: Cada objeto PlayList (Favoritas y Viaje) tiene su propio ArrayList independiente de canciones. Al eliminar un artista de una lista, solo se remueven los elementos de esa colección específica, sin afectar los datos que contenga otra playlist diferente.

Qué relación muestra: Muestra una relación de Agregación. Las canciones (Cancion) pueden existir por sí mismas y pueden ser compartidas o pertenecer a múltiples listas (Favoritas y Viaje) al mismo tiempo de forma independiente.

3. ¿Qué diferencia hay entre la relación Playlist–Cancion y la relación Parqueadero–Puesto?

Playlist – Cancion (Agregación): Las canciones son independientes; pueden crearse sin estar en una playlist y una misma canción puede estar en varias playlists diferentes. Si una playlist se borra, las canciones siguen existiendo.

Parqueadero – Puesto (Composición): Los puestos dependen totalmente del parqueadero. Un puesto se crea dentro del parqueadero y no tiene sentido ni existencia fuera de él. Si el parqueadero deja de existir, sus puestos también lo hacen.

4. ¿Por qué totalCanciones debe ser static y titulo no?

totalCanciones (es static): Es un atributo de clase. Su propósito es llevar un conteo global y compartido de todas las canciones que se han creado a lo largo del programa, sin importar a qué objeto pertenezcan.

titulo (no es static): Es un atributo de instancia. Cada canción creada necesita tener su propio título único e individual que la diferencie de las demás canciones.

5. ¿Por qué un método static no puede usar this?

La palabra clave this hace referencia directa a la instancia actual (al objeto específico que está ejecutando el método en ese momento).

Como los métodos static pertenecen a la clase en general y se pueden ejecutar sin necesidad de crear ningún objeto (sin usar new), en un contexto estático no existe ningún objeto ni referencia this a la cual apuntar.
