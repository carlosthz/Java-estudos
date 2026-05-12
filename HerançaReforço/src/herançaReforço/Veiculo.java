package herançaReforço;

public class Veiculo {
	private String marca;
	private int ano;
	private double vMax;
	
	public Veiculo(String marca, int ano, double vMax) {
		this.marca = marca;
		this.ano = ano;
		this.vMax = vMax;
	}
	
	public String getMarca() {return marca;}
	public int getAno() {return ano;}
	public double getvMax() {return vMax;}
	
	public void setMarca(String marca) {this.marca = marca;}
	public void setAno(int ano) {this.ano = ano;}
	public void setvMax(double vMax) {this.vMax = vMax;}
	
	public void mover() {
		System.out.println("O veículo está se movendo...");
	}
	
}
