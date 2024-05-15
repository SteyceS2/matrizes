package steyce;

import java.util.Scanner;

public class par {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int[][] m = new int[5][5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                m[i][j] = (int) Math.round(Math.random() * 10);
                if (m[i][j] % 2 == 0) { 
                    soma += m[i][j]; 
                }
            }
        }

        
        System.out.println("Matriz resultante (apenas números pares):");
        imprimirMatrizPares(m);
        System.out.println("Soma de todos os números pares da matriz: " + soma);
    }

   
    public static void imprimirMatrizPares(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) { 
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
    }


	}


