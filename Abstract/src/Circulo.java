
public class Circulo extends Forma implements Desenhavel {
	
	private double raio;
	Circulo (String cor, double raio){
		super(cor);
		this.raio = raio;
	}
	public double getRaio() {return raio;}
	public void setRaio(double raio) {if (raio>=0) this.raio = raio;}
	
	@Override
	public double calcularArea() { return Math.PI*raio*raio; }
	public void desenhar() { System.out.println("Desenhando um círculo...\n"); }
}


