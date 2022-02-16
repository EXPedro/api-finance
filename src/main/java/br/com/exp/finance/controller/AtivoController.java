package br.com.exp.finance.controller;

import br.com.exp.finance.model.dto.AtivoDTO;
import br.com.exp.finance.service.AtivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Classe AtivoController, controlador REST que controla operações CRUD no endpoint '/api/v1/ativos'.
 * @author eXP
 * @version 0.3
 */

@RestController
@RequestMapping("/api/v1")
public class AtivoController {

    //Agora autowired não é repository, mas serviçp
    @Autowired
    AtivoService ativoService;

    /**
     * Mapeamento POST para criação de um Ativo.
     * @param ativoDTO AtivoDTO
     */
    @PostMapping("/ativos")
    public AtivoDTO createAtivo(@RequestBody AtivoDTO ativoDTO){
        return ativoService.saveAtivo(ativoDTO);
    }

    /**
     * Mapeamento GET para listar Ativos.
     * @return List<AtivoDTO>
     */
    @GetMapping("/ativos")
    public List<AtivoDTO> getAtivos(){
        return ativoService.findAll();
    }

}
