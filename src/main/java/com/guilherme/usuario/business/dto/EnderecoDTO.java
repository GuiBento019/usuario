package com.guilherme.usuario.business.dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class EnderecoDTO {

    private String rua;
    private String bairro;
    private Long numero;
    private String complemento;
    private String estado;
    private String cidade;
    private String cep;

}
