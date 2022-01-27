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

    //grava novos ativos - POST
    public Ativos saveAtivos(Ativos ativos){
        return ativosRepository.save(ativos);
    }

    //lista todos os ativos - GET
    public List<Ativos> findAll(){
        return ativosRepository.findAll();
    }

    //lista ativos por id - GET ById
    public Optional<Ativos> findById(Long codigo){
        return ativosRepository.findById(codigo);
    }

    //atualiza ativos - PUT
    public Ativos updateAtivos(Ativos ativos){
        return ativosRepository.save(ativos);
    }

    //deleta ativos - DELETE ById
    public void deleteAtivos(Long codigo){
        ativosRepository.deleteById(codigo);
    }
}
