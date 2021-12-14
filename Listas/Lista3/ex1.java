import java.util.Scanner;
import java.io.*;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Eduardo Siqueira");
        try {
            BufferedWriter criar = new BufferedWriter(new FileWriter("./Exerc01.txt"));

            int valorTabuada, i;
            System.out.println("Informe um número para calcular a tabuada: ");
            Scanner inpt = new Scanner(System.in);
            valorTabuada = inpt.nextInt();
            
            for(i = 0; i <= 10; i++) {
                System.out.println(valorTabuada + " * " + i + " = " + valorTabuada*i);
                criar.append(valorTabuada + " * " + i + " = " + valorTabuada*i + "\n"); //adicionar ao documento de texto
            }
            inpt.close();
            criar.close();

        } catch (Exception exception) {
            System.out.println("Erro de execução: " + exception.getMessage());
        }

        try {
            BufferedReader ler = new BufferedReader(new FileReader("./Exerc01.txt"));
            String value = "";
            while ((value = ler.readLine()) != null) {
                System.out.println(value);
            }
            ler.close();
        } catch (Exception exception) {
            System.out.println("Erro de execução: " + exception.getMessage());
        }

    }
    
}