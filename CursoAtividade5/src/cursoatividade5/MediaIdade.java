
package cursoatividade5;

import java.util.Scanner;


public class MediaIdade {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = 0;
		int soma = 0;
		int contador = 0;

		System.out.println("Informe as idades (Digite um n�mero negativo para sair)");
		for (;;) {
			idade = input.nextInt();
			if (idade < 0) {
				break;
			} else {
				soma += idade;
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("N�o foram informadas idades validas");
		} else {
			double media = (soma / contador);
			System.out.println("A media das idades �: " + media);
		}
	}
}
