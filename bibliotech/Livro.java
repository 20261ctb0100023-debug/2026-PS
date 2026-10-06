package bibliotech;

/*
* Disciplina: 2026-PS
* Projeto : bibliotech
* Arquivo : Livro.java
* Autor   : Anna Comin
* Descricao: a caixa "Livro" do diagrama de classes, em Java (Aula 37).
*/
public class Livro {

    // ATRIBUTOS: a faixa do meio da caixa, um por linha, todos private.
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;     // nao estava na caixa: o codigo pediu

    // CONSTRUTOR: preenche a ficha do livro no momento do "new".
public Livro (String titulo, String autor, int ano) {
this.titulo = titulo;
this.autor = autor;
this.ano = ano;
this.disponivel = true;
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

public boolean estaDisponivel(){
    return disponivel;
    }

    // Os dois metodos que o emprestimo vai usar na Aula 38.
    public void emprestar() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    // toString: como a ficha se apresenta (Aula 34).
    public String toString() {
        String situacao = disponivel? "disponivel": "emprestado";
        return titulo + " (" + autor + "," + ano + ")-" + situacao;
    }
}


