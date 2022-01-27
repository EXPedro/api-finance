package br.com.exp.finance.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Entity "carteiras", w/ data relative to
 * 'carteiras'
 * lombok getters, setters and no args constructor
 * @author eXP
 * @version 0.1
 */

@Entity
@Table(name="carteiras")
@Getter
@Setter
@NoArgsConstructor
public class Carteiras {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;

    @Column(nullable = false)
    private String carteira;
}
