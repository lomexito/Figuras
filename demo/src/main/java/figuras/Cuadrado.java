package figuras;

public class Cuadrado extends Figura{

    double lado;

    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        double area = Math.pow(lado, 2);
        return area;
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = 4 * lado;
        return perimetro;
    }

    @Override
    public void dibujar(){
        System.out.println("□");
    }

}