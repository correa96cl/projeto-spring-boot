package br.com.marcelo.marcelo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/primeiroController")
public class PrimeiroController {

    @GetMapping("/primeiroMetodo/{id}")
    public String getPrimeiroMetodo(@PathVariable String id) {
        return "VINICIOOOOO PORRRAAAA" + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id) {
        return "VINICIOOOOO PORRRAAAA 2" + id;

    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParamsMap) {
        return "VINICIOOOOO PORRRAAAA 3" + allParamsMap.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        {

            return "metodoComBodyParams" + usuario.username();
        }
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name){
        return "metodoComHeaders" + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map<String, String> allHeadersMap){
        return "metodoComListHeaders " + allHeadersMap.entrySet();
    }

    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id){
        var usuario = new Usuario("Vinicius");

        if (id < 5){
            return ResponseEntity.status(HttpStatus.OK).body(usuario);

        }

        return ResponseEntity.badRequest().body("Errooo");

    }

    record Usuario(String username){}

}
