package br.com.marcelo.marcelo.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class MeuComponent {

    public String chamarMeuComponent(){
        return "chamarMeuComponent";
    }
    
}
