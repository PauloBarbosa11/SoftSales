package br.com.fiap.softsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.softsales.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {

}
