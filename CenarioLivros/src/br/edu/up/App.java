package br.edu.up;

import br.edu.up.models.*;

public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1598fhk", "Core Java 2", "Cay S. Horstmann e Gary Cornell", "0130819336", 2005);
        Prompt.imprimir(livro1);

        Livro livro2 = new Livro("9865PLO", "Java, Como programar", "Harvey Deitel", "0130341517", 2015);
        Prompt.imprimir(livro2);

    }
}
