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
	
	@Test
	public void probarIO () {
		
		String palabra = "Malespin";
		
		String metodoTraductor = Malespin.traduceAMalespin(palabra);
		
		assertEquals("Melespon", metodoTraductor);
	}

	@Test
	public void probarBT () {
		
		String palabra = "tabla de atributo";
		
		String metodoTraductor = Malespin.traduceAMalespin(palabra);
		
		assertEquals("tetle de etrotuto", metodoTraductor);
	}
	


}
