package br.com.etechoracio.pw2_etec_car.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_MARCA")
public class Marca {

    @Id
    @Column(name = "ID_MARCA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

}
