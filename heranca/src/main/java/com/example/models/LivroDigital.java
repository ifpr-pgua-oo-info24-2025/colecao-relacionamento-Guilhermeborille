package com.example.models;

public class LivroDigital extends Livro{
    private double tamanhoDoArquivoMB;

    public LivroDigital(String titulo, int ano, Autor autor, double tamanhoDoArquivoMB){
        super(titulo, ano, autor);
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public double getTamanhoDoArquivoMB(){
        return tamanhoDoArquivoMB;
    }
    public void setTamanhoDoArquivoMB(double tamanhoDoArquivoMB){
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public String exibirDetalhes(){
        return "livro digital-" + super.exibirDetalhes() + " tamanho do arquivo MB:" + tamanhoDoArquivoMB + super.getAutor();
    }
}