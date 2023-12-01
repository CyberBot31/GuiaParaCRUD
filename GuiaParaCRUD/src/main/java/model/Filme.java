package model;

importar jakarta.persistence.*;
importar lombok.Getter;
importar lombok.Setter;
importar java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_filme")
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    título de string privado;
    @Coluna(nome = "ds_sinopse", comprimento = 500)
    private String sinopse;

    @ManyToOne
    privado Genero genero;

}