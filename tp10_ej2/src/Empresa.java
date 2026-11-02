public class Empresa {
    private final String nombre;
    private Empleado[] empleados;

    public String getNombre() {
        return nombre;
    }

    public Empresa(String nombre, Empleado[] empleados){
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public double calcularTotalSueldos(){
        double totalSueldos = 0;
        for (int i = 0; i < empleados.length; i++) {
            totalSueldos += empleados[i].calcularSueldo();
        }
        return totalSueldos;
    }
}
