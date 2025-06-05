package com.example.models;

public class LivroFisico extends Livro {
    private int numeroDePaginas;

    public LivroFisico(String titulo, int anoPublicacao, Autor autor, int numeroDePaginas ){
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }

    public String exibirDetalhes(){
        return "livro fisico-" + super.exibirDetalhes() + ", numero de paginas: " + numeroDePaginas + super.getAutor();
    }
}
