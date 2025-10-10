CLASE 01 MIÉRCOLES 13 DE AGOSTO DEL 2025 - Portafolio 1


USO DE GITHUB

GitHub es una plataforma que nos permite guardar repositorios de Git que podemos usar como servidores remotos y ejecutar algunos comandos de forma visual e interactiva (sin necesidad de la consola de comandos).

Luego de crear nuestra cuenta, podemos crear o importar repositorios, crear organizaciones y proyectos de trabajo, descubrir repositorios de otras personas, contribuir a esos proyectos, dar estrellas y muchas otras cosas.

COMANDOS

#Import repository, New repository, New organization: significa que es como tu empresa, New project: significa es como un grupo de repositorios que puedes tener dentro de una empresa, New gist: es un pedasito de código que puedes compartir

New repository #Ponemos el nombre: Prueba-Inicio.Repo, descripción: Así armamos un repositorio. Hay muchas licencias para publicar el código: NO lo hacemos ahora.


Create repository #Lo ponemos en privado o en Publico.



El README.md es el archivo que veremos por defecto al entrar a un repositorio. Es una muy buena práctica configurarlo para describir el proyecto, los requerimientos y las instrucciones que debemos seguir para contribuir correctamente.

Para clonar un repositorio desde GitHub (o cualquier otro servidor remoto) debemos copiar la URL (por ahora, usando ssh) y ejecutar el comando git clone + la URL que acabamos de copiar. Esto descargará la versión de nuestro proyecto que se encuentra en GitHub.

ATENCIÓN: ¿Por qué? Porque a través de https nos pedirá usuario(nombre perfil) y contraseña. Igual esto ya no funciona de una manera fácil.

Sin embargo, esto solo funciona para las personas que quieren empezar a contribuir en el proyecto.

Cómo conectar un repositorio de GitHub a nuestro documento local, Si queremos conectar el repositorio de GitHub con nuestro repositorio local, aconsejo que al trabajar desde GitHub no utilizemos localmente el comando git init, si debemos ejecutar las siguientes instrucciones:

<a href="https://drive.google.com/file/d/1qIz5XokUEoG9j7mnl-trPvkjbFKtAOgg/view?usp=drive_link">
  Teclear aquí para VER el video 1</a>

Vamos a comenzar con la creación de un repositorio en la nube de Github

Recuerden que el primer paso es tener una cuenta en Github

Tener claro el correo con que están allí

hacer la autenticación de dos pasos

esto quiere decir que nuestra cuenta inicia sesión no solo con correo y contraseña

recomiendo tener el sistema de autenticación en varios dispositivos

Otro punto a tener muy en cuenta es que debemos crear nuestra clave pública y privada entre Github y nuestro ordenador

cada ordenador que usemos con la nube debe tener su propia clave

creamos el repositorio

este puede ser público u privado

recomiendo que se coloque el readme

aunque yo no lo puse

se puede agregar un ignore

no se olviden de colocar un nombre al repositorio

copiamos el enlace ssh para traer el repositorio a nuestro ordenador

vemos que está también el https

traemos el ssh

vamos al ordenador para abrir la terminal de git bash

recuerden abrirla como administrador

esto es para tener todos los permisos necesarios y trabajar tranquilos

vamos a ver primero dónde estamos con el comando 

ll

entramos al directorio: Documents

cd Documents

vemos de nuevo dónde estamos

ll

y creamos aquí un nuevo directorio llamado Proyectos

mkdir Proyectos

entramos en el directorio

y vamos a traer el repositorio con el comando

git clone (y el enlace ssh)

vemos con

ll

si está el repositorio dentro del directorio

entramos en él con

cd Prueba-Inicio-Repo

Ya teniendo esto vamos a traer toda actualización desde la nube con el comando

git pull origin main

también podemos usar

git fetch

creamos el archivo readme con el comando

touch README.md

luego vemos si está con el comando

ll

ls

luego

git status

seguimos con el comando

git add .

luego

git status

vamos a commitear

git commit -m"y el mensaje entre comillas dobles"

pasamos todo esto a la nube con

git push origin main

Nos vamos a Github y presionamos F 5 para actualizar y ver si están los cambios

no olvidemos que github es una red social

coloquemos una estrella

está todo hecho

un dato importante

estando en el repositorio de la nube

con solo apretar

punto .

se abre visual studio code

desde aquí vamos a editar el readme


PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:

Dante Nicolás Martinez

Segundo Semestre Parte 1:

<a href="https://drive.google.com/file/d/1yFihiQVMKXJvOXSwMdczrCesocRS9heY/view?usp=drive_link">
  IntroYpractica
