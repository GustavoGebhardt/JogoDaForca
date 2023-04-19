package codigo;

import java.util.Random;
import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner leitor = new Scanner (System.in);
		
		String[] banco = {"luz", "telefone", "arvore", "salario", "computador", "caneta"};
		
		String palavra = banco[r.nextInt(banco.length)];
		//System.out.println(palavra);
		
		char resposta;
		
		int val1 = 0;
		int val2 = 0;
		int val3 = 0;
		
		System.out.println("Se voce digitar mais que uma letra so sera conciderada a primeira!");
		System.out.print("Palavra: ");
		for(int y = 0; y < palavra.length(); y++) {
			System.out.print("_ ");
		}
		System.out.println();
		
		char[] feitas = new char [palavra.length()];
		for(int w = 0; w < feitas.length; w++) {
			feitas[w] = '_';
		}
		
		for(int i = 0; i < 10000000; i++) {
			System.out.print("Digite a " + (i+1) + " tentativa: ");
			resposta = leitor.next().charAt(0);
			for(int x = 0; x < palavra.length(); x++) {
				if(resposta == palavra.charAt(x)) {
					//System.out.print(resposta + " ");
					feitas[x] = resposta;
					val1++;
				}else {
					//System.out.print("_ ");
					val2++;
				}
				
			}
			if(val2 >= 1 && val1 == 0) {
				val3++;
				val2 = 0;
				val1 = 0;
			}
			
			for(int f = 0; f < feitas.length;f++) {
				System.out.print(feitas[f] + " ");
			}
			System.out.println();
			
			if(val3 >= 6) {
				System.out.println();
				System.out.println("Voce perdeu!");
				break;
			}
			if(val1 >= palavra.length()) {
				System.out.println();
				System.out.println("Parabens voce acertou!");
				System.out.println("A palavra era: " + palavra);
				break;
			}
		System.out.println();
		}
		
			
			
			
		}
		
		

}


