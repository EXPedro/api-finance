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
 * Ticker
 * <p>
 *     <b>ticker:</b>
 *     primary key
 * <p>
 *     <b>atual:</b>
 *     current price
 * <p>
 *     <b>tipo:</b>
 *     type of ticker(ação, fii, etf)
 * @author eXP
 * @version 0.1
 */

@Entity
@Table(name="ticker")
@Getter
@Setter
@NoArgsConstructor
public class Ticker {
    @Id
    private String ticker;

    @Column
    private BigDecimal atual;

    @Column(nullable = false)
    private String tipo;
}