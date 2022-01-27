package br.com.exp.finance.controller;

import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.services.AtivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class
 * of endpoint '/api/v1/'
 * '/ativos'
 * @author eXP
 * @version 0.1
 */

@RestController
@RequestMapping("/api/v1")
public class AtivoController {

    //Agora autowired não é repository, mas serviçp
    @Autowired
    AtivoService ativoService;

    /**
     * GET mapping
     * @return List<Ativo>
     */
    @GetMapping("/ativos")
    public List<Ativo> getAtivos(){
        return ativoService.findAll();
    }

}
