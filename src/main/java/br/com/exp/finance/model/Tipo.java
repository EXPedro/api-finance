package br.com.exp.finance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidade Tipo. Permite selecionar entre os tipos de Ativo (Ação, BDR, ETF, FII).
 * <p>- Propriedades: PK Long idTipo, String tipo.
 * <p>- Construtor: NoArgs, Arg: Long id.
 * @author eXP
 * @version 0.3
 */

@Entity
@Table(name="tipo")
@Getter
@Setter
@NoArgsConstructor
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipo;

    @Column(nullable = false, length = 10)
    private String tipo;

    /**
     * Construtor com o parâmetro id.
     * Necessário para a criação do Ticker.
     * Um Tipo para cada Ticker.
     * @param id idTipo
     */
    public Tipo(Long id){
        this.idTipo = id;
    }
}
