package resa.mario

import io.ktor.server.application.*
import resa.mario.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {

    // Koin
    configureKoin()

    // Base de datos
    configureDataBase()

    //configureSecurity()
    configureSerialization()
    configureRouting()
}

/**
 * -- EXPLICACION --
 *
 * En este caso, vamos a implantar una base de datos en memoria, por lo que he escogido H2, y para generar de forma correcta
 * las tablas y demas, Kotysa.
 *
 *  -- EXPLICACION BASE DE DATOS --
 *
 * 0. Comprobar atentamente las dependencias del build.gradle
 * 1. Comentamos la seguridad.
 * 2. Preparamos los distintos modelos
 * 2,5. Preparamos el plugin de Koin [modulo default]
 * 3. Comenzamos con la configuracion de application.conf respecto a la base de datos
 * 4. Generamos un DataBaseConfig y lo configuramos con las propiedades del .conf
 * 4,5. Generamos los dto que necesitemos si es necesario.
 * 6. Generamos las entidades.
 * 7. Generamos el plugin correspondiente de Database
 * 8. Generamos el data y lo cargamos en el servicio
 * 9. Generacion de repositorios
 * 10. Generacion de servicios
 * 11. Generacion de rutas
 */