import java.io.*;

public class ex2 {
    public static void main (String[] args) {
        System.out.println("Eduardo Siqueira");
        try {
            BufferedReader ler = new BufferedReader(new FileReader("./Exerc02.txt"));
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