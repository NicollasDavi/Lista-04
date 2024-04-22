package br.edu.up;

import br.edu.up.Models.Livro;

public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1598fhk", "Core Java 2", "Cay S. Horstmann e Gary Cornell", "0130819336", 2005);
        Prompt.imprimir(livro1);
    }
}
