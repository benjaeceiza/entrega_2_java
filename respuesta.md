# Diferencias entre Arrays y Listas Enlazadas

##  Diferencias

### Arrays

-   Tamaño fijo.
-   Acceso rápido por índice (O(1)).
-   Insertar/eliminar en el medio es costoso.
-   Memoria contigua.

### Listas enlazadas

-   Tamaño dinámico.
-   Inserción/eliminación rápida si tenés la referencia (O(1)).
-   Acceso lento por posición (O(n)).
-   No requieren memoria contigua.

------------------------------------------------------------------------

##  Ventajas de las listas enlazadas

-   Ideales si hay muchas inserciones o eliminaciones.
-   No necesitan redimensionarse.
-   Manejan bien tamaños variables.

------------------------------------------------------------------------

##  Desventajas

-   Acceso lento a elementos por índice.
-   Mayor uso de memoria por punteros.
-   Peor rendimiento en cache.
-   Recorridos frecuentes pueden ser costosos.
