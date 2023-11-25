package chapter_8.com.casadocodigo.livraria.teste;

import chapter_8.com.casadocodigo.livraria.Autor;
import chapter_8.com.casadocodigo.livraria.produtos.Ebook;
import chapter_8.com.casadocodigo.livraria.produtos.LivroFisico;

public class RegistroDeVendas {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Drive Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total: " + carrinho.getTotal());
    }
}
