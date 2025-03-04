# language: es

Característica: Inicio de sesion
    Como usuario del sistema
    Quiero ingresar con mis credenciales
    Para acceder a la plataforma

    Escenario: Login exitoso
        Dado que el usuario abre la pagina de inicio de sesion
        Cuando ingresa las credenciales validas
        Entonces deberia ver el texto "Dashboard"