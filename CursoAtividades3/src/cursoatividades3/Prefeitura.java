
package cursoatividades3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Prefeitura {
    public static void main(String[] args) {
		String entrada;
		DecimalFormat df = new DecimalFormat("0.00");
		
		double somasalario = 0;
		double somafilhos = 0;
		double qntpessoa = 0;
		
		do {
		entrada = JOptionPane.showInputDialog("Informe o sal�rio: ");
		double salario = Double.parseDouble(entrada);
		
		while (salario >= 0) {
			qntpessoa++;
			entrada = JOptionPane.showInputDialog("Informe a quantidade de filhos: ");
			int filhos = Integer.parseInt(entrada);
			
			somafilhos += filhos;
			somasalario += salario;
			
			entrada = JOptionPane.showInputDialog("Informe o sal�rio: ");
			salario = Double.parseDouble(entrada);
		}
		int resp = JOptionPane.showConfirmDialog(null, "A m�dia sal�rial da popula��o �: " + df.format(somasalario / qntpessoa) + "\n" + 
		"A m�dia do n�mero de filhos �: " + df.format(somafilhos / qntpessoa) + "\n" + "\n" + "Deseja continuar?");
		if (resp == JOptionPane.YES_OPTION)
			entrada = "sim";
		else if (resp == JOptionPane.NO_OPTION)
			entrada = "n�o";
		
		} while (entrada.equalsIgnoreCase("sim"));
    	System.exit(0);
	}
}
