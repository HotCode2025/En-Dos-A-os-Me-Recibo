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