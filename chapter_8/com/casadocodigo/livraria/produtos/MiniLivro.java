package chapter_8.com.casadocodigo.livraria.produtos;

import chapter_8.com.casadocodigo.livraria.Autor;

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }
}
