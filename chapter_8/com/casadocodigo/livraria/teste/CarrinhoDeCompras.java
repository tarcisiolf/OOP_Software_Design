package br_com_casadocodigo_livraria_teste;

import br_com_casadocodigo_livraria_produtos.Produto;

public class CarrinhoDeCompras {

    private double total;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}
