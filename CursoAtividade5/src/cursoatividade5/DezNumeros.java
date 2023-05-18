
package cursoatividade5;

import java.util.Scanner;


public class DezNumeros {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;
		int numero = 0;
		int contador = 1;

		System.out.println("Informe dez n�meros");

		for (; contador <= 10; contador++) {
			if (input.hasNextInt()) {
				numero = input.nextInt();
				if (numero >= maiorNumero) {
					maiorNumero = numero;
				}
				if (numero < menorNumero) {
					menorNumero = numero;
				}
			} else {
				System.out.println("Car�cter inv�lido");
				System.exit(0);
			}
		}

		System.out.println("O menor n�mero �: " + menorNumero + "\n" + "O maior n�mero �: " + maiorNumero);
	}
}
