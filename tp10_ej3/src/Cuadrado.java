public class Cuadrado extends Figura{
    private double lado;
    public Cuadrado(double lado){
        super();
        this.lado = lado;

    }
    @Override
    public double calcularArea(){
        return lado * lado;
    }
    @Override
    public String nombreFigura(){
        return "Cuadrado";
    }
}
