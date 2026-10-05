package figuras;

class Circulo extends Figura{

    double radio;

    public Circulo( double radio) {
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area;

        area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {

        double perimetro;
        perimetro = 2 * Math.PI * radio;

        return perimetro;
    }

    @Override 
    public void dibujar(){
        System.out.println("o");
    }

}