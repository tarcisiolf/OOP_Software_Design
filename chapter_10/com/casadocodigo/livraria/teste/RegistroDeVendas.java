package chapter_10.com.casadocodigo.livraria.teste;

import chapter_10.com.casadocodigo.livraria.Autor;
import chapter_10.com.casadocodigo.livraria.produtos.Ebook;
import chapter_10.com.casadocodigo.livraria.produtos.LivroFisico;
import chapter_10.com.casadocodigo.livraria.produtos.Produto;

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
        
        Produto[] produtos = carrinho.getProdutos();
        
        for (int i = 0; i < produtos.length; i++) {
            Produto produto = produtos[i];
            
            try {
                if (produto != null) {
                    System.out.println(produto.getValor());
                }
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Deu exception no indice: " + i);
            } catch (NullPointerException e) {
                System.out.println("O array não foi instanciado!");
            }
        }
        
        System.out.println("Fui executado!");
        ebook.toString();
        
        // TESTE EQUALS
        System.out.println("--------------------------------");
        Autor autor1 = new Autor();
        autor.setNome("Rodrigo Turini");
        
        Autor autor2 = new Autor();
        autor.setNome("Rodrigo Turini");

        if (autor1.equals(autor2)) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
    }
}

