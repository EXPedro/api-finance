package br.com.exp.finance.repository;

import br.com.exp.finance.model.Ativos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtivosRepository extends JpaRepository<Ativos, Long>{
}
