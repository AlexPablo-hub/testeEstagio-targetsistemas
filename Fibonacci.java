import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        boolean pertence = false;
        while (c <= numero) {
            if (c == numero) {
                pertence = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }
        if (pertence) {
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }

        sc.close();
    }
}
