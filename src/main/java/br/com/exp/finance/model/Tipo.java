package br.com.exp.finance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tipo choose between 1 of the 4 types
 * that an ativo can be
 * <p>
 *     <b>tipo</b>
 *     String
 * @author eXP
 * @version 0.2
 */

@Entity
@Table(name="tipo")
@Getter
@Setter
@NoArgsConstructor
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipo;

    @Column(nullable = false)
    private String tipo;

    public Tipo(Long id){
        this.idTipo = id;
    }
}
