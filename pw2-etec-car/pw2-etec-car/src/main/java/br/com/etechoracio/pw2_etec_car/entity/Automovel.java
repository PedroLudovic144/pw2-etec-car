package br.com.etechoracio.pw2_etec_car.entity;

import br.com.etechoracio.pw2_etec_car.enums.TipoCombustivelEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
    @Setter
    @Entity
    @Table(name = "TBL_AUTOMOVEL")
    public class Automovel{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_AUTOMOVEL")
        private Long id;

        @Column(name = "NR_ANO_FABRICACAO")
        private int anoFrabicação;

        @Column(name = "NR_ANO_MODELO")
        private int anoModelo;

        @Column(name = "TP_COMBUSTIVEL")
        @Enumerated(EnumType.STRING)
        private TipoCombustivelEnum combustível;

        @Column(name = "NR_PRECO")
        private float preco;

        @Column(name = "NR_KM_ATUAL")
        private int kmAtual;

        @JoinColumn(name = "ID_MODELO")
        @ManyToOne
        private Modelo idModelo;

        @ManyToMany
        @JoinTable(name = "TBL_REL_AUTOMOVEL_ACESSORIO",
                joinColumns = @JoinColumn(name = "ID_AUTOMOVEL"),
                inverseJoinColumns = @JoinColumn(name = "ID_ACESSORIO")
        )
        private List<Acessorios> acessorios;

    }
/*
* @Transiente = tabela que não tem no banco de dados
*
* */
