
public class Retangulo extends Forma implements Desenhavel {
	private double largura, altura;
	
	public Retangulo(String cor, double largura, double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}
	 public double getLargura() {return largura;}
	 public double getAltura() {return altura;}
	 public void setLargura(double largura) {this.largura = largura;}
	 public void setAltura(double altura) {this.altura = altura;}
	 
	 @Override
	 public double calcularArea() { return largura*altura;}
	 public void desenhar() { System.out.println("Desenhando um retangulo\n"); }
}
