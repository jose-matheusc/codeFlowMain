package br.com.codeFlow.service;


import br.com.codeFlow.dto.ContateNosDTO;
import br.com.codeFlow.model.email.ContateNos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContateNosService {


    @Autowired
    private ContateNosRepository contateNosRepository;

    private ContateNosDTO contateNosDTO;



    public void mensagemDoCliente(ContateNosDTO contateNosDTO){
       try {



           if (contateNosDTO.mensagem() == null || contateNosDTO.mensagem().length() < 20) {
               throw new RuntimeException("Digite uma mensagem maior explicando...");
           }


           if (contateNosDTO.nome() == null || contateNosDTO.nome().isEmpty()) {
               throw new RuntimeException("Digite seu nome");
           }

           if (contateNosDTO.telefone() == null || contateNosDTO.telefone().isEmpty()) {
               throw new RuntimeException("Digite seu número de celular");
           }

           ContateNos contateNos = new ContateNos();
           contateNos.setMessage(contateNosDTO.mensagem());
           contateNos.setName(contateNosDTO.nome());
           contateNos.setNumber(contateNosDTO.telefone());
           contateNos.setEmail(contateNosDTO.email());
           contateNosRepository.save(contateNos);
       }catch (IllegalArgumentException e){
           throw new RuntimeException("Infomações incorretas");
       }

    }
}
