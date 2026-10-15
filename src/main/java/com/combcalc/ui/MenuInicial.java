package com.combcalc.ui;

import java.util.Scanner;

public class MenuInicial {
    private final Scanner sc;

    public MenuInicial(Scanner sc){
        this.sc = sc;
    }

    public void menuInicial(){
        int opcao = -1;
        while(opcao != 0){
            try{
                printarMenu();
                opcao = selecionarOpcao();
            } catch (Exception e){
                System.out.println("ERRO: " + e.getMessage());
            }
        }
    }

    private void printarMenu(){
        System.out.println("=== MENU INICIAL ===");
        System.out.println("Escolha uma opção: \n\r"
                + "1- Realizar um cálculo \n\r"
                + "0- Finalizar programa"
        );
    }

    private int selecionarOpcao(){
        return Integer.parseInt(sc.nextLine().trim());
    }
}