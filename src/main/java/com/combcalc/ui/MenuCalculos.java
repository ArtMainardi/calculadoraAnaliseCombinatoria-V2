package com.combcalc.ui;

import com.combcalc.exception.OpcaoInvalidaException;
import com.combcalc.ui.calculos.Anagrama;

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
                analisarOpcao(opcao);
            } catch (NumberFormatException | OpcaoInvalidaException e){
                System.out.println("ERRO: " + e.getMessage());
                utilidades.confirmarParaContinuar();
            }
        }
    }

    private void printarMenu(){
        System.out.println("=== CÁLCULOS ===");
        System.out.println("Escolha uma opção: \n\r"
                + "1- Anagrama \n\r"
                + "0- Voltar"
        );
    }

    private void analisarOpcao(int opcao) throws OpcaoInvalidaException {
        utilidades.pularLinhas();
        switch (opcao){
            case 1:
                Anagrama anagrama = new Anagrama(utilidades);
                anagrama.executar();
                break;
            case 0:
                break;
            default:
                throw new OpcaoInvalidaException();
        }
    }
}
