public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Gerente("Pepe", 1000, 200);
        empleados[1] = new Vendedor("Jorge", 700, 20, 340.5);
        empleados[2] = new Vendedor("Carlitos", 500, 30, 1667.33);
        Empresa emp1 = new Empresa("Carrefour", empleados);

        System.out.printf("Total de sueldos de empresa %s: %.2f%n", emp1.getNombre(), emp1.calcularTotalSueldos());
    }
}