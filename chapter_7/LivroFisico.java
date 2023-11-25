package chapter_7;

public class LivroFisico extends Livro implements Promocional {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return this.getValor() * 0.05;
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }

        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
}
