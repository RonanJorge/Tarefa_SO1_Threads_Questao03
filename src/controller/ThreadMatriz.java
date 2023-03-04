package controller;

public class ThreadMatriz extends Thread{
	private int n;
	private int[] vetor;
	
	public ThreadMatriz(int n, int[] vetor) {
		this.n = n;
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		System.out.println(n + 1 + "ª Linha: Soma = "+soma);
	}
}
