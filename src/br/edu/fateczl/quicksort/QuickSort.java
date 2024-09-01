package br.edu.fateczl.quicksort;

public class QuickSort {
	
	public QuickSort() {
		super();
	}
	
	public int [] quick(int[] vetor, int inicio, int fim) {
		if(fim > inicio) {
			int pivoFixo = dividir(vetor, inicio, fim);
			
			quick(vetor, inicio, pivoFixo - 1);
			quick(vetor, pivoFixo + 1, fim);
		}
		
		return vetor;
	}
	
	private int dividir(int[] vetor, int inicio, int fim) {
		int ponteiroEsq = inicio + 1;
		int ponteiroDir = fim;
		int pivo = vetor[inicio];
		
		while(ponteiroEsq <= ponteiroDir) {
			while(ponteiroEsq <= ponteiroDir && vetor[ponteiroEsq] <= pivo) {
				ponteiroEsq++;
			}
			
			while(ponteiroEsq <= ponteiroDir && vetor[ponteiroDir] >= pivo) {
				ponteiroDir--;
			}
			
			if(ponteiroEsq <= ponteiroDir) {
				trocar(vetor, ponteiroEsq, ponteiroDir);
				ponteiroEsq++;
				ponteiroDir--;
			}
		}
		trocar(vetor, inicio, ponteiroDir);
		return ponteiroDir;
	}
	
	private void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
}
