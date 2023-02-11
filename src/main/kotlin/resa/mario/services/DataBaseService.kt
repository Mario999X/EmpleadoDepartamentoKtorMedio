package resa.mario.services

import org.koin.core.annotation.Single
import resa.mario.conf.DataBaseConfig
import io.r2dbc.spi.ConnectionFactoryOptions

@Single
class DataBaseService(
    private val dataBaseConfig: DataBaseConfig
) {

    private val connectionOptions = ConnectionFactoryOptions.builder()
        .option(ConnectionFactoryOptions.DRIVER, dataBaseConfig.driver)
        .option(ConnectionFactoryOptions.PROTOCOL, dataBaseConfig.protocol)  // file, mem
        .option(ConnectionFactoryOptions.USER, dataBaseConfig.user)
        .option(ConnectionFactoryOptions.PASSWORD, dataBaseConfig.password)
        .option(ConnectionFactoryOptions.DATABASE, dataBaseConfig.database)
        .build()

    val initData get() = dataBaseConfig.initDatabaseData

}