</a>

<a href="https://docs.google.com/presentation/d/10QC9Ii6zvYgTa5fbzUJGNC8z9LukEN5r/edit?usp=drive_link&ouid=103827187004520077964&rtpof=true&sd=true">
  PDF
</a>


CLASE 02 MIÉRCOLES 20 DE AGOSTO DEL 2025 - Portafolio 2

Vamos a cargar la llave SSH publica en GitHub

Para copiar la llave publica debes ir al archivo .ssh y allí encontrarás el archivo .pub lo podes abrir con el txt, luego copiar el contenido que esta dentro.

copiar la llave publica #Ir a GitHub, vamos a setting, vamos a SSH and GPG keys

crear una nueva #New SSH key poner nombre y pegar la ssh publica, con esto esta listo.

Aconsejo que la ssh tenga el nombre del ordenador en el que estas trabajando. Esto se debe hacer con cada pc nueva o dispositivo nuevo que tengamos para acceder a nuestra cuenta de GitHub.

git branch #Vemos en que rama estamos

git checkout master #Ponernos en la rama master

git branch -M main #Cambiamos el nombre a la rama master

git remote add origin git@github.com:nombreUsuario/class-git.git #Agregamos el repositorio remoto, este es un ejemplo

git remote -v #Vemos si ya esta conectado

git merge segunda #Mergeamos lo que tenemos en la rama segunda en main

git commit -am "Uso de GitHub parte 20" #Hacemos el commit de hoy

git push origin main #Pasamos todo lo hecho a GitHub, revisar en el repositorio en GitHub.

Frente al cambio de nombre de rama master a main, suele suceder que en el repo de GitHub se hayan creado dos ramas, la rama master y la rama main, se debe ir al repo, settings y ahí se puede cambiar la rama principal, en vez de que siga siendo master, que sea la rama main, luego de eso ya podemos borrar la rama master.

PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:

Dante Nicolás Martinez

Segundo Semestre Parte 2:

<a href="https://drive.google.com/file/d/1op_N1lCHQey2jIJKLHt0JyDi5tqlSYcQ/view?usp=drive_link">
  Video Capitulo 01
</a>

<a href="https://drive.google.com/file/d/1irin9hTI2Jqf-0Zg2mOsB1nzARkL4Gs3/view?usp=drive_link">
  PDF
</a>



CLASE 03 MIÉRCOLES 27 DE AGOSTO DEL 2025 - Portafolio 3

Cambios en GitHub: de master a main

El escritor Argentino Julio Cortázar afirma que las palabras tienen color y peso. Por otro lado, los sinónimos existen por definición, pero no expresan lo mismo. Feo no es lo mismo que desagradable, ni aromático es lo mismo que oloroso.


Por lo anterior, podemos afirmar que los sinónimos no expresan lo mismo, no tienen el mismo “color” ni el mismo “peso”.

Sí, esta lectura es parte de la enseñanza profesional de Git & GitHub.

Desde el 1 de octubre de 2020 GitHub cambió el nombre de la rama principal: ya no es “master” -como aprenderás aquí- sino main.

Este derivado de una profunda reflexión ocasionada por el movimiento #BlackLivesMatter.

La industria de la tecnología lleva muchos años usando términos como master, slave, blacklist o whitelist y esperamos pronto puedan ir desapareciendo.

Y sí, las palabras importan.

Por lo que de aquí en adelante cada vez que me escuches mencionar “master” debes saber que hago referencia a “main”.

¿Cuando es que sigue siendo master y cuando sigue siendo main?
Cuando se crea un repositorio desde git bash en nuestro ordenador a través de git init, sigue siendo el estandar como master. ¿Qué hacer con esto? Debes cambiar el nombre de la rama master a main con el comando:

 git branch -M main

O cambiando la asignación por default con este otro comando:

git config --global init.defaultBranch main

A partir de este comando siempre que ingreses git init será la rama main.

Ahora cuando creamos un repositorio desde la nube, osea desde GitHub, ya verás que la rama principal tiene por default el nombre de main y al clonar a nuestro ordenador seguira teniendo este nombre y no será necesario ningun cambio.

Otro comando que deben saber es:

gitk

Si no te funciona el comando gitk es posible no lo tengas instalado por defecto.

Para instalar gitk debemos ejecutar los siguientes comandos:

sudo apt-get update

sudo apt-get install gitk

Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.

PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:

Dante Nicolás Martinez

Segundo Semestre Parte 3:

<a href="https://drive.google.com/file/d/1sNtWVHF-L4pIiEVTr4qEQUVhT4W964tD/view?usp=drive_link">
  Video Capitulo 02
