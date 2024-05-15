package br.com.codeFlow.controller;

import br.com.codeFlow.dto.ContateNosDTO;
import br.com.codeFlow.model.email.ContateNos;
import br.com.codeFlow.service.ContateNosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private ContateNosService contateNosService;



    @PostMapping("/enviar")
    public ResponseEntity<?> mensagemCliente(@RequestBody ContateNosDTO contateNosDTO) {
        contateNosService.mensagemDoCliente(contateNosDTO);
        return ResponseEntity.ok("Mensagem enviada com sucesso");

    }

}
