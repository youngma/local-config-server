package com.mk.confserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigServerApplication
class ConfigServerApplication

fun main(args: Array<String>) {
    runApplication<ConfigServerApplication>(*args)
}
