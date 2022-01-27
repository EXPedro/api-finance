package br.com.exp.finance.services;

import br.com.exp.finance.model.Tickers;
import br.com.exp.finance.repository.TickersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service
 * Implements CRUD operations on 'tickersRepository'
 * @author eXP
 * @version 0.1
 */

@Service
public class TickersService {

    //chama repositório
    TickersRepository tickersRepository;

    //"magia" spring
    @Autowired
    public TickersService(TickersRepository tickersRepository){
        this.tickersRepository = tickersRepository;
    }

    /**
     * Read all method of CRUD -> GET
     * get all Tickers
     * @return List<Tickers>
     */
    public List<Tickers> findAll(){
        return tickersRepository.findAll();
    }
}
