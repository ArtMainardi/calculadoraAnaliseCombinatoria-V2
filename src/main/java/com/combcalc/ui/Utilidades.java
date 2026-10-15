package com.combcalc.ui;

import java.util.Scanner;

public class Utilidades {
    public static void confirmarParaContinuar(Scanner sc){
        System.out.print("\n" + "Pressione 'ENTER' para continuar: ");
        sc.nextLine();
        System.out.println("\n");
    }
}