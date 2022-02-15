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
 * Ticker
 * <p>
 *     <b>ticker:</b>
 *     String, primary key
 * <p>
 *     <b>tipo:</b>
 *     Tipo, type of ticker
 * @author eXP
 * @version 0.2
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

//    @OneToMany(mappedBy = "ativoTicker", cascade = CascadeType.ALL)
//    private List<Ativo> listAtual;

    @ManyToOne
    @JoinColumn(name="codigo_tipo")
    private Tipo codigoTipo;

    /**
     * Constructor with parameter ticker.
     * Necessary for 'Ativo' creation.
     * One Ticker for each 'Ativo'.
     * @param ticker String
     */
    public Ticker (String ticker){
        this.ticker = ticker;
    }
}
