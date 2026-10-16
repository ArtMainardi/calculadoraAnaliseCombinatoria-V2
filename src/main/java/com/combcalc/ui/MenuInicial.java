package com.combcalc.ui;

import java.util.Scanner;

public class MenuInicial {
    private final Utilidades utilidades;

    public MenuInicial(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void menuInicial(){
        int opcao = -1;
        while(opcao != 0){
            try{
                printarMenu();
                opcao = utilidades.selecionarOpcao();
            } catch (NumberFormatException e){
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
}