package com.combcalc.ui.calculos;

import com.combcalc.domain.Calculos;
import com.combcalc.exception.NumeroInvalidoException;
import com.combcalc.ui.Utilidades;

public class FluxoPermutacao implements FluxoCalculo {
    private final Utilidades utilidades;

    public FluxoPermutacao(Utilidades utilidades){
        this.utilidades = utilidades;
    }

    public void executar(){
        System.out.println("=== PERMUTAÇÃO ===");

        try{
            int numero = selecionarNumero();
        } catch (NumberFormatException | NumeroInvalidoException e){
            System.out.println("ERRO: " + e.getMessage());
            utilidades.confirmarParaContinuar();
            return;
        }

        int permutacao = Calculos.calcularPermutacao(numero);
        apresentarDados(numero, permutacao);
    }

    private int selecionarNumero() throws NumeroInvalidoException {
        System.out.println("Digite o número do qual deseja fazer a permutação: ");
        return utilidades.lerNumeroPositivo();
    }

    private void apresentarDados(int numero, int permutacao){
        System.out.println("\n-> Resultado do cálculo: \n" +
                        "Permutação do número " + numero + ": " + permutacao
        );
        utilidades.confirmarParaContinuar();
        utilidades.pularLinhas();
    }
}
