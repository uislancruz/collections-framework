package com.algaworks.agencia;

public class Hotel {

    private String nome;
    private String cidade;
    private double preco;

    public Hotel(String cidade, String nome, double preco) {
        this.cidade = cidade;
        this.nome = nome;
        this.preco = preco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "cidade='" + cidade + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
