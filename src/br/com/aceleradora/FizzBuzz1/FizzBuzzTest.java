package br.com.aceleradora.FizzBuzz1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fizzBuzz;
	
	@Before
	public void setUp() throws Exception{
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void quandoONumeroForMultiploDe3RetornaFizz(){
		String result = fizzBuzz.testaNumero(3);
		
		assertEquals("fizz", result);
	}
	
	@Test
	public void quandoONumeroForMultiploDe5RetornaBuzz(){
		String result = fizzBuzz.testaNumero(5);
		
		assertEquals("buzz", result);
	}
	
	@Test
	public void quandoONumeroNaoForMultiploDe3NemDe5RetornaONumero(){
		String result = fizzBuzz.testaNumero(4);
		
		assertEquals("4", result);
	}
	
	@Test
	public void quandoONumeroForMultiploDe3e5RetornaFizzBuzz(){
		String result = fizzBuzz.testaNumero(15);
		
		assertEquals("FizzBuzz", result);
	}
}
