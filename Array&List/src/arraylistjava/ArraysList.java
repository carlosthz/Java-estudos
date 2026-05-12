package arraylistjava;
import java.util.*;

public class ArraysList {
	
	public static int lerInt(Scanner input, String mensagem) { // testa se o input é válido, para não quebrar o código

	    while (true) {

	        System.out.print(mensagem);

	        if (input.hasNextInt()) { // testa se existe um inteiro válido e retorna ele
	            return input.nextInt(); 
	        } else {
	            System.out.println("❌ Entrada inválida! Digite um número inteiro.");
	            input.next(); // limpa o lixo
	        }
	    }
	}
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>(); // declara lista de Arrays
		double media;
		int par = 0;
		int soma = 0;
		int i = 0;
		int j = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha a posição do vetor e um valor | Insira um número negativo em qualquer um para encerrar:\n");
		
		while (true) // loop infinito até a inserção de negativos
		{

			 i = lerInt(input, "Digite a posição: ");
			 j = lerInt(input, "Digite o valor: ");
			if(i<0 || j<0) { break;}
		
		 while (numeros.size()<=i)
		 {
			 numeros.add(0);
		 } 
			numeros.set(i, j);
			System.out.println(j + " Na posição: " + i);
			soma += j;
			if(j%2==0) { par++; }
		}
		if (numeros.size() == 0) {
		    System.out.println("Nenhum valor foi inserido."); // impede erro se inserir negativo na primeira execução
		    input.close();
		    return;
		}
			int maior = numeros.get(0);
			int menor = numeros.get(0);
			
			for(int k = 0; k<numeros.size(); k++)
			{
			maior = Math.max(maior, numeros.get(k));
			menor = Math.min(menor, numeros.get(k));
			}
			
			media = (double)soma/numeros.size();
		System.out.println("\nO vetor possui " + numeros.size() + " elementos");
		System.out.println("A soma total é: " + soma);
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		System.out.println("A média é: " + media);
		System.out.println("Total de pares: " + par);
	}
}

