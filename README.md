## Hibernate Hoja 1

Nota: El ejercicio 4 incluye también los ejercicios 5, 6, 7 y 8.

Estos son los ALTER que he tenido que ejecutar para añadir las columnas de los ejercicios 5, 6, 7, 8

```
ALTER TABLE seguro ADD COLUMN fechaNacimiento DATE;
ALTER TABLE seguro ADD COLUMN horaContacto TIME;
ALTER TABLE seguro ADD COLUMN claves BLOB;
ALTER TABLE seguro ADD COLUMN comentarios BLOB;
```