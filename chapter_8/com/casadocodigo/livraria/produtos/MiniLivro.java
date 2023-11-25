package br_com_casadocodigo_livraria_produtos;

import br_com_casadocodigo_livraria.Autor;

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
}
