package br.com.exp.finance.controller;

import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.service.AtivoService;
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
     * POST mapping
     * <p>
     * Creation of Ativo
     * @param ativo Ativo
     */
    @PostMapping("/ativos")
    public Ativo createAtivo(@RequestBody Ativo ativo){
        return ativoService.saveAtivo(ativo);
    }

    /**
     * GET mapping
     * @return List<Ativo>
     */
    @GetMapping("/ativos")
    public List<Ativo> getAtivos(){
        return ativoService.findAll();
    }

}
