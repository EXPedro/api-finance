package br.com.exp.finance.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name="codigo_tipo")
    private Tipo codigoTipo;

    /**
     * Constructor with parameter ticker
     * <p>
     * Necessary for Ativo creation
     * <p>
     * One Ticker for each Ativo
     * @param ticker String
     */
    public Ticker (String ticker){
        this.ticker = ticker;
    }
}
