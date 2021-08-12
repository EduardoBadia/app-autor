package br.com.zup.appautor.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/teste")
class TesteController {

    @Get
    fun lista() : String {

       return "teste";
    }
}