
package emprestimo;


public class Livro {
 
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String emprestar() {
        if (disponivel) {
            disponivel = false;
            return "Empréstimo realizado com sucesso!";
        } else {
            return "Falha: O livro já está emprestado!";
        }
    }

    public void devolver() {
        disponivel = true;
    }

    public void exibirEstado() {
        String estado = disponivel ? "disponível" : "indisponível";
        System.out.println("Livro: " + titulo + " | Autor: " + autor + " | Estado: " + estado);
    }
}
