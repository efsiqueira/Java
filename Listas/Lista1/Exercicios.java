public class Exercicios {
    public static void main(String[] args) {
        
        //Exercício 1
        
        System.out.println("Ex.: 1");
        
        int nota1 = 10;
        int nota2 = 10;
        int nota3 = 10;
        int media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println(media);
        
        //Exercício 2
        
        System.out.println("\n");
        System.out.println("Ex.: 2");

        int lado1 = 10;
        int lado2 = 15;
        int area = lado1 * lado2;
        
        System.out.println(area);
        
        //Exercício 3
        
        System.out.println("\n");
        System.out.println("Ex.: 3");
        
        int largura = 10;
        int altura = 15;
        int profundidade = 5;
        int volume = largura * altura * profundidade;
        
        System.out.println(volume);
        
        //Exercício 4
        
        System.out.println("\n");
        System.out.println("Ex.: 4");
        
        int valor1 = 40;
        int valor2 = 20;
        String dobro = valor1 >= (valor2 * 2) ? ">= Dobro" : "< Dobro";
        
        System.out.println(dobro);
        
        //Exercício 5
        
        System.out.println("\n");
        System.out.println("Ex.: 5");
        
        int a = 1;
        int b = 0;
        int c = -4;
        int delta = (b * b) - (4 * a * c);
        double x = (-b + Math.sqrt(delta)) / (2 * a);
        double xL = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.println(x);
        System.out.println(xL);
        
        //Exercício 6
        
        System.out.println("\n");
        System.out.println("Ex.: 6");
        
        double distancia = 100.0;
        double tempo = 2.5;
        double velMedia = distancia/tempo;
        
        System.out.println(velMedia);
        
        //Exercício 7
        
        System.out.println("\n");
        System.out.println("Ex.: 7");
        
        double faturamento = 2000.0;
        int qtdImposto = 10;
        double impostoPago = faturamento/qtdImposto;
        
        System.out.println(impostoPago);
        
        //Exercício 8
        
        System.out.println("\n");
        System.out.println("Ex.: 8");
        
        int numero = 2;
        String msg = (numero % 2) == 0 ? "Par" : "Ímpar";
        
        System.out.println(msg);
        
        //Exercício 9
        
        System.out.println("\n");
        System.out.println("Exercício 9 está repetido");
        
        //Exercício 10
        
        System.out.println("\n");
        System.out.println("Ex.: 10");
        
        String str = new String ("11 ");
        String str2 = new String ("11");
        boolean compStr = str.equals(str2);
        
        System.out.println(compStr);
        
        //Exercício 11
        
        System.out.println("\n");
        System.out.println("Ex.: 11");
        
        String var1 = "2.1";
        int var2 = (int) Double.parseDouble(var1);
        System.out.println(var2);
        
        //Exercício 12
        
        System.out.println("\n");
        System.out.println("Ex.: 12");
        
        double salario = 10000;
        String aliquota = salario <= 1903.98 ? "Isento" : 
            salario <= 2826.65 ? "7.5%" : 
            salario <= 3751.05 ? "15%" : 
            salario <= 4664.68 ? "22.5%" : "27.5%";
        
        System.out.println(aliquota);
        
        //DESAFIO
        
        System.out.println("\n");
        System.out.println("DESAFIO");
        
        int num = 858;
        int contPrimo = 0;
        
        for (int i = 2; i < num; i++) {
            
            if (num % i == 0) {
                contPrimo++;
            }
        }
        
        if (contPrimo > 0) {
            System.out.println("Não é primo");
        }
        else {
            System.out.println("É primo");
        }
        
    }
}