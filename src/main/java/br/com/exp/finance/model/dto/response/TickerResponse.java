package br.com.exp.finance.model.dto.response;

import br.com.exp.finance.model.dto.TickerDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class TickerResponse {
    private String ticker;
    private String codigoTipo;
    private BigDecimal atual;

    public TickerResponse(TickerDTO tickerDTO){
        this.ticker = tickerDTO.getTicker();
        this.codigoTipo = tickerDTO.getCodigoTipo().getTipo();
        this.atual = tickerDTO.getAtual();
    }
}
