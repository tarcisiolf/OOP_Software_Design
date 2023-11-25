package br_com_casadocodigo_livraria_produtos;

import br_com_casadocodigo_livraria.Autor;

public class Ebook extends Livro implements Promocional {
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }

        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public String getWaterMark() {
        return waterMark;
    }
}
