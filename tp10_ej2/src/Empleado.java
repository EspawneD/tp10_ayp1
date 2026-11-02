public abstract class Empleado {
    private final String nombre;
    private double sueldo;
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSueldo();
}
