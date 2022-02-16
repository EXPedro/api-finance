package br.com.exp.finance.mapper;

import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.model.dto.AtivoDTO;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AtivoMapper {
    private static final ModelMapper mapper =  new ModelMapper();

    public static AtivoDTO ativoToDTO(Ativo ativo) {
        return mapper.map(ativo, AtivoDTO.class);
    }

    public static Ativo dtoToAtivo(AtivoDTO ativoDTO){
        return mapper.map(ativoDTO, Ativo.class);
    }

    public static List<AtivoDTO> listAtivosToDTO(List<Ativo> listaAtivo) {
        return listaAtivo.stream().map(AtivoMapper::ativoToDTO).collect(Collectors.toList());
    }

}
