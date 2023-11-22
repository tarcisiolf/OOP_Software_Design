package chapter_4;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        Livro livro = new Livro(autor);
        livro.adicionaValor(59.90);

        System.out.println("Valor atual " + livro.retornaValor());

        if (!livro.aplicarDescontoDe(0.4)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.retornaValor());
        }
    }
}
