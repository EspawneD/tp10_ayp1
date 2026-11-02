public class Gerente extends Empleado{
    private final double bono;
    public Gerente(String nombre, double sueldo, double bono){
        super(nombre, sueldo);
        this.bono = bono;

    }
    @Override
    public double calcularSueldo() {
        return getSueldo() + bono;
    }
}
