package br.com.exp.finance.model.dto;

import br.com.exp.finance.model.Carteira;
import br.com.exp.finance.model.Ticker;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class AtivoDTO {
    private static Long idAtivo;
    private Ticker ativoTicker;
    private Carteira codigoCarteira;
    private int quantidade;
    private BigDecimal pm;
}
