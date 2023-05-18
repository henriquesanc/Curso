
package cursoatividade5;

import java.util.Scanner;


public class NumerosInteiros {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		System.out.println("Informe dois n�meros inteiros positivos: ");
		int numero1 = input.nextInt();
		int numero2 = input.nextInt();

		if (numero1 < numero2 && numero1 > 0 && numero2 > 0) {
			soma = numero1 + 1;
			System.out.println("Os n�meros inteiros entre " + numero1 + " e " + numero2 + " s�o: ");
			for (; soma < numero2; soma++) {
				System.out.println(soma);
			}
		} else if (numero1 > numero2 && numero1 > 0 && numero2 > 0) {
			soma = numero2 + 1;
			System.out.println("Os n�meros inteiros entre " + numero2 + " e " + numero1 + " s�o: ");
			for (; soma < numero1; soma++) {
				System.out.println(soma);
			}
		} else if (numero1 == numero2 && numero1 > 0 && numero2 > 0) {
			System.out.println("Os n�meros informados s�o iguais");
		} else {
			if (numero1 <= 0 && numero2 > 0) {
				System.out.println(numero1 + " � um n�mero inv�lido");
			} else if (numero1 <= 0 && numero2 <= 0) {
				System.out.println(numero1 + " e " + numero2 + " s�o n�meros inv�lidos");
			} else {
				System.out.println(numero2 + " � um n�mero inv�lido");
			}
		}

	}
}
