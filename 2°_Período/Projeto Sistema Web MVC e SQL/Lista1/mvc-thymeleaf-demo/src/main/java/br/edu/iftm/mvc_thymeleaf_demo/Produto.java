package br.edu.iftm.mvc_thymeleaf_demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {
    String nome;
    Double preco;
}