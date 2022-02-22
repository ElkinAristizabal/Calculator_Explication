package com.calculator.service.calcservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    Se importan las dependencias necesarias para el funcionamiento de la app.

@RestController

se crea la clase de (calculator service)
public class CalculatorService {

    @RequestMapping("/")
    public String Calculadora(){
        return "Hola, esta es una Calculadora Basica.";
    }

    cuando se ingrese al endpoint (/) la app mostrara "Hola, esta es una Calculadora Basica"

    @RequestMapping("/add")
    public String Suma(){
        return "Suma";
    }

    cuando se ingrese al endpoint (/add) la app mostrará "Suma"

    @RequestMapping("/sub")
    public String Resta(){
        return "Resta";
    }

    cuando se ingrese al endpoint (/sub) la app mostrará "Resta"

    @RequestMapping("/div")
    public String Division() {
        return "Division";
    }

    cuando se ingrese al endponit (/div) la app mostrará "Division"

    @RequestMapping("/mul")
    public String Multiplicacion(){
        return "Multiplicacion";
    }

    cuando se entre al endpoint (/mul) la app mostrará "Multipliacion"

    @GetMapping("//add/{x}/{y}")
    public Response add(@PathVariable int x, @PathVariable int y){
        return new Response(x, y, x+y);
    }
    @GetMapping("//sub/{x}/{y}")
    public Response sub(@PathVariable int x, @PathVariable int y){
        return new Response(x, y, x-y);
    }
    @GetMapping("//div/{x}/{y}")
    public Response div(@PathVariable int x, @PathVariable int y){
        return new Response(x, y, x/y);
    }
    @GetMapping("//mul/{x}/{y}")
    public Response mul(@PathVariable int x, @PathVariable int y){
        return new Response(x, y, x*y);
    }
}
    En esta seccion se agregan las respuestas de la app
    al utilizar los endpoints en el orden (operacion/variable x/varuable y)
    logrando que ésta arroje los resultados de cada operacion basica