/*ALgoritmo para verificar uma string a exixtencia da letra 'a' maiuscula ou minuscula e quantas vezes ela aparece */

import java.util.Scanner;

public class testeString {
    public static void main(String[] args) { // Função principal do programa.
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra/frase: ");
        String palavra = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) { // Laço de repetição para percorrer a palavra/frase.
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na palavra " + palavra + ".");
        } else {
            System.out.println("A letra 'a' nao aparece na palavra " + palavra + ".");
        }

        sc.close();
    }
}