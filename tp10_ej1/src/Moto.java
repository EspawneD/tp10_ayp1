public class Moto extends Vehiculo {
	private final int cilindrada;

	public Moto(String patente, double motor, String color, String marca, int velMax, int cantRuedas, int cilindrada) {
		super(patente, motor, color, marca, velMax, cantRuedas);
		this.cilindrada = cilindrada;
	}
	@Override
	public String descripcion(){
		return super.descripcion() + "\nCilindrada: " + cilindrada;
	}
}

