package com.example.models;

public class Livro{
    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    public Autor getAutor(){
        return autor;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public String exibirDetalhes(){
        return " titulo: " + titulo + " ,ano da publicação: " + anoPublicacao;
    }
}