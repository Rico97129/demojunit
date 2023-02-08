package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompteurTest {

	@Test
	void testConstructeur() {
		//		Given:
	Compteur instance = new Compteur();
	int expected = 0;
	int result = instance.getNiveau();
	
	assertEquals(expected , result);
	
	}
	@Test
	void testIncrementer() {
		//		given 
		Compteur instance = new Compteur();
		//		When
		instance.incrementer();
		instance.incrementer();
		instance.incrementer();
		// then
		assertEquals(3,instance.getNiveau());
		
		
	}
	@Test
	void testReinitialiser() {
		//		given 
		Compteur instance = new Compteur();
		//		When
		instance.incrementer();
		instance.incrementer();
		instance.incrementer();
		instance.Reinitialiser();
		
		// then
		assertEquals(0,instance.getNiveau());
		
		
	}

}
