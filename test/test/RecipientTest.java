package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import voisin.Recipient;
class RecipientTest {

	@Test
	void testConstruteur() {
		int quantite = 2;
		int capacite = 5;
		Recipient instance = new Recipient(quantite, capacite);
		// When
		// then
		assertEquals(2, instance.getQuantite());
		assertEquals(5, instance.getCapacite());

	}

	@Test
	void TestMettreUnDans() {

		Recipient instance = new Recipient(2, 5);
		Recipient autre = new Recipient(1, 4);
		instance.mettreUnDans(autre);
		assertEquals(1, instance.getQuantite());
		assertEquals(2, autre.getQuantite());
		assertEquals(5, instance.getCapacite());
		assertEquals(4, autre.getCapacite());
	}

	@Test
	void testRemplir() {
		Recipient instance = new Recipient(2, 5);
		Recipient autre = new Recipient(5, 6);
//	when 
		instance.remplir(autre);
		assertEquals(1, instance.getQuantite());
		assertTrue(autre.isPlein());
		assertEquals(5, instance.getCapacite());
		assertEquals(6, autre.getCapacite());

	}

	@Test
	void testViderDans() {
		Recipient instance = new Recipient(2, 5);
		Recipient autre = new Recipient(1, 6);
//	when 
		instance.viderDans(autre);

		assertTrue(instance.isVide());
		assertEquals(3, autre.getQuantite());
		assertEquals(5, instance.getCapacite());
		assertEquals(6, autre.getCapacite());

	}
}
