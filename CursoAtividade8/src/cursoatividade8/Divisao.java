
package cursoatividade8;

public class Divisao {

		public int numerador;
		public int denominador;
		
		public Divisao(int numerador, int denominador) {
			
			if (denominador == 0 || denominador > numerador) {
				throw new ArithmeticException("N�meros inv�lidos");
			}
			else if (numerador < 0) {
				throw new ArithmeticException("Numerador menor do que zero");
			}
			
			this.numerador = numerador;
			this.denominador = denominador;
		}
		public double operacao() {
			return (numerador / denominador);
		}

}