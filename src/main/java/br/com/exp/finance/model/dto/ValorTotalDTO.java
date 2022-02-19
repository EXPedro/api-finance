package br.com.exp.finance.model.dto;

import br.com.exp.finance.model.Ticker;
import br.com.exp.finance.model.dto.AtivoDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter
@Setter
@NoArgsConstructor
public class ValorTotalDTO {
    private String ticker;
    private String carteira;
    private int quantidade;
    private BigDecimal precoMedio;
    private BigDecimal valorInicial;
    private BigDecimal precoAtual;
    private BigDecimal valorAtual;
    private BigDecimal variacao;

    public ValorTotalDTO(AtivoDTO ativoDTO){
        Ticker tickerDTO = ativoDTO.getAtivoTicker();

        this.ticker = tickerDTO.getTicker();
        this.carteira = ativoDTO.getCodigoCarteira().getCarteira();
        this.quantidade = ativoDTO.getQuantidade();
        this.precoMedio = ativoDTO.getPm();
        this.valorInicial = precoMedio.multiply(new BigDecimal(ativoDTO.getQuantidade()));
        this.precoAtual = tickerDTO.getAtual();
        this.valorAtual = precoAtual.multiply(new BigDecimal(ativoDTO.getQuantidade()));
        this.variacao =  valorAtual.multiply(new BigDecimal(100))
                                   .divide(valorInicial, RoundingMode.CEILING)
                                   .subtract(new BigDecimal(100));
    }
}
