package teste2;

public class FizzBuzz {

	public static int NUMERO3 = 3;
	public static int NUMERO5 = 5;	

	public String verificaNumero(int numero) {
		if(numero < 0){
			return "NEGATIVO";
		}
		if (numero % NUMERO3 == 0 && numero % NUMERO5 == 0) {
			return "FizzBuzz";
		}
		if (numero % NUMERO3 == 0) {
			return "fizz";
		}
		if (numero % NUMERO5 == 0) {
			return "buzz";
		}
		return Integer.toString(numero);
	}

}