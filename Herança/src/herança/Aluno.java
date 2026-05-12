package herança;

public class Aluno extends Pessoa{ //Classe Aluno com Herança Pessoa
	private String matricula;
	private String curso;
	
	public Aluno (String nome, int idade, String email, String matricula, String curso) { //Construtor Aluno com SUPER herança
		super(nome,idade,email);
		this.matricula = matricula;
		this.curso = curso;
	}
	//getters Aluno
	public String getMatricula() {return matricula;}
	public String getCurso() {return curso;}
	
	//setters Aluno
	public void setMatricula(String matricula) {this.matricula = matricula;}
	public void setCurso(String curso) {this.curso = curso;}
	
	public void exibirInfo() {
		System.out.println("=== Aluno ===");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Email: " + getEmail());
		System.out.println("Matrícula: " + matricula);
		System.out.println("Curso: " + curso);
	}
}