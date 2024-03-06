package br.com.fiap.softsales.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.softsales.model.Produto;

@RestController
@RequestMapping("produto")
public class ProdutosController {
    
    Logger log = LoggerFactory.getLogger(getClass());

    List<Produto> repository = new ArrayList<>();

    @GetMapping
    public List<Produto> index(){
        return repository;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Produto create(@RequestBody Produto produto){
        log.info("cadastrando produto {}", produto );
        repository.add(produto);
        return produto;
    }

    @GetMapping("{id}")
    public ResponseEntity<Produto> show(@PathVariable Integer id){
        log.info("buscando produto com id {} ", id);

        for(Produto produto : repository){
            if (produto.id().equals(id)) 
                return ResponseEntity.ok(produto);
        }

        return ResponseEntity.notFound().build();
    }
}
