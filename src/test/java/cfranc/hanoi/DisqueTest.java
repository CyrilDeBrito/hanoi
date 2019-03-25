package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	Disque small = new Disque(1);
	Disque small2 = new Disque(1);
	Disque medium = new Disque(2);
	
	@Test
	public void compareTo_Small_To_Medium_negative() {
		//GIVEN
		int expected = -1;
		//WHEN
		int actual = this.small.compareTo(this.medium);
		//THEN
		assertEquals(expected, actual);
	}
	
	@Test
	public void compareTo_Medium_To_Small_negative() {
		//GIVEN
		int expected = 1;
		//WHEN
		int actual = this.medium.compareTo(this.small);
		//THEN
		assertEquals(expected, actual);
	}
	
	@Test
	public void compareTo_Small_To_Small_negative() {
		//GIVEN
		int expected = 0;
		//WHEN
		int actual = this.small.compareTo(this.small2);
		//THEN
		assertEquals(expected, actual);
	}
}
