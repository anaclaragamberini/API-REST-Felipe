package com.loja.lojaeletronicos.model;

import jakarta.persistence.*;

@Entity
public class Produto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String categoria;
    private String marca;
    private String descricao;
    private String nivelUtilizacao;
    private int estoque;
    private double preco;

    public Produto() {}

    public Produto(String nome, String categoria, String marca, String descricao,
                   String nivelUtilizacao, int estoque, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
        this.descricao = descricao;
        this.nivelUtilizacao = nivelUtilizacao;
        this.estoque = estoque;
        this.preco = preco;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getNivelUtilizacao() { return nivelUtilizacao; }
    public void setNivelUtilizacao(String nivelUtilizacao) { this.nivelUtilizacao = nivelUtilizacao; }

    public int getEstoque() { return estoque; }
    public void setEstoque(int estoque) { this.estoque = estoque; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}