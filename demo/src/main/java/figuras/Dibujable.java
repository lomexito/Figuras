package figuras;

public interface Dibujable {
    void dibujar();

    default void dibujarBordes(){
        System.out.println("Aqui dibuja con bordes");
    }
}