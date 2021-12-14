import java.io.BufferedReader;
import java.io.FileReader;

public class ex8 {
    public static void main(String[] args) {
        System.out.println("Eduardo Siqueira");
        try {
            BufferedReader ler = new BufferedReader(new FileReader("./Exerc08.txt"));
            String value = "";
            
            while ((value = ler.readLine()) != null) {
                System.out.println(value.substring(0, 10));
            }
            ler.close();
        } catch (Exception exception) {
            System.out.println("Erro de execução: " + exception.getMessage());
        }
    }
}