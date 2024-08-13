package br.com.etechoracio.pw2_etec_car.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_ACESSORIO")
public class Acessorios {
    @Id
    @Column(name = "ID_ACESSORIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_DESCRICAO")
    private String descricao;

}
