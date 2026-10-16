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
        System.out.println("\n");
    }

    public int selecionarOpcao(){
        return Integer.parseInt(sc.nextLine().trim());
    }

    public String lerTexto(){
        return sc.nextLine().trim();
    }
}