package br.com.exp.finance.model.dto;

import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.model.Carteira;
import br.com.exp.finance.model.Ticker;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;

@Getter
@Setter
public class AtivoDTO {
    private Long idAtivo;
    private Carteira codigoCarteira;
    private Ticker ativoTicker;
    private int quantidade;
    private BigDecimal pm;

    public AtivoDTO (){}

    public AtivoDTO (Long codCarteira, String strTicker, int intQuantidade, BigDecimal bdPm){
        this.codigoCarteira = new Carteira(codCarteira);
        this.ativoTicker = new Ticker(strTicker);
        this.quantidade = intQuantidade;
        this.pm = bdPm;
    }
}
