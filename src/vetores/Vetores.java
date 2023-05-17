/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author Thiago Aguiar
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*// declarando os vetores (arrays)
        String[] mesesAno = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // imprimindo em tela
        
        // usando FOR
        System.out.println("::: USANDO FOR :::");
        for (int i = 0; i < mesesAno.length; i++) {
            
            System.out.println("O mês de " + mesesAno[i] + " tem " + diasMes[i] + " dias.");
            
        }

        // usando WHILE
        System.out.println("::: USANDO WHILE :::");
        int i = 0;
        while (i < mesesAno.length) {

            System.out.println("O mês de " + mesesAno[i] + " tem " + diasMes[i] + " dias.");
            i++;

        };

        // usando DO WHILE
        System.out.println("::: USANDO DO WHILE :::");
        int c = 0;
        do {
            
            System.out.println("O mês de " + mesesAno[c] + " tem " + diasMes[0] + " dias.");
            c++;
            
        } while (c < mesesAno.length);*/
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o ano de início: ");
        int anoInicio = teclado.nextInt();

        System.out.print("Digite o ano de fim: ");
        int anoFim = teclado.nextInt();

        int restoPor4, restoPor400, restoPor100;
        int qtdAnosBissextos = 0, qtdAnosNaoBissextos = 0;

        for (int ano = anoInicio; ano <= anoFim; ano++) {

            restoPor4 = ano % 4;
            restoPor400 = ano % 400;
            restoPor100 = ano % 100;

            if (restoPor4 != 0) {

                qtdAnosNaoBissextos++;

            } else if (restoPor400 == 0) {

                qtdAnosBissextos++;

            } else if (restoPor100 != 0) {

                qtdAnosBissextos++;

            } else {

                qtdAnosNaoBissextos++;

            }

        }

        int[] listaAnosBissextos = new int[qtdAnosBissextos];
        int[] listaAnosNaoBissextos = new int[qtdAnosNaoBissextos];
        int posicaoListaAnosBissextos = 0, posicaoListaAnosNaoBissextos = 0;

        for (int ano = anoInicio; ano <= anoFim; ano++) {

            restoPor4 = ano % 4;
            restoPor400 = ano % 400;
            restoPor100 = ano % 100;

            if (restoPor4 != 0) {

                listaAnosNaoBissextos[posicaoListaAnosNaoBissextos] = ano;
                posicaoListaAnosNaoBissextos++;

            } else if (restoPor400 == 0) {

                listaAnosBissextos[posicaoListaAnosBissextos] = ano;
                posicaoListaAnosBissextos++;

            } else if (restoPor100 != 0) {

                listaAnosBissextos[posicaoListaAnosBissextos] = ano;
                posicaoListaAnosBissextos++;

            } else {

                listaAnosNaoBissextos[posicaoListaAnosNaoBissextos] = ano;
                posicaoListaAnosNaoBissextos++;

            }

        }

        System.out.println("***** LISTA DE ANOS BISSEXTOS *****");

        for (int ano : listaAnosBissextos) {
            
            System.out.println(ano);
            
        }

    }
;

}