</a>

<a href="https://drive.google.com/file/d/1snYyd_MldpZ1iGRLTmADzG4uUC21nda5/view?usp=drive_link">
  PDF
</a>

Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

Profesor Ariel Betancud


CLASE 04 MIÉRCOLES 3 DE SEPTIEMBRE DEL 2025 - Portafolio 4



Tu primer push
La creación de las SSH es necesario solo una vez por cada computadora. Aquí conocerás cómo conectar a GitHub usando SSH.


Luego de crear nuestras llaves SSH podemos entregarle la llave pública a GitHub para comunicarnos de forma segura y sin necesidad de escribir nuestro usuario y contraseña todo el tiempo.

Para esto debes entrar a la Configuración de Llaves SSH en GitHub, crear una nueva llave con el nombre que le quieras dar y el contenido de la llave pública de tu computadora.

Ahora podemos actualizar la URL que guardamos en nuestro repositorio remoto, solo que, en vez de guardar la URL con HTTPS, vamos a usar la URL con SSH:

ssh

git remote set-url origin url-ssh-del-repositorio-en-github

Comandos para copiar la llave SSH:

ESTAS SON LAS RUTAS DEL SSH PUBLICO
-Mac:
pbcopy < ~/.ssh/id_rsa.pub

Windows (Git Bash):

clip < ~/.ssh/id_rsa.pub

Linux (Ubuntu):

cat ~/.ssh/id_rsa.pub



Importante


Las buenas costumbres nos enseñan que antes de hacer un push, siempre debemos hacer un pull, un fetch, esto para que si alguien ya hizo algún cambio, no se genere un conflicto.

Invitar a un colaborador

Para invitar a un colaborador debemos ir a GitHub y seleccionar:
setting -> colaborators -> ingresar contraseña o un F2A de verificación y enviar la invitación escribiendo el nombre de usuario.


Del otro lado el usuario invitado solo debe aceptar y listo, ya puede participar del proyecto haciendo commit.



PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:

Dante Nicolás Martinez

Segundo Semestre Parte 4:



<a href="https://drive.google.com/file/d/1LgOq1_qtjeZcIq1f1PR4GMV8AWANN6Ju/view?usp=drive_link">
  Video Capitulo 03
</a>

<a href="https://docs.google.com/presentation/d/14odWSx7zoJ78nEj83V5sKkVaRIxqk0j_/edit?usp=drive_link&ouid=103827187004520077964&rtpof=true&sd=true">
  PDF
</a>




Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

Profesor Ariel Betancud


CLASE 05 MIÉRCOLES 10 DE SEPTIEMBRE DEL 2025 - Portafolio 5




Git tag y versiones en GitHub

En Git, las etiquetas o Git tags tienen un papel importante al asignar versiones a los commits más significativos de un proyecto. Aprender a utilizar el comando git tag, entender los diferentes tipos de etiquetas, cómo crearlas, eliminarlas y compartirlas, es esencial para un flujo de trabajo eficiente.


Creación de etiquetas en Git

```sh
git tag

```


Sustituye con un identificador semántico que refleje el estado del repositorio en el momento de la creación. Git admite etiquetas anotadas y ligeras.


Listado de etiquetas
Para obtener una lista de etiquetas en el repositorio, ejecuta el siguiente comando:



Para crear una etiqueta, ejecuta el siguiente comando:



Las etiquetas anotadas almacenan información adicional como la fecha, etiquetador y correo electrónico, y son ideales para publicaciones públicas. Las etiquetas ligeras son más simples y se emplean como “marcadores” de una confirmación específica.


git tag

Esto mostrará una lista de las etiquetas existentes, como:

v1.0

v1.1

v1.2

Para perfeccionar la lista, puedes utilizar opciones adicionales, como -l con una expresión comodín.


Uso compartido de etiquetas

Compartir etiquetas requiere un enfoque explícito al usar el comando git push. Por defecto, las etiquetas no se envían automáticamente. Para enviar etiquetas específicas, utiliza:

git push origin

Para enviar varias etiquetas a la vez, usa:

git push origin --tags


Eliminación de etiquetas
Para eliminar una etiqueta, usa el siguiente comando:

git tag -d

Esto eliminará la etiqueta identificada por en el repositorio local.

En resumen, las etiquetas en Git son esenciales para asignar versiones y capturar instantáneas importantes en el historial de un proyecto. Aprender a crear, listar, compartir y eliminar etiquetas mejorará tu flujo de trabajo con Git.



PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:

Dante Nicolás Martinez

Segundo Semestre Parte 5:


