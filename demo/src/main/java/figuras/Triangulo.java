package figuras;
public class Triangulo extends Figura{

    double base, altura;

    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base =  base;
        this.altura = altura;
    }

    @Override 
    public double calcularArea (){
        double area = base * altura/2;
        return area;
    }
    
    @Override 
    public double calcularPerimetro (){
        double lado = Math.sqrt(Math.pow(altura,2)+ Math.pow(base/2,2));
        double perimetro = Math.pow(lado,3);
        return perimetro;
    }

    @Override 
    public void dibujar(){
        System.out.println("△");
    }

}