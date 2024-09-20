/*Algoritmo para analisar a sequencia de fibonacci e verificar se o numero digitado pelo usuario pertence ou não a sequencia */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) { // Função principal do programa.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt(); // Recebe o número digitado pelo usuário.
        int a = 0;
        int b = 1;
        int c = 0;
        boolean pertence = false;
        while (c <= numero) { // Laço de repetição para calcular a sequência de Fibonacci.
            if (c == numero) {
                pertence = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        } 
        if (pertence) { // Verifica se o número pertence a sequência de Fibonacci e exibe a mensagem correspondente.
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }

        sc.close();
    }
}
