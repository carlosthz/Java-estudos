package herançaReforço;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Carro a = new Carro("KallZ", 3500, 1000.00, 30);
		Moto b = new Moto ("ZllaK", 7000, 2000.00, true);
		a.exibirInfo();
		System.out.println();
		b.exibirInfo();
		
		List<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(a);
		veiculos.add(b);
		for(Veiculo v : veiculos) {
			v.mover();
		}
	}

}
