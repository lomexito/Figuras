package figuras;

public abstract class Figura implements Dibujable{
    protected String nombre;

    public Figura (String nombre){
        this.nombre =  nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public String getNombre(){
        return nombre;
        
    }
}