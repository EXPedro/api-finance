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

    //@Query("select new Ativo(ativoTicker,  quantidade * pm) from Ativo")
    @Query("select new br.com.exp.finance.model.Ativo(a.ativoTicker, (a.quantidade * a.pm)) from Ativo a")
//    @Query(value= "select new br.com.exp.finance.model.Ativo(ativoTicker), quantidade * pm as total_investido from Ativo a")
//    @Query(value= "select a.ticker, a.quantidade * a.pm as total_investido from ativo a", nativeQuery = true)
    List<Ativo> showTotalInvestido();
}
