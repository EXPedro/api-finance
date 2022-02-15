package br.com.exp.finance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Ativo
 * <p>
 *     <b>cod_carteira</b>
 *     Carteira, foreign key
 * <p>
 *     <b>ticker</b>
 *     Ticker, foreign key
 * <p>
 *     <b>quantidade</b>
 *     Quantity of stocks/ticker
 * <p>
 *     <b>pm</b>
 *     Average price
 * <p>
 *     <b>atual</b>
 *     Current price, nullable
 * @author eXP
 * @version 0.2
 */

@Entity
@Table(name="ativo")
@Getter
@Setter
@NoArgsConstructor
public class Ativo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAtivo;

    @ManyToOne
    @JoinColumn(name = "codigo_carteira")
    private Carteira codigoCarteira;

    @ManyToOne
       @JoinColumn(name = "ticker", referencedColumnName = "ticker")
    private Ticker ativoTicker;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal pm;
}
