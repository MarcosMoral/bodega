# bodega
Demo técnica de una pagina web.
Es un prototipo fullstack de página web donde se refleje una lista de elementos y la posibilidad de añadir nuevos.

## Authors

- [@MarcosMoral](marcos.morales04@alumnos.upm.es)


## Estructura:
- BBDD relacional en MySQL con una tabla sober la que se podrá trabajar.

- Backend: una API Rest con dos endpoints a disposición del usuario: GET y POST.
        <br> Desarrollada en Java usando SpringBoot como framework.

- Frontend: Una página web desplegada mediante React como framework.
        <br> Desarrollada en HTML+JS+CSS.

## Instrucciones para despliegue en local:
    1. Bajar el repositorio git y situarse dentro.
    2. Crear una base de datos local usando el fichero "BBDD.sql" disponible en el repositorio git.
    3. Abrir el fichero de backend con path: "apirest_bodega/backend/src/main/java/com/bodega/apirest_bodega/ApirestBodegaApplication.java".
    4. Ejecutar el metodo main del fichero ApirestBodegaApplication.java
    5. Situarse en el diretorio frontend y en terminal ejecutar el comando npm start.
<br>
<br>