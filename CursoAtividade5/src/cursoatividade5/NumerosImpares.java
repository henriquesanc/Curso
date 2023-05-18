
package cursoatividade5;

import javax.swing.JOptionPane;


public class NumerosImpares {
    public static void main(String[] args) {

		String entradanumero = JOptionPane.showInputDialog("Informe um n�mero");
		int numero = Integer.parseInt(entradanumero);

		String mensagem = "Os n�meros �mpares entre 1 e " + numero + " s�o: ";
		for (int impares = 1; impares <= numero; impares++) {
			if (impares % 2 != 0) {
				mensagem += impares + " ";
			}
		}

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
