package br.com.codeFlow.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class User {

    private String login;
    private String password;
}
