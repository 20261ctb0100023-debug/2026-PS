package bibliotech;

/*
* Disciplina: 2026-PS
* Projeto   : bibliotech
* rquivo    : Main.java
* Autor     : Anna Comin
*Descricao: BiblioTech v0.2 (Aula 37): as classes do diagrama existem
*           e se apresentam. O menu chega na Aula 39.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("BiblioTech v0.2 as classes existem");

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("Capitaes da Areia", "Jorge Amado", 1937);

        System.out.println(livro1);
        System.out.println(livro2);
    
        livro1.emprestar();
        System.out.println("Depois do emprestimo: " + livro1);
        System.out.println("Dom Casmurro disponivel? " + livro1.estaDisponivel());
    }
}