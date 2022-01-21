package br.com.contacorrente.contacorrente.controller;

import br.com.contacorrente.contacorrente.model.TransacaoModel;
import br.com.contacorrente.contacorrente.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transacao")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;

    @PostMapping
    public TransacaoModel criarTransacao(@RequestBody TransacaoModel transacaoModel){
        return this.transacaoService.criarTransacao(transacaoModel);
    }
}
