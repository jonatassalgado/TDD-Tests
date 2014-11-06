package br.com.aceleradora.Vogais;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalavraTeste {
	private Palavra palavra;
	
	@Before
	public void setUp(){
		palavra = new Palavra();
	}
	
	@Test
	public void retorna1QuandoAPalavraForXis(){
		int result = palavra.contaVogais("Xis");
		
		assertEquals(1, result);
	}
	
	@Test
	public void retorna2QuandoAPalavraForUrso(){
		int result = palavra.contaVogais("Urso");
		
		assertEquals(2, result);
	}
	
	@Test
	public void retorna3QuandoAPalavraForMinion(){
		int result = palavra.contaVogais("Minion");
		
		assertEquals(3, result);
	}
	
}
