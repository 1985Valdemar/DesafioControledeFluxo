package DesafioControleFluxo;

import ParametroInvalidoException.ParametroInvalidoException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametroInvalidoException {
        Scanner terminal = new Scanner(System.in);


        try {

            System.out.println("Digite o primeiro paramentro:");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo paramento:");
            int parametroDois = terminal.nextInt();


            contar(parametroUm, parametroDois);

        } catch (ParametroInvalidoException e) {
            System.out.println("Segundo parametro dever ser maior que o primeiro parametro.");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {
        if (parametroDois > parametroUm) {
            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i++) {
                System.out.println("Numero de contagem: " + contagem);
            }
        }
        throw new ParametroInvalidoException();

    }
}