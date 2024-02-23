package com.example.bibliotecaabc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Editora {

    private long id;
    private String nome;
    private String endereco;
    private String telefone;
}
