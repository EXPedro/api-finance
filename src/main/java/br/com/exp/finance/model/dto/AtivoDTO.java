package br.com.exp.finance.model.dto;

import br.com.exp.finance.model.Carteira;
import br.com.exp.finance.model.Ticker;
import lombok.Getter;
import lombok.Setter;

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
        this.ativoTicker = new Ticker(strTicker);
        this.codigoCarteira = new Carteira(codCarteira);
        this.quantidade = intQuantidade;
        this.pm = bdPm;
    }
}
