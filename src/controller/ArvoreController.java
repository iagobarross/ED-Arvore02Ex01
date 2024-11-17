package controller;

import br.edu.fateczl.Arvore.Arvore;

public class ArvoreController {

	public Arvore insereElementos(int[] vetor) {
		Arvore arvore = new Arvore();
		for (int valor : vetor) {
			arvore.insert(valor);
		}
		return arvore;
	}
	
	public void printElementos(Arvore arvore) {
		try {
			arvore.infixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
			
}
