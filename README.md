# bodega
Demo técnica de una página web.
Es un prototipo fullstack de página web donde se refleja un listado de elementos y la posibilidad de expandirla añadiendo nuevos.

## Autor

- [@MarcosMoral](marcos.morales04@alumnos.upm.es)


## Estructura:
- BBDD relacional en MySQL con una tabla sobre la que se podrá trabajar.

- Backend: una API Rest con dos endpoints a disposición del usuario: GET y POST.
        <br> Desarrollada en Java usando SpringBoot como framework.

- Frontend: Una página web desplegada mediante React como framework.
        <br> Desarrollada en HTML+JS+CSS. El enlace entre frontend y backend se realiza a través de nodejs

## Instrucciones para despliegue en local:
    1. Bajar el repositorio git y situarse dentro.
    2. Crear una base de datos local usando el fichero "BBDD.sql" disponible en el repositorio git.
    3. Abrir el fichero de backend con path: "apirest_bodega/backend/src/main/java/com/bodega/apirest_bodega/ApirestBodegaApplication.java".
    4. Ejecutar el metodo main del fichero "ApirestBodegaApplication.java".(si por culpa dependencias del pom no funciona cambia la version de java al 17)
    5. Situarse en el diretorio frontend y en terminal ejecutar lo comando: npm start.
    6. (En caso de error con el mandato nmp start, otorgar los permisos necesarios si así lo solicita y/o ejecutarel mandato: "rm -rf node_modules" antes de ejecutar de nuevo "npm start")
<br>
<br>