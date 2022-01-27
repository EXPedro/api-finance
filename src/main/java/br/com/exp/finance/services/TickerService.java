package br.com.exp.finance.services;

import br.com.exp.finance.model.Ticker;
import br.com.exp.finance.repository.TickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service
 * Implements CRUD operations on 'tickerRepository'
 * @author eXP
 * @version 0.1
 */

@Service
public class TickerService {

    //chama repositório
    TickerRepository tickerRepository;

    //"magia" spring
    @Autowired
    public TickerService(TickerRepository tickerRepository){
        this.tickerRepository = tickerRepository;
    }

    /**
     * Read all method of CRUD -> GET
     * get all Ticker
     * @return {@link List< Ticker >}
     */
    public List<Ticker> findAll(){
        return tickerRepository.findAll();
    }
}
