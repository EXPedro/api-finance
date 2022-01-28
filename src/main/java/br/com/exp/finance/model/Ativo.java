package br.com.exp.finance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

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
    private Carteira codigoCarteira;

    @ManyToOne
    private Ticker codigoTicker;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private BigDecimal pm;

    @Column
    private BigDecimal atual;
}
