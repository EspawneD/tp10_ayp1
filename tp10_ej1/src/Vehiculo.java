public class Vehiculo {
	private String patente;
	private double motor;
	private String color;
	private String marca;
	private int velMax;
	private int cantRuedas;
	public Vehiculo(String patente, double motor, String color, String marca, int velMax, int cantRuedas){
		this.patente = patente;
		this.motor = motor;
		this.color = color;
		this.marca = marca;
		this.velMax = velMax;
		this.cantRuedas = cantRuedas;
	}
	public String descripcion(){
		return "Marca: " + this.marca + " " + " "
		}
}

