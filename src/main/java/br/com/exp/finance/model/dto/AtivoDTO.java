package br.com.exp.finance.model.dto;

import br.com.exp.finance.model.Carteira;
import br.com.exp.finance.model.Ticker;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AtivoDTO {
    private static Long idAtivo;
    private Ticker ativoTicker;
    private Carteira codigoCarteira;
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
