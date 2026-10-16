package com.combcalc.ui.calculos;

import com.combcalc.ui.Utilidades;

import java.util.ArrayList;

public class FluxoArranjo {
    private Utilidades utilidades;

    public FluxoArranjo(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        Integer numeroTotalDeElementos = null, numeroDeElementosParaOArranjo = null;
        System.out.println("=== ARRANJO ===");

        printarFormula(numeroTotalDeElementos, numeroDeElementosParaOArranjo);
        System.out.println("Digite o valor de 'n' (número total de elementos do conjunto): ");
        numeroTotalDeElementos = utilidades.lerNumero();

        printarFormula(numeroTotalDeElementos, numeroDeElementosParaOArranjo);
        System.out.println("Digite o 'p' (número de elementos escolhidos para cada arranjo): ");
        numeroDeElementosParaOArranjo = utilidades.lerNumero();

        printarFormula(numeroTotalDeElementos, numeroDeElementosParaOArranjo);
        int arranjo = calcularArranjo(numeroTotalDeElementos, numeroDeElementosParaOArranjo);
        apresentarDados(numeroTotalDeElementos, numeroDeElementosParaOArranjo, arranjo);
    }

    private void printarFormula(Integer n, Integer p){
        System.out.println("\n\n[->    A(" + (n != null ? n : "n") + ", " + (p != null ? p : "p") + ") = " + (n != null ? n : "n")
                + "!/(" + (n != null ? n : "n") + " - " + (p != null ? p : "p") + ")!    <-]");
    }

    private int calcularArranjo(int n, int p){
        return Calculos.calcularFatorial(n)/Calculos.calcularFatorial(n-p);
    }

    private void apresentarDados(int n, int p, int arranjo){
        System.out.println("\n-> Resultado do cálculo: \n" +
                        "Valor do arranjo A(" + n + ", " + p + "): " + arranjo
        );
        utilidades.confirmarParaContinuar();
        utilidades.pularLinhas();
    }
}
