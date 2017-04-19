package sedgewick.sorting;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneratorDanych {
    public static void main(String[] args) throws IOException {
        
        int[] tabela = new int[20];
        int zakresLiczb = 1000;
        
        Random generatorInteger = new Random();

        FileWriter fileWriter = new FileWriter("dane.txt");

        for (int i = 0; i < 20; i++){
            tabela[i] = generatorInteger.nextInt(zakresLiczb);
            fileWriter.write(String.format("%s", tabela[i]));
            fileWriter.write("\t");
        }

        fileWriter.close();
    }
    
    
}
