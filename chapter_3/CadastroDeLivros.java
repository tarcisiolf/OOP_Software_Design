package chapter_3;

// 3.1 Criando um molde de livros
public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caelum.com.br";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos de linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";

        livro.autor = autor;
        /*
         * System.out.println(livro.nome);
         * System.out.println(livro.descricao);
         * System.out.println(livro.valor);
         * System.out.println(livro.isbn);
         */

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.nome = "Paulo Silveira";
        outroAutor.email = "paulo.silveira@caelum.com.br";
        outroAutor.cpf = "123.456.789.10";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";

        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();

        /*
         * System.out.println(outroLivro.nome);
         * System.out.println(outroLivro.descricao);
         * System.out.println(outroLivro.valor);
         * System.out.println(outroLivro.isbn);
         */

    }
}
