import java.util.Scanner;
import java.io.*;

public class ex4 {
    public static void main (String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Eduardo Siqueira");

        int a = 0, b = 0;

        System.out.println("Digite o valor: ");
        a = leitura.nextInt();
        System.out.println("Digite o expoente: ");
        b = leitura.nextInt();

        double resultado = Math.pow(a, b);

        System.out.println("\nO número: " + a + " elevado ao expoente: " + b + " é igual a = " + resultado);
        leitura.close();

    }
}