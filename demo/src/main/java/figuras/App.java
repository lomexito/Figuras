package figuras;
 
import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(10));
        figuras.add(new Triangulo(3,2));
        figuras.add(new Rectangulo(4, 5));
        figuras.add(new Cuadrado(3));

        System.out.println("El area del " + figuras.get(0).getNombre() +  " es "  + figuras.get(0).calcularArea() );
        System.out.println("El area del " + figuras.get(1).getNombre() +  " es "  + figuras.get(1).calcularArea() );
        System.out.println("El area del " + figuras.get(2).getNombre() + " es " + figuras.get(2).calcularArea());
        System.out.println("El area del " + figuras.get(3).getNombre() + " es " + figuras.get(3).calcularArea());

        figuras.get(0).dibujar();
        figuras.get(1).dibujar();
        figuras.get(2).dibujar();
        figuras.get(3).dibujar();
    }
}