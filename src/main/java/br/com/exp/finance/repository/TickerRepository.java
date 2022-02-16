package br.com.exp.finance.repository;

import br.com.exp.finance.model.Ticker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface TickerRepository. Repositório de Tickers que extende JpaRepository
 * <p>- Argumentos: Ticker e String
 * @author eXP
 * @version 0.3
 */

public interface TickerRepository extends JpaRepository<Ticker, String>{
}
