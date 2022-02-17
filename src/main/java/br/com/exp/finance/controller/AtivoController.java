package br.com.exp.finance.controller;

import br.com.exp.finance.exception.IdNotFoundException;
import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.model.dto.AtivoDTO;
import br.com.exp.finance.service.AtivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    /**
     * Mapeamento GET para listar Ativos pela id.
     * @return AtivoDTO
     */
    @GetMapping("/ativos/{id}")
    public AtivoDTO getAtivo(@PathVariable Long id) throws IdNotFoundException {
        return ativoService.findById(id);
    }

    /**
     * Mapeamento GET para listar Ativos pela id.
     * @return List<AtivoDTO>
     */
    @GetMapping("/ativos/carteira/{id}")
    public List<AtivoDTO> getAtivosByCarteira(@PathVariable Long id) throws IdNotFoundException {
        return ativoService.findByCarteira(id);
    }

    /**
     * Mapeamento GET para listar o total investido em cada Ativo.
     * @return List<AtivoDTO>
     */
    @GetMapping("/ativos/total")
    public List<AtivoDTO> getTotalByAtivo(){
        return ativoService.total();
    }
}
