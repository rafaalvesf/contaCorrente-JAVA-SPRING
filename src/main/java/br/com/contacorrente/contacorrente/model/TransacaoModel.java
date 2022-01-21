package br.com.contacorrente.contacorrente.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "contacorrente")
public class TransacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "data", nullable = false)
    private String data;
    @Column(name = "operacao", nullable = false)
    private String operacao;
    @Column(name = "valor", nullable = false)
    private Double valor;
    @Column(name = "total", nullable = false)
    private Double total = 12500.00;

}
