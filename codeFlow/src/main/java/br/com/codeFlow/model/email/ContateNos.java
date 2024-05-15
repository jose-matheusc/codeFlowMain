package br.com.codeFlow.model.email;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "contate_nos")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ContateNos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String message;
    private String number;


}