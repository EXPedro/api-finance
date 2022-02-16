package br.com.exp.finance.repository;

import br.com.exp.finance.model.Ativo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface AtivoRepository. Repositório de Ativos que extende JpaRepository
 * <p>- Argumentos: Ativo e Long
 * @author eXP
 * @version 0.3
 */

public interface AtivoRepository extends JpaRepository<Ativo, Long>{
}
