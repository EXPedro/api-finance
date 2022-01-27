package br.com.exp.finance.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Carteiras
 * <p>
 *     <b>carteiras</b>
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
