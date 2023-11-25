package chapter_8.com.casadocodigo.livraria.produtos;

@FunctionalInterface
public interface Promocional {
    boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontede10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}
