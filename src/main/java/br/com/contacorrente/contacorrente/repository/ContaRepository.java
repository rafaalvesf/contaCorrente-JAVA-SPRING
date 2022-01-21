package br.com.contacorrente.contacorrente.repository;

import br.com.contacorrente.contacorrente.model.TransacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<TransacaoModel,Long> {
}
