package br.com.exp.finance.services;

import br.com.exp.finance.model.Ativo;
import br.com.exp.finance.repository.AtivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Service
 * Implements CRUD operations on 'ativoRepository'
 * @author eXP
 * @version 0.1
 */

@Service
public class AtivoService {

    //chama repositório
    AtivoRepository ativoRepository;

    private EntityManager em;

    //"magia" spring
    @Autowired
    public AtivoService(AtivoRepository ativoRepository){
        this.ativoRepository = ativoRepository;
    }

    /**
     * Create method of CRUD -> POST
     * save Ativo
     * @param ativo Ativo
     * @return {@link Ativo}
     */
    public Ativo saveAtivo(Ativo ativo){
        return ativoRepository.save(ativo);
    }

    /**
     * Read all method of CRUD -> GET
     * get all Ativo
     * @return {@link List<Ativo>}
     */
    public List<Ativo> findAll(){
        return ativoRepository.findAll();
    }

    /**
     * Read by Id method of CRUD -> GET
     * get byId Ativo
     * @param codigo Ativo id
     * @return {@link Optional<Ativo>}
     */
    public Optional<Ativo> findById(Long codigo){
        return ativoRepository.findById(codigo);
    }

    /**
     * Updade method of CRUD -> PUT
     * PUT in Ativo
     * @param ativo Ativo
     * @return {@link Ativo}
     */
    public Ativo updateAtivos(Ativo ativo){
        return ativoRepository.save(ativo);
    }

    /**
     * Delete method of CRUD -> DELETE
     * DELETE byId in Ativo
     * @param codigo Ativo id
     */
    public void deleteAtivos(Long codigo){
        ativoRepository.deleteById(codigo);
    }
}
