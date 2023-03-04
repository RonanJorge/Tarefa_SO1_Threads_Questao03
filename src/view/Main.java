package view;

import controller.ThreadMatriz;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		System.out.println("Matriz:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				matriz[i][j] = (int)(Math.random()*10 + 1);
				System.out.print(matriz[i][j] +  " ");
			}
			System.out.println("");
		}
		for(int i = 0; i < 3; i++) {
			int linha = i;
			int[] vetor = new int[5];
			for(int j = 0; j < 5; j++) {
				vetor[j] = matriz[i][j];
			}
			Thread x = new ThreadMatriz(linha, vetor);
			x.start();
		}
	}
}