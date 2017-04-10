package wersja.finalna.pliki;

import java.util.Random;

public class Macierz {
    public int x, y;
    public double macierzDwuwymiarowa[][];

    public Macierz(int x, int y){
        this.x = x;
        this.y = y;

        macierzDwuwymiarowa = new double[x][y];

        generujMacierz();
        najwiekszyElementMacierzy();
    }



    private void generujMacierz() {
        int zakres = 50;

        Random generatorDouble = new Random();
        Random generatorInteger = new Random();

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                macierzDwuwymiarowa[i][j] = generatorDouble.nextDouble()*generatorInteger.nextInt(zakres+1);
            }
        }
    }

    private void najwiekszyElementMacierzy() {
    }
}
