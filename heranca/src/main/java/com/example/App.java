package com.example;

import com.example.models.*;
import java.util.ArrayList;

public class App {
    public static void main(String [] args){
        ArrayList<Livro> biblioteca = new ArrayList<>();
        Autor autor1 = new Autor("Pierre Boulle", "Frances");
        Autor autor2 = new Autor("Jeff Lindsay", "americano");
        Autor autor3 = new Autor("Richard Matheson", "americano");
        Autor autor4 = new Autor(" Michael Crichton", "americano");
        
        Livro livro1 = new LivroFisico("planeta dos macacos ", 1963, autor1, 216);
        Livro livro2 = new LivroFisico("Darkly Dreaming Dexter", 2004, autor2, 288);

        Livro livro3 = new LivroDigital("Eu Sou a Lenda", 1954, autor3, 11.4);
        Livro livro4 = new LivroDigital("Jurassic Park", 1990 , autor4, 10.2);

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);
        biblioteca.add(livro4);

        for(int i = 0; i < biblioteca.size();i++){
            System.out.println(biblioteca.get(i).exibirDetalhes());
        }
    }

    
}
