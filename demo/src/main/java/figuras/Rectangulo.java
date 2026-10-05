package figuras;

public class Rectangulo extends Figura{

    double base, altura;

    public Rectangulo(double base, double altura){
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = 2 * (base + altura);
        return perimetro;
    }

    @Override
    public void dibujar(){
        System.out.println("▭");
    }

}