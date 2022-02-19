package br.com.exp.finance.repository;

import br.com.exp.finance.model.Ativo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Interface AtivoRepository. Repositório de Ativos que extende JpaRepository
 * <p>- Argumentos: Ativo e Long
 * @author eXP
 * @version 0.3
 */

public interface AtivoRepository extends JpaRepository<Ativo, Long>{
    @Query(value= "SELECT * FROM ativo a WHERE a.codigo_carteira= ?1", nativeQuery = true)
    List<Ativo> findByCodigoCarteira(Long codigoCarteira);

    // Uma das formas de se escrever queries:
    // @Query("select new br.com.exp.finance.model.Ativo(a.ativoTicker, (a.quantidade * a.pm)) from Ativo a")
//    List<Ativo> findBy();
}
