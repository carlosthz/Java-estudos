package herançaReforço;

public class Carro extends Veiculo {
	
	private int ndp;
	
	public Carro (String marca, int ano, double vMax, int ndp) {
		super(marca,ano,vMax);
		this.ndp = ndp;
	}
	public int getNDP() {return ndp;}
	
	public void setNDP(int ndp){ this.ndp = ndp;}
	
	public void	exibirInfo(){
		System.out.println("=== CARRO ===");
		System.out.println("Marca: " + getMarca());
		System.out.println("Ano: " + getAno());
		System.out.println("V Max: " + getvMax());
		System.out.println("Numero de PORRAS: " + ndp);
	}
	
	@Override
	public void mover() {
	System.out.println("\nO carro está acelerando na pista");
	}
}

