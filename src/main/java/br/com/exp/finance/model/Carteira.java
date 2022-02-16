package br.com.exp.finance.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entidade Carteira. Permite definir um código para cada carteira.
 * <p>- Propriedades: PK Long idCarteira, String carteira.
 * <p>- Construtor: NoArgs, Arg: Long id.
 * @author eXP
 * @version 0.3
 */

@Entity
@Table(name="carteira")
@Getter
@Setter
@NoArgsConstructor
public class Carteira {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCarteira;

    @Column(nullable = false, length = 3)
    private String carteira;

    /**
     * Construtor com o parâmetro id.
     * Necessário para criação da Carteira.
     * Uma Carteira para cada Ativo.
     * @param id idCarteira
     */
    public Carteira(Long id){
        this.idCarteira = id;
    }
}
