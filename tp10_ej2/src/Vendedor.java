public class Vendedor extends Empleado {
    private final double comision;
    private double ventas;
    public Vendedor(String nombre, double sueldo, double comision, double ventas){
        super(nombre, sueldo);
        this.comision = comision;
        this.ventas = ventas;
    }
    @Override
    public double calcularSueldo(){
        return (getSueldo() + (ventas * comision / 100) );
    }
}
