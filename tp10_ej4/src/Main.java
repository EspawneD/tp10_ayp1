public class Main {
    public static void main(String[] args) {
        Volador[] ovnis = new Volador[2];
        ovnis[0] = new Avion();
        ovnis[1] = new Pajaro();

        for (Volador ovni : ovnis) {
            ovni.volar();
        }
    }
}