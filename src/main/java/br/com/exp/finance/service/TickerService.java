package br.com.exp.finance.service;

import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.model.Ticker;
import br.com.exp.finance.repository.TickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Serviço que implementa as operações CRUD usando o repositório 'tickerRepository'.
 * <p>- Métodos:
 * GET: List<Ativo> findAll(), POST: Ticker saveTicker(Ticker ticker).
 * @author eXP
 * @version 0.3
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
     * Método CRUD (Read): GET. Retorna a lista de Tickers do banco de dados.
     * @return {@link List<Ticker>}
     */
    public List<Ticker> findAll(){
        return tickerRepository.findAll();
    }

    /**
     * Método CRUD (Create): POST. Cria um novo Ticker
     * @param ticker Ticker
     * @return {@link Ticker}
     */
    public Ticker saveTicker(Ticker ticker){
        return tickerRepository.save(ticker);
    }
}
