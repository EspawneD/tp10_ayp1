public class Auto extends Vehiculo{
	private final int cantPuertas;

	public Auto(String patente, double motor, String color, String marca, int velMax, int cantRuedas, int cantPuertas) {
		super(patente, motor, color, marca, velMax, cantRuedas);
		this.cantPuertas = cantPuertas;
	}
	@Override
	public String descripcion(){
		return super.descripcion() + "\nCantidad de puertas: " + cantPuertas;
	}
}

