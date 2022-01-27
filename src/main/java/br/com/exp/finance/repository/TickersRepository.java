package br.com.exp.finance.repository;

import br.com.exp.finance.model.Tickers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TickersRepository extends JpaRepository<Tickers, String>{
}
