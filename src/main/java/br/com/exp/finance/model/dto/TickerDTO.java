package br.com.exp.finance.model.dto;

import br.com.exp.finance.model.Tipo;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class TickerDTO {
    private String ticker;
    private BigDecimal atual;
    private Tipo codigoTipo;
}
