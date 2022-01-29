package br.com.exp.finance.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Carteira
 * <p>
 *     <b>carteira</b>
 *     String
 * <p>
 * @author eXP
 * @version 0.2
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

    @Column(nullable = false)
    private String carteira;

    /**
     * Constructor with parameter id
     * <p>
     * Necessary for Ativo creation
     * <p>
     * One Carteira for each Ativo
     * @param id idCarteira
     */
    public Carteira(Long id){
        this.idCarteira = id;
    }
}
