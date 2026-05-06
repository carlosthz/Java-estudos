package herança;

public class Main {

	public static void main(String[] args) {
		Aluno a = new Aluno ("K", 31,"k@email.com","2026","SI");
		Professor p = new Professor ("Pr", 45, "p@email.com", "Java", 9000.00);
		a.exibirInfo();
		System.out.println();
		p.exibirInfo();

	}

}
