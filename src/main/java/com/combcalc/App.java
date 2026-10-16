package com.combcalc;

import com.combcalc.ui.MenuInicial;
import com.combcalc.ui.Utilidades;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utilidades utilidades = new Utilidades(sc);

        mensagemInicial(utilidades);
        MenuInicial menu = new MenuInicial(utilidades);
        menu.menuInicial();
    }

    private static void mensagemInicial(Utilidades utilidades){
        System.out.println("=> Bem vindo à Calculadora de análise combinatória CombCalc!! Aqui você pode: \n" +
                "- Calcular anagramas, permutações, arranjos e combinações;");
        utilidades.confirmarParaContinuar();
    }
}