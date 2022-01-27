package br.com.exp.finance.services;

import br.com.exp.finance.model.Ativos;
import br.com.exp.finance.repository.AtivosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 * Service
 * Implements CRUD operations on 'ativosRepository'
 * @author eXP
 * @version 0.1
 */

@Service
public class AtivosServices {

    //chama repositório
    AtivosRepository ativosRepository;

    private EntityManager em;

    //"magia" spring
    @Autowired
    public AtivosServices(AtivosRepository ativosRepository){
        this.ativosRepository = ativosRepository;
    }

    /**
     * Create method of CRUD -> POST
     * save Ativos
     * @param ativos Ativos
     * @return {@link Ativos}
     */
    public Ativos saveAtivos(Ativos ativos){
        return ativosRepository.save(ativos);
    }

    /**
     * Read all method of CRUD -> GET
     * get all Ativos
     * @return {@link List<Ativos>}
     */
    public List<Ativos> findAll(){
        return ativosRepository.findAll();
    }

    /**
     * Read by Id method of CRUD -> GET
     * get byId Ativos
     * @param codigo Ativos id
     * @return {@link Optional<Ativos>}
     */
    public Optional<Ativos> findById(Long codigo){
        return ativosRepository.findById(codigo);
    }

    /**
     * Updade method of CRUD -> PUT
     * PUT in Ativos
     * @param ativos Ativos
     * @return {@link Ativos}
     */
    public Ativos updateAtivos(Ativos ativos){
        return ativosRepository.save(ativos);
    }

    /**
     * Delete method of CRUD -> DELETE
     * DELETE byId in Ativos
     * @param codigo Ativos id
     */
    public void deleteAtivos(Long codigo){
        ativosRepository.deleteById(codigo);
    }
}
