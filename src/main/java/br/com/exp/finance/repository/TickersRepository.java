package br.com.exp.finance.repository;

import br.com.exp.finance.model.Tickers;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface that extends JpaRepository
 * Tickers e Long
 * @author eXP
 * @version 0.1
 */

public interface TickersRepository extends JpaRepository<Tickers, String>{
}
