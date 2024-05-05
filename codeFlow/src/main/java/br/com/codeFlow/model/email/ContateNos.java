package br.com.codeFlow.model.email;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ContateNos {

    private Long id;
    private String nome;
    private String email;
    private String numero;
    private String mensagem;


}
