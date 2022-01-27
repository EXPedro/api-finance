package br.com.exp.finance.repository;

import br.com.exp.finance.model.Ticker;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface that extends JpaRepository
 * Ticker e Long
 * @author eXP
 * @version 0.1
 */

public interface TickerRepository extends JpaRepository<Ticker, String>{
}
