# Proyecto Sistema de Login con Roles y Usuarios

Este proyecto,realizado en el curso de Programacion Orientada a Objetos en Java de TodoCode, es una aplicación de escritorio desarrollada en Java que implementa un sistema de login complementado con un sistema de roles y usuarios. Dependiendo del rol del usuario (administrador o usuario), se desplegarán diferentes ventanas con funcionalidades específicas.

## Tecnologías Utilizadas

- **Java**: Lenguaje de programación utilizado para desarrollar la aplicación.
- **Swing**: Biblioteca gráfica utilizada para crear la interfaz de usuario.
- **Modelo de capas**:
  - **IGU**: Maneja la interacción con el usuario y se implementa utilizando Swing.
  - **Lógica**: Contiene la lógica de negocio de la aplicación.
  - **Persistencia**: Maneja el almacenamiento y recuperación de datos.
- **Modelo relacional de 1 a N**: Implementación de la relación entre usuarios y roles.

## Funcionalidades

### Login
- **Autenticación**: Verifica si el usuario existe en la base de datos.
- **Redirección**: Dependiendo del rol del usuario (administrador o usuario), redirige a la ventana correspondiente.

### Roles

#### Usuario
- **Visualización de Usuarios**: Muestra una ventana con una tabla que contiene los nombres de los usuarios registrados, sus IDs y los roles que poseen.
- **Refrescar Página**: Permite actualizar la información mostrada en la tabla.
- **Salir**: Cierra la sesión y la aplicación.

#### Administrador
- **Visualización de Usuarios**: Muestra una ventana con una tabla que contiene los nombres de los usuarios registrados, sus IDs y los roles que poseen.
- **Crear Usuario**: Permite añadir un nuevo usuario asignándole un rol (usuario o administrador).
- **Editar Usuario**: Permite modificar la información de un usuario existente.
- **Borrar Usuario**: Permite eliminar un usuario de la base de datos.

### Ejemplos de Uso

- **Login**: El usuario ingresa su nombre de usuario y contraseña. Si las credenciales son válidas, se redirige a la ventana correspondiente según su rol.
- **Administrador**: El administrador puede gestionar los usuarios, añadiendo nuevos usuarios, editando los existentes o eliminándolos.
- **Usuario**: Un usuario regular puede ver la lista de usuarios y roles en una tabla, refrescar la vista o cerrar sesión.

## Estructura del Proyecto

- **src**: Carpeta principal del código fuente.
  - **igu**: Contiene las clases relacionadas con la interfaz gráfica.
  - **logica**: Contiene las clases con la lógica de negocio.
  - **persistencia**: Contiene las clases para el manejo de la persistencia de datos.

![login1](https://github.com/user-attachments/assets/def70e7d-e659-4e73-9884-b9a760cbc748)
![login2](https://github.com/user-attachments/assets/562d9f7b-235a-45c9-bd7d-fa409731f200)
![login3](https://github.com/user-attachments/assets/4185f64f-17ca-4e85-8a73-9f274e0a6839)
![login4](https://github.com/user-attachments/assets/7370f5cc-beae-4992-8635-2efd497bf29c)
![login5](https://github.com/user-attachments/assets/dcc183f6-9ac8-4848-a282-63da5d3ec808)
![login6](https://github.com/user-attachments/assets/a1550567-71be-4dcc-b82f-c14ee5bdf2ae)
![login7](https://github.com/user-attachments/assets/d725f698-f7b5-4a24-aeac-2da421901a09)

