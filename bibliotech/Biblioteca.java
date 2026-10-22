

import java.util.ArrayList;
import java.util.Objects;

public class Biblioteca {

    //0 0.. do diagrama: cada lista guarda muitas referencias.
    private ArrayList<Livro> livros;
    private ArrayList<Leitor> leitores;
    private ArrayList<Emprestimo> emprestimos;

    public void cadastrarLivro (Livro livro) {
        livros.add(Objects.requireNonNull(livro, "Livro nao pode ser nulo."));
    }

    public void cadastrarLeitor (Leitor leitor) {
        leitores.add(Objects.requireNonNull(leitor, "Leitor nao pode ser nulo."));
    }

    public void listarAcervo() {
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }
    }

    // Declarar nao cria: as tres listas nascem aqui, no new.
    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
        this.leitores = new ArrayList<Leitor>();
        this.emprestimos = new ArrayList<Emprestimo>();
    }

    // Devolve o livro achado, ou null se o titulo nao esta no acervo.
    public Livro buscarLivro (String titulo) {
        if (titulo == null) {
            return null;
        }

        for (int i = 0; i < livros.size(); i++) {
            Livro livroAtual = livros.get(i);
            if (titulo.equals(livroAtual.getTitulo())) {
                return livroAtual;
            }
        }
        return null;
    }

    // Devolve o leitor achado, ou null se a matricula nao esta cadastrada.
    public Leitor buscarLeitor (String matricula) {
        if (matricula == null) {
            return null;
        }

        for (int i = 0; i < leitores.size(); i++) {
            Leitor leitorAtual = leitores.get(i);
            if (matricula.equals(leitorAtual.getMatricula())) {
                return leitorAtual;
            }
        }
        return null;
    }

    // Acha os dois pelo texto, cria o registro e so arquiva se deu certo.
    public boolean emprestar (String titulo, String matricula) {
        Livro livro = buscarLivro (titulo);
        Leitor leitor = buscarLeitor (matricula);
        if (livro == null || leitor == null) {
            return false;
        }
        Emprestimo novo = new Emprestimo (livro, leitor);
        if (!novo.realizarEmprestimo()) {
            return false;
        }
        emprestimos.add(novo);
        return true;
    }

    // Procura o emprestimo ATIVO daquele titulo. O registro continua na lista.
    public boolean devolver1 (String titulo) {
        if (titulo == null) {
            return false;
        }

        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo e = emprestimos.get(i);
            if (e.estaAtivo() && titulo.equals(e.getLivro().getTitulo())) {
                return e.registrarDevolucao();
            }
        }
        return false;
    }

    public void listarEmprestimos() {
        for (int i = 0; i < emprestimos.size(); i++) {
            System.out.println(emprestimos.get(i));
        }
    }
    // Fornece uma descricao do acervo para a interface.
    public String obterAcervoComoTexto() {
        if (livros.isEmpty()) {
            return "Nenhum livro cadastrado.";
        }

        String texto = "";
        for (int i = 0; i < livros.size(); i++) {
            texto = texto + livros.get(i) + "\n";
        }
        return texto;
    }
}
