package br.com.exp.finance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Entity "ativos", w/ data relative to
 * 'carteiras'(cod_carteira)
 * ticker on the 'Carteira'
 * quantity of stocks by ticker
 * average price
 * lombok getters, setters and no args constructor
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
