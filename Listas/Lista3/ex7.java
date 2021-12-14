import java.io.BufferedReader;
import java.io.FileReader;

public class ex7 {
    public static void main (String[] args) {
        System.out.println("Eduardo Siqueira");
        try {
            BufferedReader leitura = new BufferedReader(new FileReader("./Exerc07.txt"));
            String value = "";
            do {
                if (value != null && value.equalsIgnoreCase("JAVA")) {
                    System.out.println("Existe JAVA");
                    break;
                }
        
            }while ((value = leitura.readLine()) != null);
            if (value == null) {
                System.out.println("Não existe JAVA");
            }
        } catch (Exception e) {
            System.out.println("Erro de execução: " + e.getMessage());
            }
    }
}