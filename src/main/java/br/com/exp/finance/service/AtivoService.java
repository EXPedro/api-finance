package br.com.exp.finance.service;

import br.com.exp.finance.mapper.AtivoMapper;
import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.model.dto.AtivoDTO;
import br.com.exp.finance.repository.AtivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Serviço que implementa as operações CRUD usando o repositório 'ativoRepository'.
 * <p>- Métodos:
 * POST: Ativo saveAtivo(Ativo ativo), GET: List<Ativo> findAll(), Optional<Ativo> findById(Long codigo),
 * PUT: Ativo updateAtivos(Ativo ativo), DELETE: void deleteAtivos(Long codigo).
 * @author eXP
 * @version 0.3
 */

@Service
public class AtivoService {

    //chama repositório
    AtivoRepository ativoRepository;

    AtivoMapper ativoMapper;

    private EntityManager em;

    //"magia" spring (injeção do repositório no serviço)
    @Autowired
    public AtivoService(AtivoRepository ativoRepository){
        this.ativoRepository = ativoRepository;
    }

    /**
     * Método CRUD (Create): POST. Cria um novo Ativo
     * @param ativo Ativo
     * @return {@link Ativo}
     */
    public Ativo saveAtivo(Ativo ativo){
        return ativoRepository.save(ativo);
    }

    /**
     * Método CRUD (Read): GET. Retorna a lista de Ativos do banco de dados.
     * @return {@link List<AtivoDTO>}
     */
    public List<AtivoDTO> findAll(){
        List<Ativo> listaAtivos = ativoRepository.findAll();
        return AtivoMapper.listAtivosToDTO(listaAtivos);
    }

    /**
     * Método CRUD (Read): GET byId. Retorna um Ativo pela sua Id.
     * @param codigo Ativo id
     * @return {@link Optional<Ativo>}
     */
    public Optional<Ativo> findById(Long codigo){
        return ativoRepository.findById(codigo);
    }

    /**
     * Método CRUD (Update): PUT. Atualiza um Ativo, alterando o registro anterior.
     * @param ativo Ativo
     * @return {@link Ativo}
     */
    public Ativo updateAtivos(Ativo ativo){
        return ativoRepository.save(ativo);
    }

    /**
     * Método CRUD (Delete): DELETE byID. Deleta um Ativo de acordo com a Id desejada.
     * @param codigo Ativo id
     */
    public void deleteAtivos(Long codigo){
        ativoRepository.deleteById(codigo);
    }
}
