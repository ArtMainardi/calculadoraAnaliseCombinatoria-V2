package com.combcalc.ui;

import java.util.Scanner;

public class Utilidades {
    private final Scanner sc;

    public Utilidades(Scanner sc){
        this.sc = sc;
    }

    public void confirmarParaContinuar(){
        System.out.print("\n" + "Pressione 'ENTER' para continuar: ");
        sc.nextLine();
        pularLinhas();
    }

    public int lerNumero(){
        return Integer.parseInt(sc.nextLine().trim());
    }

    public String lerTexto(){
        return sc.nextLine().trim();
    }

    public void pularLinhas(){
        System.out.println("\n");
    }
}