package com.combcalc;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mensagemInicial();
    }

    public static void mensagemInicial(){
        System.out.println("=> Bem vindo à Calculadora de Análise Combinatória!! Aqui você pode: \n" +
                "- Calcular anagramas, permutações, arranjos e combinações; \n" +
                "- Não precisa se preocupar em perder o que fez ao fechar o programa; ele salva tudo localmente com o H2 Database!");
        confirmarParaContinuar();
    }

    public static void confirmarParaContinuar(){
        System.out.print("\n" + "Pressione 'ENTER' para continuar: ");
        sc.nextLine();
        System.out.println("\n");
    }
}