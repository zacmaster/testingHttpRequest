# testingHttpRequest
Probando request a la API de OMDB desde java+lombok+jackson

Ejemplo de cómo llamar a una API desde java.

https://github.com/zacmaster/testingHttpRequest/blob/master/src/main/java/paquete/FilmService.java
"FilmService" utiliza la librería okhttp para hacer un GET request a la API de películas www.omdbapi.com y devolver una película en formato JSON.

https://github.com/zacmaster/testingHttpRequest/blob/master/src/main/java/paquete/CustomObjectMapper.java
Se crea una clase CustomObjectMapper que extiende de ObjectMapper para preconfigurarle unas propiedades. Este CustomObjectMapper proviene de la librería jackson y lo que hace es mappear el json a un objeto (Film)



https://github.com/zacmaster/testingHttpRequest/blob/master/src/main/java/paquete/Film.java
Esta clase Film funciona como modelo, a modo de demostración sólo tiene los atributos título, año y género de la película.
Utiliza la librería Lombok que con sus annotations genera getters y setters al compilar, así como también los métodos toString, y constructores con y sin argumentos.



https://github.com/zacmaster/testingHttpRequest/blob/master/src/main/java/paquete/Main.java
Desde esta clase se ejecuta el código. Hace el request a la API, mappea el objeto y luego lo imprime.
