package com.combcalc.ui;

public class MenuCalculos {
    private final Utilidades utilidades;

    public MenuCalculos(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
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
        System.out.println("=== CÁLCULOS ===");
        System.out.println("Escolha uma opção: \n\r"
                + "0- Voltar"
        );
    }
}
