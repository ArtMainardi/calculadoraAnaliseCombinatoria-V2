package com.combcalc.ui;

import com.combcalc.exception.OpcaoInvalidaException;
import com.combcalc.ui.calculos.FluxoAnagrama;
import com.combcalc.ui.calculos.FluxoArranjo;
import com.combcalc.ui.calculos.FluxoCombinacao;
import com.combcalc.ui.calculos.FluxoPermutacao;

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
                opcao = utilidades.lerNumero();
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
                + "2- Permutação \n\r"
                + "3- Arranjo \n\r"
                + "4- Combinação \n\r"
                + "0- Voltar"
        );
    }

    private void analisarOpcao(int opcao) throws OpcaoInvalidaException {
        utilidades.pularLinhas();
        switch (opcao){
            case 1:
                new FluxoAnagrama(utilidades).executar();
                break;
            case 2:
                new FluxoPermutacao(utilidades).executar();
                break;
            case 3:
                new FluxoArranjo(utilidades).executar();
                break;
            case 4:
                new FluxoCombinacao(utilidades).executar();
                break;
            case 0:
                break;
            default:
                throw new OpcaoInvalidaException();
        }
    }
}
