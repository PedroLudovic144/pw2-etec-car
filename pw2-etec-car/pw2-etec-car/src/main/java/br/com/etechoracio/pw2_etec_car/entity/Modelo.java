package br.com.etechoracio.pw2_etec_car.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.print.attribute.standard.MediaSize;

@Getter
@Setter
@Entity
@Table(name = "TBL_MODELO")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MODELO" )
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "NR_POTENCIA", columnDefinition = "numeric")
    private float potencia;

    @JoinColumn(name = "ID_MARCA")
    @ManyToOne
    private Marca marca;

}
/*
    1 modelo tem 1 marca
    1 marca tem N modelos
 */


