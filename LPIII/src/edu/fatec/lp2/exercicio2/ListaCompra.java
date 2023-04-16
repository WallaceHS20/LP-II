package edu.fatec.lp2.exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListaCompra implements Calculavel{
    private int qtdeMax;
    private List<ItemCompra> ItemCompra;

    public List<ListaCompra> ListaCompra(int n){
        List<ListaCompra> ls = new ArrayList<>(n);
        return ls;
    }

    public List<ItemCompra> incluir(ItemCompra itemCompra){
       List<ItemCompra> list = new ArrayList<>(Collections.nCopies(ListaCompra(qtdeMax).size(), null));
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++){
            list.add(itemCompra);
        }//final for

        return list;
    }

    @Override
    public double calcularPreco() {
        
        return 0;
    }
}
