package chapter_3;

public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    String nomeDoAutor;
    String emailDoAutor;
    String cpfDoAutor;
    Autor autor;

    /*
     * public static void main(String[] args) {
     * Livro livro = new Livro();
     * livro.nome = "Java 8 Prático";
     * livro.descricao = "Novos recursos de linguagem";
     * livro.valor = 59.90;
     * livro.isbn = "978-85-66250-46-6";
     * 
     * System.out.println("O nome do livrao é " + livro.nome);
     * }
     */

    // 3.2 Criando um novo método

    void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()) {

            autor.mostrarDetalhes();
        }

        System.out.println("--");

    }

    public void aplicarDescontoDe(double porcentagem) {
        this.valor -= this.valor * porcentagem;
    }

    boolean temAutor() {
        return this.autor != null;
    }
}
