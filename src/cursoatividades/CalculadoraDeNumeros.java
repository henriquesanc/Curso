
package cursoatividades;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculadoraDeNumeros {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String confirma;
		
		do {
		System.out.println("Digite dois n�meros inteiros quaisquer: ");
		double numero1 = input.nextDouble();
		double numero2 = input.nextDouble();
		
		System.out.println("Escolha uma opera��o: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Multiplica��o");
		System.out.println("3 - Subtra��o");
		System.out.println("4 - Divis�o");
		int operacao = input.nextInt();
		
		switch (operacao) {
			case 1:
				System.out.println("A soma dos n�meros �: " + df.format(numero1 + numero2));
				break;
			case 2:
				System.out.println("A multiplica��o dos n�meros �: " + df.format(numero1 * numero2));
				break;
			case 3:
				System.out.println("A subtra��o dos n�meros �: " + df.format(numero1 - numero2));
				break;
			case 4:
				if (numero1 == 0 || numero2 == 0) {
					System.out.println("A divis�o � invalida");
					return;
				}
				else {
					System.out.println("A divis�o dos n�meros �: " + df.format(numero1 / numero2));	
				}
				break;
			default:
				System.out.println("C�digo inv�lido");
                break;
		
		}
		System.out.println("Gostaria de realizar outra opera��o? (Sim ou N�o)");
		confirma = input.next();
		
	} while (confirma.equalsIgnoreCase("Sim") || confirma.equalsIgnoreCase("S"));
	System.exit(0);
	}
}
