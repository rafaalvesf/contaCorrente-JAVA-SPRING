package br.com.contacorrente.contacorrente.service;

import br.com.contacorrente.contacorrente.model.TransacaoModel;
import br.com.contacorrente.contacorrente.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {
    @Autowired
    private ContaRepository contaRepository;

    public TransacaoModel criarTransacao(TransacaoModel transacaoModel){
        if (transacaoModel.getOperacao()=="debito"){
            double a = transacaoModel.getTotal();
            double b = transacaoModel.getValor();
            a = a - b;
            transacaoModel.setTotal(a);
        }
        else{
            double a = transacaoModel.getTotal();
            double b = transacaoModel.getValor();
            a = a + b;
            transacaoModel.setTotal(a);
        }
        return this.contaRepository.save(transacaoModel);
    }
}
