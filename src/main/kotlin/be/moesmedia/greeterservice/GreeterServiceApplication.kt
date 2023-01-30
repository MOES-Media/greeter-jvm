package be.moesmedia.greeterservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GreeterServiceApplication

fun main(args: Array<String>) {
	runApplication<GreeterServiceApplication>(*args)
}
