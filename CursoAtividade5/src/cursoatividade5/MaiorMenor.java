
package cursoatividade5;

import java.util.Scanner;


public class MaiorMenor {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;
		int numero = 0;

		System.out.println("Informe os n�meros (Digite uma letra para sair)");

		for (;;) {
			if (input.hasNextInt()) {
				numero = input.nextInt();
				if (numero >= maiorNumero) {
					maiorNumero = numero;
				}
				if (numero < menorNumero) {
					menorNumero = numero;
				}
			} else {
				break;
			}
		}

		System.out.println("O menor n�mero �: " + menorNumero + "\n" + "O maior n�mero �: " + maiorNumero);
	}
}
