package test.cenfotec.katas.ac.cr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cenfotec.katas.ac.cr.Malespin;

public abstract class TestMalespin {
	
	
	@Test
	public void probarAE () {
		
		String palabra = "Maria";
		
		String metodoTraductor = Malespin.traduceAMalespin(palabra);
		
		assertEquals("Merie", metodoTraductor);
	}


}
