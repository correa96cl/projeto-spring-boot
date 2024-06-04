package br.com.marcelo.marcelo.ioc_di;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

    @Autowired
    MeuComponent meuComponent;

    @GetMapping("/")
    public String chamandoComponent() {
        var resultado = meuComponent.chamarMeuComponent();
        return resultado;
    }
    
    
}
