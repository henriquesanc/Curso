
package cursoatividade5;

import javax.swing.JOptionPane;


public class IdadeSexo {
    public static void main(String[] args) {
		int contador = 1;
		int contadorSexoIdade = 0;

		for (; contador <= 10; contador++) {
			String entradaidade = JOptionPane.showInputDialog("Informe a idade da " + contador + "� pessoa: ");
			int idade = Integer.parseInt(entradaidade);
			while (idade < 0) {
				JOptionPane.showMessageDialog(null, "Idade inv�lida, digite novamente: ");
				entradaidade = JOptionPane.showInputDialog("Informe a idade da " + contador + "� pessoa: ");
				idade = Integer.parseInt(entradaidade);
			}

			String sexo = JOptionPane.showInputDialog("Informe o sexo (f ou m) da " + contador + "� pessoa: ");
			while (sexo.equalsIgnoreCase("f") == false && sexo.equalsIgnoreCase("m") == false) {
				JOptionPane.showMessageDialog(null, "Sexo inv�lido, digite novamente: ");
				sexo = JOptionPane.showInputDialog("Informe o sexo (f ou m): ");
			}

			if (idade >= 20 && idade <= 40 && sexo.equalsIgnoreCase("f")) {
				contadorSexoIdade++;

			}
		}

		JOptionPane.showMessageDialog(null, "A quantidade de pessoas do sexo feminino que tem entre 20 e 40 anos � de: ");

	}
}
