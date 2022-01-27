package br.com.exp.finance.controller;

import br.com.exp.finance.model.Ativos;
import br.com.exp.finance.services.AtivosServices;
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
public class AtivosController {

    //Agora autowired não é repository, mas serviçp
    @Autowired
    AtivosServices ativosService;

    /**
     * GET mapping
     * @return List<Ativos>
     */
    @GetMapping("/ativos")
    public List<Ativos> getAtivos(){
        return ativosService.findAll();
    }

}
