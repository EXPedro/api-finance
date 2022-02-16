package br.com.exp.finance.controller;

import br.com.exp.finance.model.Ticker;
import br.com.exp.finance.service.TickerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Classe TickerController, controlador REST que controla operações CRUD no endpoint '/api/v1/tickers'.
 * @author eXP
 * @version 0.3
 */

@RestController
@RequestMapping("/api/v1")
public class TickerController {

    //Agora autowired não é repository, mas serviçp
    @Autowired
    TickerService tickerService;

    /**
     * Mapeamento POST para a criação de um Ticker
     * @param ticker Ticker
     */
    @PostMapping("/tickers")
    public Ticker createTicker(@RequestBody Ticker ticker){
        return tickerService.saveTicker(ticker);
    }

    /**
     * Mapeamento GET para listar Tickers.
     * @return List<Ticker>
     */
    @GetMapping("/tickers")
    public List<Ticker> getTickers(){
        return tickerService.findAll();
    }
}

