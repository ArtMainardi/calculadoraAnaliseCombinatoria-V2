package com.combcalc.ui.calculos;

import com.combcalc.ui.Utilidades;

public class FluxoArranjo {
    private final Utilidades utilidades;

    public FluxoArranjo(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        Integer numeroTotalDeElementos = null, numeroDeElementosParaOArranjo = null;
        System.out.println("=== ARRANJO ===");

        numeroTotalDeElementos = selecionarValor("Digite o valor de 'n' (número total de elementos do conjunto): ",
                numeroTotalDeElementos, numeroDeElementosParaOArranjo);

        numeroDeElementosParaOArranjo = selecionarValor("Digite o 'p' (número de elementos escolhidos para cada arranjo): ",
                numeroTotalDeElementos, numeroDeElementosParaOArranjo);

        printarFormula(numeroTotalDeElementos, numeroDeElementosParaOArranjo);
        int arranjo = calcularArranjo(numeroTotalDeElementos, numeroDeElementosParaOArranjo);
        apresentarDados(numeroTotalDeElementos, numeroDeElementosParaOArranjo, arranjo);
    }

    private void printarFormula(Integer n, Integer p){
        System.out.println("[    A(" + (n != null ? n : "n") + ", " + (p != null ? p : "p") + ") = " + (n != null ? n : "n")
                + "!/(" + (n != null ? n : "n") + " - " + (p != null ? p : "p") + ")!    ]");
    }

    private int selecionarValor(String frase, Integer n, Integer p){
        printarFormula(n, p);
        System.out.println(frase);
        int numero = utilidades.lerNumero();
        utilidades.pularLinhas();
        return numero;
    }

    private int calcularArranjo(int n, int p){
        return Calculos.calcularFatorial(n)/Calculos.calcularFatorial(n-p);
    }

    private void apresentarDados(int n, int p, int arranjo){
        System.out.println("-> Resultado do cálculo: \n" +
                        "Valor do arranjo A(" + n + ", " + p + "): " + arranjo
        );
        utilidades.confirmarParaContinuar();
        utilidades.pularLinhas();
    }
}
