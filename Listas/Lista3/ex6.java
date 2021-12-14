import java.util.Scanner;

public class ex6 {
    public static void main (String[] args) {
        System.out.println("Eduardo Siqueira");
        Scanner ler = new Scanner(System.in);
        
        try {
            double raio = 0.0, circun = 0.0, area = 0.0;

            System.out.println("Informe o raio: ");
            raio = ler.nextDouble();

            circun = 2* (Math.PI) * raio;
            area = Math.PI*(raio * raio);

            System.out.println("\nRaio: " + raio + "\nCircunferência: " + circun + "\nÁrea: " + area);
        } catch (Exception e) {
            System.out.println("Erro de execução: " + e.getMessage());
        }
        
        ler.close();
    }
}
