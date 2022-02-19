package br.com.exp.finance.controller;

import br.com.exp.finance.exception.IdNotFoundException;
import br.com.exp.finance.model.dto.AtivoDTO;
import br.com.exp.finance.model.dto.response.ValorTotalResponse;
import br.com.exp.finance.model.dto.response.AtivoResponse;
import br.com.exp.finance.service.AtivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<AtivoResponse> getAtivos(){
        List<AtivoDTO> ativos = ativoService.findAll();
        return ativos.stream().map(AtivoResponse::new).collect(Collectors.toList());
    }

    /**
     * Mapeamento GET para listar Ativos pela id.
     * @return AtivoDTO
     */
    @GetMapping("/ativos/{id}")
    public AtivoResponse getAtivo(@PathVariable Long id) throws IdNotFoundException {
        AtivoDTO ativoPorId = ativoService.findById(id);
        return new AtivoResponse(ativoPorId);
    }

    /**
     * Mapeamento GET para listar Ativos pela id.
     * @return List<AtivoDTO>
     */
    @GetMapping("/ativos/carteira/{id}")
    public List<AtivoResponse> getAtivosByCarteira(@PathVariable Long id){
        List<AtivoDTO> ativosPorCarteira = ativoService.findByCarteira(id);
        return ativosPorCarteira.stream().map(AtivoResponse::new).collect(Collectors.toList());
    }

    /**
     * Mapeamento GET para listar o total investido em cada Ativo.
     * @return List<ValorTotalController>
     */
    @GetMapping("/ativos/total")
    public List<ValorTotalResponse> getTotalByAtivo(){
        List<AtivoDTO> listaDTO = ativoService.listaTotalDTO();
        return listaDTO.stream().map(ValorTotalResponse::new).collect(Collectors.toList());
    }
}
