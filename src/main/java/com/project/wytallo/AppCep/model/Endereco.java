package com.project.wytallo.AppCep.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Endereco(String cep,
                       String logradouro,
                       String bairro,
                       String localidade,
                       String estado,
                       String ddd) {
}
