package wersja.finalna.pliki;

import java.io.*;
import java.util.Random;

public class Macierz {
    public int x, y;
    public double macierzDwuwymiarowa[][];

    public Macierz(int x, int y){
        this.x = x;
        this.y = y;

        macierzDwuwymiarowa = new double[x][y];

        //generujMacierz();
        //najwiekszyElementMacierzy();
    }



    public void generujMacierz() {
        int zakres = 50;

        Random generatorDouble = new Random();
        Random generatorInteger = new Random();

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                macierzDwuwymiarowa[i][j] = generatorDouble.nextDouble()*generatorInteger.nextInt(zakres+1);
            }
        }
    }

    public String najwiekszyElementMacierzy() {

        double najwiekszyElement = macierzDwuwymiarowa[0][0];
        int wiersz = 0;
        int kolumna = 0;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(najwiekszyElement < macierzDwuwymiarowa[i][j]) {
                    najwiekszyElement = macierzDwuwymiarowa[i][j];
                    kolumna = j+1;
                    wiersz = i+1;
                }
            }
        }

        String wartoscMaksymalna = String.format("%s" + "%05.2f", "Wartość maksymalna elementu macierzy: ",
                najwiekszyElement);
        String indeksMaxEl = String.format(" w wierszu " + wiersz + ", kolumnie: " + kolumna);
        return wartoscMaksymalna+indeksMaxEl;
    }

    public void wyswietlMacierz(){
        System.out.println("Macierz");
        System.out.println("Liczba wierszy: " + x);
        System.out.println("Liczba kolumn: " + y);
        System.out.println("-----------------");

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.printf("%05.2f", macierzDwuwymiarowa[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public void zapiszMacierzPlikTekstowy() throws IOException {
        FileWriter fileWriter = new FileWriter("macierz2.txt");

        fileWriter.write("Macierz\n");
        fileWriter.write("Liczba wierszy: " + x+"\n");
        fileWriter.write("Liczba kolumn: " + y+"\n");
        fileWriter.write("\n");

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                fileWriter.write(String.format("%05.2f", macierzDwuwymiarowa[i][j]));
                fileWriter.write("\t");
            }
            fileWriter.write("\n");
        }
        fileWriter.write("\n");
        fileWriter.write(najwiekszyElementMacierzy());
        fileWriter.close();
        System.out.println("Zapisaliśmy macierz do pliku tekstowego.");
    }

    public void odczytMacierzPlikTekstowy() throws IOException {
        System.out.println("------------");
        System.out.println("Odczyt pliku start.");
        BufferedReader reader = new BufferedReader(new FileReader("macierz2.txt"));
        String line;

        while((line = reader.readLine()) != null){
            System.out.println(line);
        }

        System.out.println("Odczyt pliku koniec.");
        System.out.println("------------");
    }
}
