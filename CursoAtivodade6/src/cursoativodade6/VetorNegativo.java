
package cursoativodade6;

import java.util.Scanner;


public class VetorNegativo {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numeros[] = new double[10];

		System.out.println("Digite 10 n�meros:");

		for (int c = 0; c < numeros.length; c++) {
			numeros[c] = input.nextDouble();
		}

		System.out.print("Os n�meros digitados foram: ");
		for (int c = 0; c < numeros.length; c++) {
			System.out.print(numeros[c] + " ");
		}

		System.out.print("\n" + "As posi��es do vetor que armazenam n�meros negativos s�o: ");
		for (int c = 0; c < numeros.length; c++) {
			if (numeros[c] < 0) {
				System.out.print(c + " ");
			}

		}
	}
}
