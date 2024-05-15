
package br.edu.up;
import java.util.Locale;
import br.edu.up.modelos.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        java.util.Locale.setDefault(Locale.US);

        Livro livro = new Livro();

        System.out.println("Livro 1");
        System.out.println("Digite o código do livro:");
        livro.setCodigo(leitor.nextLine());
        System.out.println("Digite o Titulo:");
        livro.setTitulo(leitor.nextLine());
        System.out.println("Digite o Autor:");
        livro.setAutores(leitor.nextLine());
        System.out.println("Digite o ISBN: ");
        livro.setIsbn(leitor.nextLine());
        System.err.println("Digite o ano: ");
        livro.setAno(leitor.nextInt());

        System.out.println("");
        System.out.println("---------------------------------------------------");

        leitor.nextLine();
        System.out.println("");
        System.out.println("---------------------------------------------------");

        // LIVRO 2
        Livro livro2 = new Livro();

        System.out.println("LIVRO 2");
        System.out.println("Digite o código do livro:");
        livro2.setCodigo(leitor.nextLine());
        System.out.println("Digite o Titulo:");
        livro2.setTitulo(leitor.nextLine());
        System.out.println("Digite o Autor:");
        livro2.setAutores(leitor.nextLine());
        System.out.println("Digite o ISBN: ");
        livro2.setIsbn(leitor.nextLine());
        System.out.println("Digite o ano: ");
        livro2.setAno(leitor.nextInt());

        System.out.println("");
        System.out.println("---------------------------------------------------");

        System.out.println("LIVRO 1");
        livro.mostrarLivro();

        System.out.println("");
        System.out.println("---------------------------------------------------");

        System.out.println("LIVRO 2");
        livro2.mostrarLivro();

        leitor.close();

    }

}
