package br.com.fiap.softsales.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String nome;
    
    private BigDecimal valor;

}