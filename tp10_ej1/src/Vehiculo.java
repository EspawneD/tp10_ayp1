public class Vehiculo {
	private final String patente;
	private final double motor;
	private final String color;
	private final String marca;
	private final int velMax;
	private final int cantRuedas;
	public Vehiculo(String patente, double motor, String color, String marca, int velMax, int cantRuedas){
		this.patente = patente;
		this.motor = motor;
		this.color = color;
		this.marca = marca;
		this.velMax = velMax;
		this.cantRuedas = cantRuedas;
	}
	public String descripcion(){
		return "Marca: " + this.marca + "\nMotor: " + this.motor + " " + "\nColor: " + this.color;
		}
}

