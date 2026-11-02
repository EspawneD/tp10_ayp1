public class Main {
	
	public static void main (String[] args) {
		Vehiculo v1 = new Auto("UGG 657", 1.4,"Rojo", "Fiat", 170, 4, 5);
		System.out.println(v1.descripcion());
		Vehiculo v2 = new Moto("GGF 676", 250,"Negro", "Suzuki", 210, 2, 250);
		System.out.println(v2.descripcion());
	}
}

