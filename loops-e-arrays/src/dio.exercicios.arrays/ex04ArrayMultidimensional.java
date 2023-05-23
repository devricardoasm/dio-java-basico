//Exercicio que imprime uma matriz 4x4 com valores aleaórios entre 0 e 9.

import java.util.Random;

public class ex04ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [] [] M = new int [4] [4];

        for(int i = 0; i < M.length; i++) { //i = quantidade de linhas
            for(int j = 0; j <M[i].length; j++){ //j = quantidade de colunas
                M[i] [j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha  : M) {
            for (int elementodaColuna : linha) {
                System.out.println(elementodaColuna + " ");
                
            }
            System.out.println();
        }
    }
}
