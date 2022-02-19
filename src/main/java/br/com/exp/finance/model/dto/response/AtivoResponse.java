package br.com.exp.finance.model.dto.response;

import br.com.exp.finance.model.dto.AtivoDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter
@Setter
@NoArgsConstructor
public class AtivoResponse {

    private String ativoTicker;
    private String tipo;
    private String codigoCarteira;
    private int quantidade;
    private BigDecimal precoMedio;
    private BigDecimal precoAtual;
    private BigDecimal variacao;

    public AtivoResponse(AtivoDTO ativoDTO){
        this.ativoTicker = ativoDTO.getAtivoTicker().getTicker();
        this.tipo = ativoDTO.getAtivoTicker().getCodigoTipo().getTipo();
        this.codigoCarteira = ativoDTO.getCodigoCarteira().getCarteira();
        this.quantidade = ativoDTO.getQuantidade();
        this.precoMedio = ativoDTO.getPm();
        this.precoAtual = ativoDTO.getAtivoTicker().getAtual();
        this.variacao = precoAtual.multiply(new BigDecimal(100))
                                  .divide(precoMedio, RoundingMode.CEILING)
                                  .subtract(new BigDecimal(100));
    }
}
