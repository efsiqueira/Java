import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ex5 {
    public static void main (String[] args) {
        String vetor[] = {
            "Luan",
            "Rubens",
            "Matheus",
            "Eduarda",
            "Karina"
        };
        int max = 5;
        int min = 1;
        Set<Integer> randons = new HashSet<Integer>();
        Set<String> names = new HashSet<String>();

        while(randons.size() != vetor.length) {
            int value = (int)(Math.random()*(max-min+1)+min);
            if(!randons.contains(value)) {
                randons.add(value);
                names.add(vetor[value - 1]);
            }
        }
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}
