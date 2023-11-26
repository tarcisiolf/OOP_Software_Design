package chapter_9.com.casadocodigo.livraria.teste;

import chapter_9.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        this.total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }

    public void getProdutos() {
        for (int i = 0; i <= produtos.length; i++) {
            try {

                Produto produto = produtos[i];
                if (produto != null) {
                    System.out.println(produto.getValor());
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Deu exception no indice: " + i);
            } catch (NullPointerException e) {
                System.out.println("O arrau não foi instanciado!");
            }
        }

        System.out.println("Fui executado !");
    }
}
