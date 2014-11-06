package br.com.aceleradora.Vogais;

public class Palavra {

	public int contaVogais(String palavra) {
		int cont = 0;
		
		palavra = palavra.toLowerCase();
		
		for(char letra : palavra.toCharArray()){
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
				cont++;
			}
					
		}
		
		return cont;
	}

}
