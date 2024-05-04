package br.com.codeFlow.model.email;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ContateNos {

    private String email;
    private String mensagem;
    private BigDecimal valorEstimado;


}
