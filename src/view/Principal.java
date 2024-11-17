package view;

import br.edu.fateczl.Arvore.Arvore;
import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {
		ArvoreController arvCont = new ArvoreController();
		int[] vetor = { 30, 15, 60, 10, 20, 40, 80 };
		
		Arvore arvore = arvCont.insereElementos(vetor);
		
		try {
			arvore.remove(60);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		arvCont.printElementos(arvore);
	}

}
