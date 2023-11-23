package chapter_5;

/*
 * Super -> Delega a responsabilidade do construtor para 
 * a superclasse Livro que já tem esse comportamento
 * bem definido.
 * 
 * Extends -> Subclasse HERDA tudo o que a superclasse tem.
 */
public class Ebook extends Livro {
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    /*
     * A JVM sempre vai procurar o método primeiro no objeto que foi
     * instanciado e apenas quando não encontrar procurará em sua
     * SUPERCLASSE.
     */

    @Override

    /* Override -> marcar os métodos reescritos da SUPERCLASSE na SUBCLASSE */
    public boolean aplicarDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }

        /*
         * A visibilidade do atributo valor é PRIVATE. Dessa forma, ele só pode
         * ser acessado pela prórpia classe.
         * 
         * this.valor -= this.valor * porcentagem;
         */

        /*
         * double desconto = this.getValor() * porcentagem;
         * this.setValor(this.getValor() - desconto);
         * return true;
         * 
         * Outra forma de fazer isso seria utilizando o super.
         * Dessa ofrma fica claro que estmao invocando o método
         * da classe pai
         */

        return super.aplicarDescontoDe(porcentagem);
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }
}
