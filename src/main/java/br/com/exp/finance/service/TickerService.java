package br.com.exp.finance.service;

import br.com.exp.finance.mapper.TickerMapper;
import br.com.exp.finance.model.Ticker;
import br.com.exp.finance.model.dto.TickerDTO;
import br.com.exp.finance.repository.TickerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Serviço que implementa as operações CRUD usando o repositório 'tickerRepository'.
 * <p>- Métodos:
 * GET: List<TickerDTO> findAll(), POST: TickerDTO saveTicker(TickerDTO tickerDTO).
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
     * Método CRUD (Read): GET. Retorna a lista DTO de Tickers do banco de dados.
     * @return {@link List<TickerDTO>}
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<TickerDTO> findAll(){
        List<Ticker> listaDeTickers = tickerRepository.findAll();
            return TickerMapper.listTickersToDTO(listaDeTickers);
    }

    /**
     * Método CRUD (Create): POST. Cria um novo TickerDTO
     * @param tickerDTO TickerDTO
     * @return {@link TickerDTO}
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public TickerDTO saveTicker(TickerDTO tickerDTO){
        Ticker tickerToSave = TickerMapper.dtoToTicker(tickerDTO);
        tickerRepository.save(tickerToSave);
        return TickerMapper.tickerToDTO(tickerToSave);
    }
}
