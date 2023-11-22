package chapter_4;

public class RegrasDeDesconto2 {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.valor = 59.90;

        System.out.println("Valor atual " + livro.valor);

        livro.valor -= livro.valor * 0.4;
        System.out.println("Valor com desconto: " + livro.valor);
    }
}
