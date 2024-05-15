package steyce;

public class matriz {

	public static void main(String[] args) {
		   
        int[][] matriz = new int[4][4];

       
        preencherMatriz(matriz);

        
        System.out.println("Matriz resultante:");
        imprimirMatriz(matriz);
    }

    
    public static void preencherMatriz(int[][] matriz) {
     
        int valor = 1;

     
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = valor++;
        }
    }

 
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}