package baralho;

import java.util.ArrayList;
import java.util.Arrays;

import static baralho.Baralho.*;

public class Main {
    public static void main(String[] args) {

        Carta c1 = new Carta("Valete", "Ouros");
        Carta c2 = new Carta("Reis", "Copa");
        Carta c3 = new Carta("Dama", "Paus");

        ArrayList<Carta> cartas = new ArrayList<>(3);
        cartas.add(c1);
        cartas.add(c2);
        cartas.add(c3);

        Baralho baralho = new Baralho(cartas);

        distribuircartas(baralho.getBaralho());
        embaralhar(baralho.getBaralho());
        hascartas(baralho.getBaralho());
    }
}