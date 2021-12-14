import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;
import java.util.SortedSet;

public class PrimeiraAvaliacao {
    public static void main(String[] args) {
        System.out.println("Eduardo Siqueira\n");
        //Ordenação: Bubble sort
        //Variáveis:
        String valores = "";
        int cont = 0, contNum = 0, aux, numero;
        SortedSet<Integer> listaOrdenada = new TreeSet<>(); //Cria uma lista ordenada
        //sortedlist
        BufferedReader leitura;

        try {
            leitura = new BufferedReader(new FileReader("./listaValores.txt")); //Cria o buffer para ler o arquivo  
            
            while((valores = leitura.readLine()) != null ) { //Leitura da quantidade de linhas do arquivo
                cont++;
            }
            leitura.close();
        } catch (IOException exception) {
            System.out.println("Arquivo não localizado");
        }

        int[] vetor = new int[cont];
        cont = 0;
        try{
            leitura = new BufferedReader(new FileReader("./listaValores.txt"));

            while((valores = leitura.readLine()) != null ) { //Leitura do arquivo
                numero = Integer.parseInt(valores); //Conversão para número
                vetor[cont] = numero; //Insere no vetor
                cont++;
            }

            leitura.close();
        } catch (IOException exception) {
            System.out.println("Arquivo não localizado");
        }

        System.out.println("Valores:");
        
        for (int i : vetor) { //Print do vetor
            System.out.println(i);
        }

        System.out.println("\n");

        for(cont = 0; cont < vetor.length; cont++) { //Contador que percorre todo o vetor
            for(contNum = 0; contNum < vetor.length - 1; contNum++) { 
                if(vetor[contNum] > vetor[contNum + 1]) { //Compara se o vetor no índice 0 é maior que no índice 0 + 1
                    aux = vetor[contNum];
                    vetor[contNum] = vetor[contNum + 1];
                    vetor[contNum + 1] = aux; //Joga o maior valor para o final
                    System.out.println("Troquei o valor " + vetor[contNum + 1] + " pelo valor " + vetor[contNum]);
                }
            }
        }

        System.out.println("\nLista: ");
        for (int listaValores : vetor) { //Adiciona os valores do vetor para a lista e imprime
            listaOrdenada.add(listaValores);
            System.out.println(listaOrdenada);
        }

        System.out.println("\nVetor: "); //Printa o vetor
        for (int vetorValores : vetor) {
            System.out.print("\t " + vetorValores);
        }

        try{
            BufferedWriter escrita = new BufferedWriter(new FileWriter("./listaOrdenada.txt")); //Cria o buffer de escrita
            try{
                for (cont = 0; cont < vetor.length; cont++) {
                    escrita.append("\t " + vetor[cont]); //Adiciona os valores do vetor em um arquivo de texto
                }
            } catch(Exception e) {
                System.out.println(e.getMessage()); //Tratamento de erro
            }
            
            escrita.close();
        } catch (IOException exception) {
            System.out.println("Arquivo não localizado");
        }
        
    }
}