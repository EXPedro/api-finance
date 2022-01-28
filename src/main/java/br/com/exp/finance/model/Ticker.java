package br.com.exp.finance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    private String ticker;

    @OneToOne
    @JoinColumn(name="id_tipo")
    private Tipo codigo_tipo;
}
