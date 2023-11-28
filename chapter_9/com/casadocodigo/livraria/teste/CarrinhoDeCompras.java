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

    public Produto[] getProdutos() {
        return produtos;
    }
}
