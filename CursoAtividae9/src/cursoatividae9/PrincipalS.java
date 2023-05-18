
package cursoatividae9;

import java.util.Scanner;


public class PrincipalS {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double vetor[] = new double[11];
		String confirma;

		System.out.println("Informe 10 n�meros: ");

		for (int i = 0; i < vetor.length - 1; i++) {
			vetor[i] = input.nextDouble();
		}
		do {
			System.out.println("Informe o valor a ser procurado: ");
			double v = input.nextDouble();
			System.out.println("Selecione o tipo de busca: ");
			System.out.println("1 - Sequ�ncial");
			System.out.println("2 - Sequ�ncial com sentinela");
			int opcao = input.nextInt();

			switch (opcao) {
			default:
				System.out.println("Op��o inv�lida.");
			}

			System.out.println("Gostaria de continuar? (Sim ou N�o)");
			confirma = input.next();

		} while (confirma.equalsIgnoreCase("Sim") || confirma.equalsIgnoreCase("S"));

		System.exit(0);
	}
}
