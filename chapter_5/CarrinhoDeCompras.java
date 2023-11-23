package chapter_5;

public class CarrinhoDeCompras {

    private double total;
    /*
     * 
     * public void adiciona(LivroFisico livro) {
     * System.out.println("Adicionando: " + livro);
     * }
     * 
     * public void adiciona(Ebook livro) {
     * System.out.println("Adicionando: " + livro);
     * }
     * 
     * Como existe uma herança envolvida, podemos dizer que tanto
     * um LivroFisico como um Ebook são filhos (extensões)
     * da classe Livro. Poderíamos criar um único método adiciona,
     * que recebe um Livro (superclasse) como parâmetro:
     */

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicarDescontoDe(0.05);
        total += livro.getValor();
    }

    public double getTotal() {
        return total;
    }
}
