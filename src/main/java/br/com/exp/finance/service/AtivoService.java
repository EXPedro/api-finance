package br.com.exp.finance.service;

import br.com.exp.finance.exception.IdNotFoundException;
import br.com.exp.finance.mapper.AtivoMapper;
import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.model.Carteira;
import br.com.exp.finance.model.dto.AtivoDTO;
import br.com.exp.finance.repository.AtivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

    private EntityManager em;

    //"magia" spring (injeção do repositório no serviço)
    @Autowired
    public AtivoService(AtivoRepository ativoRepository){
        this.ativoRepository = ativoRepository;
    }

    /**
     * Método CRUD (Create): POST. Cria um novo Ativo
     * @param ativoDTO AtivoDTO
     * @return {@link AtivoDTO}
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public AtivoDTO saveAtivo(AtivoDTO ativoDTO){
        Ativo ativoToSave = AtivoMapper.dtoToAtivo(ativoDTO);
            ativoRepository.save(ativoToSave);
        return AtivoMapper.ativoToDTO(ativoToSave);
    }

    /**
     * Método CRUD (Read): GET. Retorna a lista de Ativos do banco de dados.
     * @return {@link List<AtivoDTO>}
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<AtivoDTO> findAll(){
        List<Ativo> listaAtivos = ativoRepository.findAll();
        return AtivoMapper.listAtivosToDTO(listaAtivos);
    }

    /**
     * Método CRUD (Read): GET byId. Retorna um Ativo pela sua Id.
     * @param codigo Long
     * @return {@link AtivoDTO}
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public AtivoDTO findById(Long codigo) throws IdNotFoundException{
        Ativo ativo =  verifyIfExists(codigo);
        return AtivoMapper.ativoToDTO(ativo);
    }

    /**
     * Método CRUD (Read): GET byCodigoCarteira. Retorna uma lista de Ativos
     * com o mesmo codigoCarteira.
     * @param codigoCarteira Long
     * @return {@link List<AtivoDTO>}
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<AtivoDTO> findByCarteira(Long codigoCarteira) throws IdNotFoundException{
        List<Ativo> listaAtivo =  ativoRepository.findByCodigoCarteira(codigoCarteira);
        return AtivoMapper.listAtivosToDTO(listaAtivo);
    }

    /**
     * Método CRUD (Update): PUT. Atualiza um Ativo, alterando o registro anterior.
     * @param ativoDTO AtivoDTO
     * @return {@link Ativo}
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public AtivoDTO updateAtivos(AtivoDTO ativoDTO){
        Ativo ativoToSave = AtivoMapper.dtoToAtivo(ativoDTO);
            ativoRepository.save(ativoToSave);
        return AtivoMapper.ativoToDTO(ativoToSave);
    }

    /**
     * Método CRUD (Delete): DELETE byID. Deleta um Ativo de acordo com a Id desejada.
     * @param codigo Ativo id
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteAtivos(Long codigo) throws IdNotFoundException{
        Ativo ativo = verifyIfExists(codigo);
        ativoRepository.deleteById(codigo);
    }

    /**
     * Método privado para verificar se existe o id
     * @param id Long
     * @return {@link Ativo}
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    private Ativo verifyIfExists(Long id) throws IdNotFoundException {
        return ativoRepository.findById(id).orElseThrow(()-> new IdNotFoundException(id));
    }
}
