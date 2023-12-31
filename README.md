# LABORATORIO 5 - MVC SPRING INTRODUCTION

## INTEGRANTES
### - Johann Amaya
### - Christian Duarte

# RESPUESTAS

#### INTRODUCCIÓN A PROYECTOS WEB

### PARTE I. - JUGANDO A SER UN CLIENTE HTTP


- ¿Qué codigo de error sale?, revise el significado del mismo en la lista de códigos de estado HTTP.
- ¿Qué otros códigos de error existen?, ¿En qué caso se manejarán?

Claro está, las peticiones GET son insuficientes en muchos casos. Investigue: ¿Cuál esla diferencia entre los verbos GET y POST? ¿Qué otros tipos de
peticiones existen?



¿Cuáles son las diferencias con los diferentes parámetros?

### PARTE II. - HACIENDO UNA APLICACIÓN WEB DINÁMICA USANDO EL PATRÓN MVC

- ¿Por qué MVC obtiene ese nombre?

  MVC es un acrónimo de Model-View-Controller, que en español se traduce como Modelo-Vista-Controlador. Este patrón de arquitectura de software se utiliza 
para separar el código por sus distintas responsabilidades, manteniendo distintas capas que se encargan de hacer una tarea muy concreta. Su fundamento es la 
separación del código en tres capas diferentes, acotadas por su responsabilidad, en lo que se llaman Modelos, Vistas y Controladores.
- ¿Cuáles son las ventajas de usar MVC?

Las ventajas de usar MVC incluyen:

* Separación clara de dónde tiene que ir cada tipo de lógica, facilitando el mantenimiento y la escalabilidad de la aplicación.
* Sencillez para crear distintas representaciones de los mismos datos.
* Facilidad para la realización de pruebas unitarias de los componentes, así como para aplicar desarrollo guiado por pruebas (Test Driven Development o TDD).
* Reutilización de los componentes.
* Segmentación de responsabilidades.
* Flexibilidad en la procedencia de datos.
- ¿Qué diferencia tiene la estructura de directorios de este proyecto comparado con las de proyectos pasados (con solo maven y java EE)?

En un proyecto Maven estándar, la estructura del directorio suele ser src/main/java para las fuentes. Sin embargo, en un proyecto MVC, la estructura del directorio 
puede variar dependiendo del framework específico que se esté utilizando. Por ejemplo, en un proyecto Spring MVC, podrías tener una estructura de directorios que
incluya directorios separados para modelos, vistas y controladores.
- ¿Qué anotaciones usaste y cuál es la diferencia entre ellas?

En Spring MVC, algunas anotaciones comunes incluyen:

* @Controller: Esta anotación registra el controlador para Spring MVC.
* @RequestMapping: Esta anotación se encarga de relacionar un método con una petición HTTP.
Además, existen otras anotaciones como @Component, @Repository y @Service que son especializaciones de @Component, añadiendo un valor semántico que indica la utilidad 
de la clase anotada (@Repository para acceso a BD y @Service para la capa de negocio). Estas anotaciones pueden ser utilizadas en lugar de @Controller dependiendo del 
propósito específico del bean en tu aplicación.

### PARTE III. - APLICACIÓN MVC PARA CONSUMO DE SERVICIO RESTful

- ¿Qué es RESTful?

RESTful es una forma de diseñar aplicaciones web de manera organizada y fácil de entender. Se basa en tratar las partes de una aplicación como si fueran objetos o cosas 
a las que se puede acceder a través de la web. En lugar de usar acciones complicadas, se utilizan direcciones web (URLs) para acceder y manipular estos objetos. 
- Si utilizo un framework como [Boostrap CSS](https://getbootstrap.com/) para qué el apartado gráfico se vea más profesional, ¿en qué capa se haría su uso?

La utilizamos en la ultima parte donde mostramos los detalles del usuario en la página web
![img.png](src/main/resources/img/img.png)
### PARTE IV. - APLICACIÓN MVC JUEGO

- ¿Qué pasa si abro el sitio de juegos en dos navegadores difententes?

Si abres el sitio de juegos en dos navegadores diferentes, cada navegador creará su propia sesión independiente. 
Esto significa que cada jugador verá sus propios saldos y jugará de manera independiente sin interferir en las 
sesiones del otro jugador. Cada sesión se identifica por un identificador único asociado al navegador o al usuario, 
por lo que no habrá conflictos entre las sesiones de los dos jugadores.
- Si quisiera qué a cada jugador le aparecieran independientemente sus respectivos saldos. ¿Qué habría que hacer?
  
Para que a cada jugador le aparezcan independientemente sus respectivos saldos y estados del juego, necesitas 
implementar un sistema de manejo de sesiones en tu aplicación web. El manejo de sesiones te permite mantener 
datos específicos de cada usuario, como el saldo y el estado del juego, de manera individualizada.