package br.com.exp.finance.repository;

import br.com.exp.finance.model.Ativo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface that extends JpaRepository
 * Ativo e Long
 * @author eXP
 * @version 0.1
 */

public interface AtivoRepository extends JpaRepository<Ativo, Long>{
}
