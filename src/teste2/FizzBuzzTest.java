package teste2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	@Before
	public void SetUp(){
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void retornaFizzQuandoONumeroForMultiploDe3(){
		String result = fizzBuzz.verificaNumero(FizzBuzz.NUMERO3);
		
		assertEquals("fizz", result);
	}

	@Test
	public void retornaBuzzQuandoONumeroForMultiploDe5(){
		String result = fizzBuzz.verificaNumero(FizzBuzz.NUMERO5);
		
		assertEquals("buzz", result);
	}
	
	@Test
	public void retornaONumeroQuandoONumeroNaoForMultiploDe3nemDe5(){
		String result = fizzBuzz.verificaNumero(4);
		
		assertEquals("4", result);
	}
	
	@Test
	public void retornaFizzBuzzQuandoONumeroForMultiploDe3E5(){
		String result = fizzBuzz.verificaNumero(15);
		
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void retornaStringNegativoQuandoONumeroForNegativo(){
		String result = fizzBuzz.verificaNumero(-1);
		
		assertEquals("NEGATIVO", result);
	}
}
