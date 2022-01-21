package br.com.contacorrente.contacorrente.controller;

import br.com.contacorrente.contacorrente.model.TransacaoModel;
import br.com.contacorrente.contacorrente.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/consulta")
public class ConsultaController {
    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public List<TransacaoModel> obterTodos() {
        return this.consultaService.obterTransacoes();
    }
}
