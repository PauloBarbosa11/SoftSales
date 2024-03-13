package br.com.fiap.softsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.softsales.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
