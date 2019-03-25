package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {
	// HauteurMax des tours
	Tour t = new Tour(3);

	@Test
	public void emplier_TourVide_True() {
		//GIVEN
		//WHEN
		boolean condition = t.estVide();
		//THEN
		assertTrue(condition);
	}
	
	@Test
	public void emplier_TourPlein_True() {
		//GIVEN
		Disque d1 = new Disque (1);
		Disque d2 = new Disque (2);
		Disque d3 = new Disque (3);
		//WHEN
		t.empiler(d3);
		t.empiler(d2);
		t.empiler(d1);
		boolean condition = t.estPleine();
		//THEN
		assertTrue(condition);
	}
	
	@Test
	public void emplier_TourLibre_True() {
		//GIVEN
		Disque d1 = new Disque (1);
		Disque d2 = new Disque (2);
		Disque d3 = new Disque (3);
		//WHEN
		this.t.empiler(d3);
		this.t.empiler(d2);
		boolean condition = t.empiler(d1);
		//THEN
		assertTrue(condition);
	}
	
	@Test
	public void emplier_TourFull_False() {
		//GIVEN
		Disque d1 = new Disque (1);
		Disque d2 = new Disque (2);
		Disque d3 = new Disque (3);
		Disque d4 = new Disque (4);
		//WHEN
		t.empiler(d4);
		t.empiler(d3);
		t.empiler(d2);
		boolean condition = t.empiler(d1);
		//THEN
		assertFalse(condition);
	}
	
	@Test
	public void estPleine_true() {
		//GIVEN
		Disque d1 = new Disque (1);
		Disque d2 = new Disque (2);
		Disque d3 = new Disque (3);
		//WHEN
		t.empiler(d3);
		t.empiler(d2);
		t.empiler(d1);
		boolean condition = t.estPleine();
		//THEN
		assertTrue(condition);
	}
	
	@Test
	public void estPleine_false() {
		//GIVEN
		Disque d2 = new Disque (2);
		Disque d3 = new Disque (3);
		//WHEN
		t.empiler(d3);
		t.empiler(d2);
		boolean condition = t.estPleine();
		//THEN
		assertFalse(condition);
	}
	
	@Test
	public void diam_DiametreDisqueSommet_Null() {
		//GIVEN
		// ----> No disk set is normal here! <----
		//WHEN
		int expected = Integer.MAX_VALUE;
		int actual = t.diam();
		//THEN
		assertEquals(expected, actual);
	}
	
	@Test
	public void diam_DiametreDisqueSommet_NotNull() {
		//GIVEN
		Disque d1 = new Disque (1);
		Disque d2 = new Disque (2);
		Disque d3 = new Disque (3);
		//WHEN
		t.empiler(d3);
		t.empiler(d2);
		t.empiler(d1);
		
		int expected = 3;
		int actual = t.diam();
		//THEN
		assertEquals(expected, actual);
	}
}
