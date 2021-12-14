import java.util.Scanner;

public class SegundoExercicio {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        int menu = 0;
        
        do {
            System.out.println("Digite a opção: ");
            menu = scanner.nextInt();
            
            switch (menu) {
                case 0:
                    System.out.println("Sair?");
                    break;
                case 1:
                    System.out.println("Exercicio 1");
                    average();
                    break;
                case 2:
                    System.out.println("Exercicio 2");
                    numberToMonth();
                    break;
                case 3:
                    System.out.println("Exercicio 3");
                    forca();
                    break;
                case 4:
                    System.out.println("Exercicio 4");
                    tabuada();
                    break;
                case 5:
                    System.out.println("Exercicio 5");
                    torreString();
                    break;
                case 6:
                    System.out.println("Exercicio 6");
                    imparesMultSete();
                    break;
                case 7:
                    System.out.println("Exercicio 7");
                    notaNegativa();
                    break;
                case 8:
                    System.out.println("Exercicio 8");
                    fatorial();
                    break;
                case 9:
                    System.out.println("Exercicio 9");
                    imc();
                    break;
                case 10:
                    System.out.println("Exercicio 10");
                    operacoes();
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }

        }
        while (menu != 0);
        scanner.close();
    }
    public static void numberToMonth() {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe um número de 1 a 12: ");
        int numberToMonth = scanner.nextInt();
        String month = "";

        switch (numberToMonth) {
            case 1:
                month = "Janeiro";
                break;
            case 2:
                month = "Fevereiro";
                break;
            case 3:
                month = "Março";
                break;
            case 4:
                month = "Abril";
                break;
            case 5:
                month = "Maio";
                break;
            case 6:
                month = "Junho";
                break;
            case 7:
                month = "Julho";
                break;
            case 8:
                month = "Agosto";
                break;
            case 9:
                month = "Setembro";
                break;
            case 10:
                month = "Outubro";
                break;
            case 11:
                month = "Novembro";
                break;
            case 12:
                month = "Dezembro";
                break;
            default:
                month = "Valor inválido"; 
                break;
        }
        System.out.println("Mês correspondente: " + month);
        //scanner.close();
    }

    public static void average() {

        Scanner scanner = new Scanner (System.in);
        double nota = 0.0;
        double soma = 0.0;
        for(int i = 1; i < 4; i++) {
            System.out.println("Digite a " + i + "ª nota: ");
            nota = scanner.nextDouble();
            soma+=nota;
        }
        String media = (soma / 3) >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println(media);
        //scanner.close();
    }

    public static void forca() {

        Scanner scanner = new Scanner (System.in);
        String palavraOculta = "";
        String palavraInformada = "";
        
        System.out.println("Informe a palavra oculta: ");
        palavraOculta = scanner.next();
        
        System.out.println("\nQuantidade de tentativas: 6");
        
        for (int tentativas = 5; tentativas >= 0; --tentativas) {
            
            System.out.println("\nDigite a sua tentativa: ");
            palavraInformada = scanner.next();
            
            if (palavraInformada.equals(palavraOculta)) {
                System.out.println("\n***Parabéns, você acertou antes de ser enforcado!***");
                break;
            } else if (tentativas == 5) {
                System.out.println("\n\tVocê perdeu a cabeça");
            } else if (tentativas == 4) {
                System.out.println("\n\tVocê perdeu o tronco");
            } else if (tentativas == 3) {
                System.out.println("\n\tVocê perdeu um braço");
            } else if (tentativas == 2) {
                System.out.println("\n\tVocê perdeu o outro braço");
            } else if (tentativas == 1) {
                System.out.println("\n\tVocê perdeu uma perna");
            } else {
                System.out.println("\n\tVocê perdeu a outra perna e foi enforcado. | Game Over");
            }
        }
        //scanner.close();
    }

    public static void tabuada() {

        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Insira o número que deseja calcular a tabuada: ");
        int numeroTab = scanner.nextInt();
        
        for (int cont = 0; cont <= 10; cont++) {
            System.out.println(numeroTab + " x " + cont + " = " + (numeroTab*cont));
        }
        
        //scanner.close();
    }

    public static void torreString() {

        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Insira uma palavra: ");
        String stringTorre = scanner.nextLine();
        
        for (int cont = 0; cont < stringTorre.length(); cont++) {
            System.out.println(stringTorre.charAt(cont));
        }
        
        //scanner.close();

    }

    public static void imparesMultSete() {

        Scanner scanner = new Scanner (System.in);
        int soma = 0;
        
        for (int cont = 1; cont <= 500; cont+= 2) {
            if (cont % 2 == 1 && cont % 7 == 0) {
                soma+=cont;
            }
        }
        System.out.println("A soma dos números ímpares múltiplos de 7 é: " + soma);
        //scanner.close();

    }

    public static void notaNegativa() {

        Scanner scanner = new Scanner (System.in);
        double soma = 0.0, nota = 0.0;
        int qntNotas = 0;
        
        do {
            
            System.out.println("Informe a " + (qntNotas+1) + " ª nota do aluno: ");
            nota = scanner.nextDouble();
            soma+=nota;
            qntNotas++;
            
        } while(nota >= 0);
        
        System.out.println("A média das notas informadas é: " + (soma/qntNotas));
        
        //scanner.close();
    }

    public static void fatorial() {

        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe um número: ");
        int fatorial = scanner.nextInt();
        
        for (int cont = fatorial; cont > 1; cont--) {
            fatorial = fatorial * (cont - 1);
        }
        
        System.out.println("A fatorial desse número é: " + fatorial);
        
        //scanner.close();

    }

    public static void imc() {

        double altura = 0.0, peso = 0.0, imc = 0.0;
        String resultadoIMC = "";
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe sua altura (em metros): ");
        altura = scanner.nextDouble();
        
        System.out.println("Informe seu peso (em quilos): ");
        peso = scanner.nextDouble();
        
        imc = peso/(altura*altura);
        
        if (imc <= 18.5) {
            resultadoIMC = "Abaixo do Peso";
        } else if (imc > 18.5 && imc <= 24.9) {
            resultadoIMC = "Peso Ideal";
        } else if (imc > 24.9 && imc <= 29.9) {
            resultadoIMC = "Levemente acima do peso";
        } else if (imc > 29.9 && imc <= 34.9) {
            resultadoIMC = "Obesidade Grau I";
        } else if (imc > 34.9 && imc <= 39.9) {
            resultadoIMC = "Obesidade Grau II";
        } else {
            resultadoIMC = "Obesidade Grau III (mórbida)";
        }
        
        System.out.println("IMC: " + resultadoIMC);
        //scanner.close();

    }

    public static void operacoes() {

        double valorUm = 0, valorDois = 0;
        double resultado = 0.0;
        String operacao = "";
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe o primeiro valor: ");
        valorUm = scanner.nextInt();
        
        System.out.println("Informe o segundo valor: ");
        valorDois = scanner.nextInt();
        
        System.out.println("Informe a operação a ser realizada (+ - * /): ");
        operacao = scanner.next();
        
        if (operacao.equals("+")) {
            resultado = valorUm + valorDois;
        } else if (operacao.equals("-")) {
            resultado = valorUm - valorDois;
        } else if (operacao.equals("*")) {
            resultado = valorUm * valorDois;
        } else {
            resultado = valorUm / valorDois;
        }
        
        System.out.println("O resultado é: " + resultado);
        
        //scanner.close();

    }

}