
package cursoatividae9;


public class BuscaSequencial {
    public static int buscaSequencial(double vetor[], double v) {
		int comparacao = 0;
		for (int i = 0; i < vetor.length - 1; i++) {
			comparacao++;
			if (vetor[i] == v) {
				System.out.println("O valor foi encontrado na posicao: " + i + "\n" + "Foram realizadas " + comparacao + " compara��es");
				return i;
			}
		}
		System.out.println("O valor n�o foi encontrado.");
		return -1;
	}

	public static int buscaSequencialSentinela(double vetor[], double v) {
		vetor[vetor.length - 1] = v; //sentinela
		int comparacao = 0;
		for (int i = 0; i < vetor.length; i++) {
			comparacao++;
			if (vetor[i] == v) {
				if (i == vetor.length - 1) { 
					System.out.println("O valor foi encontrado na sentinela." + "\n" + "Foram realizadas " + comparacao + " compara��es");
				} else {
					System.out.println("O valor foi encontrado na posi��o: " + i+ "\n" + "Foram realizadas " + comparacao + " compara��es");
				}
				return i;
			}
		}
		System.out.println("O valor n�o foi encontrado.");
		return -1;
	}
}
