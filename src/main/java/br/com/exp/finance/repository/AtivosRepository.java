package br.com.exp.finance.repository;

import br.com.exp.finance.model.Ativos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface that extends JpaRepository
 * Ativo e Long
 * @author eXP
 * @version 0.1
 */

public interface AtivosRepository extends JpaRepository<Ativos, Long>{
}
