package br.com.exp.finance.controller;

import br.com.exp.finance.model.Ativos;
import br.com.exp.finance.services.AtivosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//implementando apenas GET
@RestController
@RequestMapping("/api/v1")
public class AtivosController {
    //Agora autowired não é repository, mas serviçp
    @Autowired
    AtivosServices ativosService;

    @GetMapping("/ativos")
    public List<Ativos> getAtivos(){
        return ativosService.findAll();
    }

}
