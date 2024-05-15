package br.com.codeFlow.dto;

import jakarta.validation.constraints.NotBlank;


public record ContateNosDTO(

    @NotBlank
    String nome,
    @NotBlank
    String email,
    @NotBlank
    String mensagem,
    @NotBlank
    String telefone
){
}