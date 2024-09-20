/*
    Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
    Qual é o valor da variável SOMA após a execução do codigo.
*/

public class CalculoSoma { // Função principal do programa.
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1; // Declaração das variáveis dadas no enunciado.
        while (K < INDICE) { // Laço de repetição para calcular a soma dos números.
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println(SOMA); // Exibe o valor da variável SOMA.
    }
}