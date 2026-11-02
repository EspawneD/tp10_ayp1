public class Main {
    public static void main(String[] args) {
    Figura[] figuras = new Figura[3];
    figuras[0] = new Circulo(4.56);
    figuras[1] = new Cuadrado(8);
    figuras[2] = new Rectangulo(2.2,4.7);

        for (int i = 0; i < figuras.length; i++) {
            System.out.printf("Figura %d: %s%nArea: %.2f%n", i + 1, figuras[i].nombreFigura(), figuras[i].calcularArea());
        }
    }
}