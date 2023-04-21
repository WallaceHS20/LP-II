package baralho;

import java.util.ArrayList;
import java.util.Random;

public class Baralho {
    ArrayList<Carta> baralho = new ArrayList<>(3);

    public Baralho(ArrayList<Carta> baralho) {
        this.baralho = baralho;
    }

    public ArrayList<Carta> getBaralho() {
        return baralho;
    }

    public void setBaralho(ArrayList<Carta> baralho) {
        this.baralho = baralho;
    }

    @Override
    public String toString() {
        return "Baralho{" +
                "baralho=" + baralho +
                '}';
    }

    public static void embaralhar(ArrayList<Carta> baralho){
        Random random = new Random();
        int tamanho = baralho.size();
        for (int i = 0; i < tamanho;i++){
            int aleatorio = random.nextInt(tamanho);
            Carta temporario = baralho.get(i);
            baralho.set(i,baralho.get(aleatorio));
            baralho.set(aleatorio, temporario);
        }
        System.out.println(baralho);
    }

    public static void distribuircartas(ArrayList<Carta> cartas){
        if (cartas.size() > 0 && cartas.get(0) != null){
            System.out.println(cartas.get(0).toString());
        }else{
            System.out.println("Baralho Vazio!");
        }
    }

    public static void hascartas(ArrayList<Carta> cartas){
        boolean val = false;
        if (cartas.size() > 0){
            val = true;
            System.out.println(val);
        }
        else{
            System.out.println(val);
        }
    }

}
