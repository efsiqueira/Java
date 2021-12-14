public class ex9 {
    public static void main (String[] args) {
        System.out.println("Eduardo Siqueira");
        try {
            int value1 = Integer.parseInt(args[0]);
            int value2 = Integer.parseInt(args[1]);
            System.out.println("Eduardo Siqueira");
            System.out.println("A área dos valores é: " + (value1 * value2));

        } catch (Exception e) {
            System.out.println("Erro de execução: " + e.getMessage());
        }

    }
}
