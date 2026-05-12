package herança;

public class Professor extends Pessoa{
	private String departamento;
	private double salario;
	
	public Professor(String nome, int idade, String email, String departamento, double salario) {
		super(nome,idade,email);
		this.departamento = departamento;
		this.salario = salario;
		
	}
	//getters
	public String getDepartamento() {return departamento;}
	public double getSalario() {return salario;}
	
	//setters
	
	public void setDepartamento(String departamento) {this.departamento = departamento;}
	public void setSalario(Double salario) {this.salario = salario;}
	
	public void exibirInfo() {
		System.out.println("=== Professor ===");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Email: " + getEmail());
		System.out.println("Departamento: " + departamento);
		System.out.println("Salario: " + salario);
	}
	
}