<a href="https://drive.google.com/file/d/1F_kpPnOEJRQDvdymclsKNyqr4h09NWfz/view?usp=drive_link">
  Video Capitulo 04
</a>

<a href="https://drive.google.com/file/d/12MArnwaV5RfzzedZ0AtDlRk_a12kL-9W/view?usp=drive_link">
  PDF
</a>




Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

Profesor Ariel Betancud



CLASE 06-A MIÉRCOLES 24 DE SEPTIEMBRE DEL 2025 - Portafolio 6





Error con los tags
Investigación: ¿Qué pasa si por error cargamos un tag dos veces?

¿Cómo solucionarías este problema o error?

La respuesta debe ser enviada antes de las 23 horas por cada grupo, deben enviar comandos y todo los pasos que harían frente a este conflicto.



PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:

Dante Nicolás Martinez

Segundo Semestre Parte 6:



<a href="https://drive.google.com/file/d/1SV4-SAizEU84_T9B6-iBHJm5c72Gt-Z5/view?usp=drive_link">
  Video Capitulo 05
</a>

<a href="https://drive.google.com/file/d/1HoelHkism3xk_2BzmpN_rMhWokEDADaf/view?usp=drive_link">
  PDF
</a>


Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

Profesor Ariel Betancud


CLASE 06-B MIÉRCOLES 24 DE SEPTIEMBRE DEL 2025 - Portafolio 7



Error con los tags
Investigación: Si un tag es imposible generarlo dos veces ¿Cómo es que existe el error de dos tags con el mismo nombre?

¿Cómo se origina este problema o error?

La respuesta debe ser enviada antes de las 23 horas por cada grupo, deben enviar comandos y todo los pasos que harían frente a este conflicto.



PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:

Dante Nicolás Martinez

Segundo Semestre Parte 6:


<a href="https://drive.google.com/file/d/1wrqZlPWWZGseWpop94J0jZSgFj_XTqER/view?usp=drive_link">
  Video Capitulo 06
</a>

<a href="https://drive.google.com/file/d/14p1D22y8L8DJNdQ6BMmkR22So2b3lWkk/view?usp=drive_link">
  PDF
</a>



Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

Profesor Ariel Betancud


CLASE 08 MIÉRCOLES 1 DE OCTUBRE DEL 2025 - Portafolio 8





Manejo de ramas en GitHub

Es bueno recordar sobre gitk. Si no te funciona el comando gitk es posible no lo tengas instalado por defecto. Esta es una herramienta muy util a la hora de ver graficamente nuestro trabajo y así entender mejor todo el funcionamiento de ramas, merge y todo el flujo en un formato ordenado.


Para instalar gitk debemos ejecutar los siguientes comandos:



```sh

  sudo apt-get update


  sudo apt-get install gitk

```

Repasa: ¿Qué es Git?

Las ramas nos permiten hacer cambios a nuestros archivos sin modificar la versión principal (main). Puedes trabajar con ramas que nunca envías a GitHub, así como pueden haber ramas importantes en GitHub que nunca usas en el repositorio local. Lo crucial es que aprendas a manejarlas para trabajar profesionalmente.

Si, estando en otra rama, modificamos los archivos y hacemos commit, tanto el historial(git log) como los archivos serán afectados. La ventaja que tiene usar ramas es que las modificaciones solo afectarán a esa rama en particular. Si luego de “guardar” los archivos(usando commit) nos movemos a otra rama (git checkout otraRama) veremos como las modificaciones de la rama pasada no aparecen en la otraRama.

Comandos para manejo de ramas en GitHub
Crear una rama:


```sh
git branch branchName #Crear una rama
git checkout -b branchName #También crea una rama
git checkout branchName #Movernos a otra rama 
git push origin branchName #Publicar una rama local al repositorio remoto
```

Recuerda que podemos ver gráficamente nuestro entorno y flujo de trabajo local con Git utilizando el comando gitk. Gitk fue el primer visor gráfico que se desarrolló para ver de manera gráfica el historial de un repositorio de Git.



PORTAFOLIO


Vamos a ver unos videos de como avanzar en lo que es un portafolio por el Tutor:

Dante Nicolás Martinez

Segundo Semestre Parte 7:

<a href="https://drive.google.com/file/d/13rdccGVNp1cyiximL7PBnzt0obCCID3H/view?usp=drive_link">
  Video Capitulo 07
</a>

<a href="https://drive.google.com/file/d/1mzSJke4-kr2CX3pBBuFbcgwkEeUqq5Wo/view?usp=drive_link">
  PDF
</a>



Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

Profesor Ariel Betancud