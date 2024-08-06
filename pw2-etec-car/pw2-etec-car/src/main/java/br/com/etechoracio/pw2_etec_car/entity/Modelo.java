package br.com.etechoracio.pw2_etec_car.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_MODELO")
public class Modelo {
    @Id
    @Column(name = "ID_MODELO" )
    private Long id;
    private String nome;
    private float potencia;
    private Long marca;

}
