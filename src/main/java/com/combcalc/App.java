package com.combcalc;

import com.combcalc.ui.MenuInicial;
import com.combcalc.ui.Utilidades;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Utilidades utilidades = new Utilidades(sc);

    public static void main(String[] args) {
        System.out.println("=> Bem vindo à Calculadora de análise combinatória CombCalc!! Aqui você pode: \n" +
                "- Calcular anagramas, permutações, arranjos e combinações; \n" +
                "- Não precisa se preocupar em perder o que fez ao fechar o programa; ele salva tudo localmente com o H2 Database!");
        utilidades.confirmarParaContinuar();

        MenuInicial menu = new MenuInicial(utilidades);
        menu.menuInicial();
    }
}