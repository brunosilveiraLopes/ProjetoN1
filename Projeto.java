
import java.util.Scanner;

public class Projeto {
	public static void main(String[] args) {
		
		int jogador,computador;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("---------------");
		System.out.println("Escolha uma das opções: ");
		System.out.println(" (1)- Pedra");
		System.out.println(" (2)- Papel");
		System.out.println(" (3)- Tesoura ");
		System.out.println("----------------");
		
		jogador = teclado.nextInt();
		switch(jogador) {
		case 1:
			System.out.println("Jogador (Bruno) escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador (Bruno) escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador (Bruno) escolheu TESOURA");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		teclado.close();
		computador = (int)(Math.random()*3 + 1);
		switch(computador) {
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
			}
		
		System.out.println("");
		if (jogador == computador) {
			System.out.println("======EMPATE!!!======");
		} else {
			if((jogador == 1 && computador == 3) ||(jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
				System.out.println("=====Jogador(Bruno) VENCEU!!!======");
			} else {
				System.out.println("=====Computador VENCEU!!!======");
			}
		}
	}
}
