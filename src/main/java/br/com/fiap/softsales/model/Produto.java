package br.com.fiap.softsales.model;

public record Produto(Integer id, String nome, Double valor) {
    
    public Produto(Integer id, String nome, Double valor){
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }
}
