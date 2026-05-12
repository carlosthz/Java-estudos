public class Main {

	public static void main(String[] args) {
		Forma f1 = new Circulo ("Vermelho", 5.0);
		Forma f2 = new Retangulo("Azul", 4.0, 6.0);
		f1.exibirCor();
		System.out.println("Área circulo: " + f1.calcularArea());
		((Desenhavel)f1).desenhar();
		System.out.println("Área Retângulo: " + f2.calcularArea());
		((Desenhavel)f2).desenhar();

	}

}
