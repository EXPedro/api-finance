package br.com.exp.finance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Entidade Ticker. Permite criar cada Ticker com seu símbolo e preço atual.
 * <p>- Propriedades: PK String ticker, BigDecimal atual, Tipo codigoTipo.
 * <p>- Construtor: NoArgs, Arg: String ticker.
 * @author eXP
 * @version 0.3
 */

@Entity
@Table(name="ticker")
@Getter
@Setter
@NoArgsConstructor
public class Ticker {
    @Id
    @Column(length = 7)
    private String ticker;

    @Column(precision = 10, scale = 2)
    private BigDecimal atual;

//    Para fazer a relação bidirecional:
//    @OneToMany(mappedBy = "ativoTicker", cascade = CascadeType.ALL)
//    private List<Ativo> listAtual;

    @ManyToOne
    @JoinColumn(name="codigo_tipo")
    private Tipo codigoTipo;

    /**
     * Construtor com o parâmetro ticker.
     * Necessário para a criação do Ticker.
     * Um Ticker para cada Ativo.
     * @param ticker String
     */
    public Ticker (String ticker){
        this.ticker = ticker;
    }
}
