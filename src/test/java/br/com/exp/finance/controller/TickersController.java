package br.com.exp.finance.controller;

import br.com.exp.finance.model.Tickers;
import br.com.exp.finance.services.TickersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//implementando apenas GET
@RestController
@RequestMapping("/api/v1")
public class TickersController {
    //Agora autowired não é repository, mas serviçp
    @Autowired
    TickersService tickersService;

    @GetMapping("/tickers")
    public List<Tickers> getTickers(){
        return tickersService.findAll();
    }
}

