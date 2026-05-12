package pessoajava;
import java.util.*;
// classe Pessoa
public class Pessoa {
	private String nome;
	private int idade;
	private String email;
	
	//Construtor
	public Pessoa (String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
}
	//getters
	public String getNome() {return nome;}
	public int getIdade() {return idade;}
	public String getEmail() {return email;}
	
	//Setters
	public void setNome(String nome) {
		this.nome = nome;		
	}
	public void setIdade(int idade) {
		if(idade>=0) {
			this.idade =idade;
		}
	}
	public void setEmail(String email) {
		if(email.contains("@")){
			this.email = email;
		}
	}
	

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		//Declara o objeto pessoa com construtor
		Pessoa p = new Pessoa ("?", 0,"?");
		
	
	//testando getters
	System.out.println("Nome: " + p.getNome());
	System.out.println("Idade: " + p.getIdade());
	System.out.println("Email: " + p.getEmail());
	
	//testando setters
	System.out.println("Insira o novo nome: ");
	p.setNome(input.nextLine());
	System.out.println("\nInsita a nova Idade: ");
	p.setIdade(input.nextInt());
	input.nextLine(); // limpa o buffer pro email no ser escrito como "\n"
	System.out.println("Insira o novo Email: ");
	p.setEmail(input.nextLine());
	
	System.out.println("\n Pós Alterações: ");
	System.out.println("Nome: " + p.getNome());
	System.out.println("Idade: " + p.getIdade()); 
	System.out.println("Email : " + p.getEmail()); 
	}
}