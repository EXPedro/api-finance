package br.com.exp.finance.mapper;

import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.model.Ticker;
import br.com.exp.finance.model.dto.AtivoDTO;
import br.com.exp.finance.model.dto.TickerDTO;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class TickerMapper {
    private static final ModelMapper mapper =  new ModelMapper();

    public static TickerDTO tickerToDTO(Ticker ticker) {
        return mapper.map(ticker, TickerDTO.class);
    }

    public static Ticker dtoToTicker(TickerDTO tickerDTO){
        return mapper.map(tickerDTO, Ticker.class);
    }

    public static List<TickerDTO> listTickersToDTO(List<Ticker> listaTicker) {
        return listaTicker.stream().map(TickerMapper::tickerToDTO).collect(Collectors.toList());
    }

    public static List<Ticker> listDTOToTickers(List<TickerDTO> listaTickerDTO) {
        return listaTickerDTO.stream().map(TickerMapper::dtoToTicker).collect(Collectors.toList());
    }
}
