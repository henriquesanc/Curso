
package cursoatividae9;


public class BuscaBinaria {

    public static int buscaBinaria(double vetor[], double v) {
        int esquerda = 0;
        int direita = vetor.length - 1;
        int comparacao = 0;

        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;
            comparacao++;

            if (vetor[meio] == v) {
                System.out.println("O valor foi encontrado na posi��o: " + meio + "\n" + "Foram realizadas " + comparacao + " compara��es");
                return meio;
            } else if (vetor[meio] < v) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        System.out.println("O valor n�o foi encontrado.");
        return -1;
    }
    }
    

