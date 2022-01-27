package br.com.exp.finance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Ativos
 * <p>
 *     <b>cod_carteira</b>
 *     ( 017, 020, 174)
 * <p>
 *     <b>ticker</b>
 *     on the 'Carteira'
 * <p>
 *     <b>quantidade</b>
 *     quantity of stocks by ticker
 * <p>
 *     <b>pm</b>
 *     average price
 * <p>
 * @author eXP
 * @version 0.1
 */

@Entity
@Table(name="ativos")
@Getter
@Setter
@NoArgsConstructor
public class Ativos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    @Column(nullable = false)
    private Long codigo_carteira;

    @Column(nullable = false)
    private String ticker;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private BigDecimal pm;
}
