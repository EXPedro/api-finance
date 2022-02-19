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
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Entidade Ativo. Permite registrar cada Ativo pertencente à determinada carteira.
 * <p>- Propriedades: PK Long idAtivo, FK Carteira cod_carteira, FK Ticker ativoTicker,
 * int quantidade, BigDecimal pm.
 * <p>- Construtor: NoArgs.
 * @author eXP
 * @version 0.3
 */

@Entity
@Table(name="ativo")
@Getter
@Setter
@NoArgsConstructor
@ToString
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
