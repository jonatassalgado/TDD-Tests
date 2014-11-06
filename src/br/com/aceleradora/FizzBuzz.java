package br.com.aceleradora;

public class FizzBuzz {

	public String testaNumero(int numero) {
		if(numero % 3 == 0 && numero % 5 ==0){
			return "FizzBuzz";
		}else if(numero % 3 == 0){
			return "fizz";
		}else if(numero % 5 == 0){
			return "buzz";
		}else{
			return Integer.toString(numero);
		}
	}

}
