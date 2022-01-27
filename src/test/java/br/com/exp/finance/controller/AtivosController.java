package br.com.exp.finance.controller;

import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.services.AtivoService;
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
    AtivoService ativosService;

    @GetMapping("/ativos")
    public List<Ativo> getAtivos(){
        return ativosService.findAll();
    }

}
