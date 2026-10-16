package com.combcalc.ui;

import com.combcalc.exception.OpcaoInvalidaException;

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
                analisarOpcao(opcao);
            } catch (NumberFormatException | OpcaoInvalidaException e){
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

    private void analisarOpcao(int opcao) throws OpcaoInvalidaException{
        switch (opcao){
            case 1:
                MenuCalculos menuCalculos = new MenuCalculos(utilidades);
                menuCalculos.menuCalculos();
                break;
            case 0:
                break;
            default:
                throw new OpcaoInvalidaException();
        }
    }
}