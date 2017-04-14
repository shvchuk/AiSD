package wersja.finalna.pliki;

import java.io.IOException;
import java.util.Random;

public class PlikTekstowyMacierz {
    public static void main(String[] args) throws IOException {
        int zakresWymiaruMacierzy = 10;
        Random generatorKolumn = new Random();
        Random generatorWierszy = new Random();

        Macierz macierz = new Macierz(generatorWierszy.nextInt(zakresWymiaruMacierzy)+1,
                generatorKolumn.nextInt(zakresWymiaruMacierzy)+1);

        macierz.generujMacierz();
        macierz.wyswietlMacierz();
        System.out.println("----------------");
        System.out.println(macierz.najwiekszyElementMacierzy());

        macierz.zapiszMacierzPlikTekstowy();
    }
}
