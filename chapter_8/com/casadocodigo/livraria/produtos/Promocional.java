package chapter_7;

@FunctionalInterface
public interface Promocional {
    boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontede10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}
