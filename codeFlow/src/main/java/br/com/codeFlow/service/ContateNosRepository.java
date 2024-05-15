package br.com.codeFlow.service;

import br.com.codeFlow.controller.EmailController;
import br.com.codeFlow.model.email.ContateNos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContateNosRepository extends JpaRepository<ContateNos, Long> {

}