package com.project.wytallo.AppCep.principal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.wytallo.AppCep.model.Endereco;
import com.project.wytallo.AppCep.services.CEPService;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws JsonProcessingException {
        Scanner sc = new Scanner(System.in);
        int cep = sc.nextInt();
        CEPService teste = new CEPService();
        var json = teste.buscarCep(cep);


        ObjectMapper mapper = new ObjectMapper();
        Endereco rua = mapper.readValue(json, Endereco.class);
        System.out.println(rua.localidade());
    }
}
