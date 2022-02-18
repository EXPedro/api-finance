package br.com.exp.finance.model.dto;

import br.com.exp.finance.model.Ticker;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class TotalPorAtivoDTO {
    private Ticker ticker;
    private BigDecimal total;

    public TotalPorAtivoDTO (AtivoDTO ativoDTO){
        this.ticker = new Ticker(ativoDTO.getTicker());
        this.total = ativoDTO.getTotal();
    }
}
