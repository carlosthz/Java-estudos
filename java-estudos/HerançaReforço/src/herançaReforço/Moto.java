package herançaReforço;

public class Moto extends Veiculo{
		private boolean tsc;
		
		public Moto(String marca, int ano, double vMax, boolean tsc) {
			super(marca,ano,vMax);
			this.tsc = tsc;
		}
		public boolean gettsc() {return tsc;}
		public void settsc(boolean tsc) {this.tsc = tsc;}
		
		public void exibirInfo() {
			System.out.println("=== MOTO ===");
			System.out.println("Marca: " + getMarca());
			System.out.println("Ano: " + getAno());
			System.out.println("vMax: " + getvMax());
			System.out.println("TSC: " + tsc);
		}
		@Override
		public void mover() {
			System.out.println("A moto está ziguezagueando...");
		}
}
