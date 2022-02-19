package br.com.exp.finance.controller;

import br.com.exp.finance.model.Carteira;
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
public class ValorTotalController {
    private String ticker;
    private String carteira;
    private BigDecimal valor_inicial;
    private BigDecimal valor_atual;
    private BigDecimal variacao;

    public ValorTotalController(AtivoDTO ativoDTO){
        Ticker tickerDTO = ativoDTO.getAtivoTicker();

        this.ticker = tickerDTO.getTicker();
        this.carteira = ativoDTO.getCodigoCarteira().getCarteira();
        this.valor_inicial = ativoDTO.getPm().multiply(new BigDecimal(ativoDTO.getQuantidade()));
        this.valor_atual = tickerDTO.getAtual().multiply(new BigDecimal(ativoDTO.getQuantidade()));
        this.variacao =  valor_atual.multiply(new BigDecimal(100))
                                    .divide(valor_inicial, RoundingMode.CEILING)
                                    .subtract(new BigDecimal(100));
    }
}
