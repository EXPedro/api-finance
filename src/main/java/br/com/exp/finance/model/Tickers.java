package br.com.exp.finance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Entity "tickers", w/ data relative to
 * 'ticker'
 * primary key: ticker
 * current price
 * type of ticker(ação, fii, etf)
 * lombok getters, setters and no args constructor
 * @author eXP
 * @version 0.1
 */

@Entity
@Table(name="tickers")
@Getter
@Setter
@NoArgsConstructor
public class Tickers {
    @Id
    private String ticker;

    @Column
    private BigDecimal atual;

    @Column(nullable = false)
    private String tipo;
}
