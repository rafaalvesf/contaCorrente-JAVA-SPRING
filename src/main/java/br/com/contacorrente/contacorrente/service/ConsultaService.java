package br.com.contacorrente.contacorrente.service;

import br.com.contacorrente.contacorrente.model.TransacaoModel;
import br.com.contacorrente.contacorrente.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    private ContaRepository contaRepository;

    public List<TransacaoModel> obterTransacoes(){
        return this.contaRepository.findAll();
    }

}
