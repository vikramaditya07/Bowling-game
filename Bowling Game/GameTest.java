package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	private Game g;

	void addMultiple(int n, int pins, Game g) {
		for (int i = 0; i < n; i++) g.add(pins);
	}

	@Before
	public void setUp() {
		this.g = new Game();
	}

	@Test
	public void testAllZeros() {
		addMultiple(20, 0, g);
		assertEquals(0, g.score());
	}
	
	@Test
	public void testAllOnes() {
		addMultiple(20, 1, g);
		assertEquals(20, g.score());
	}

	@Test
	public void testOneSpare() {
		g.add(5);
		g.add(5);
		g.add(3);
		addMultiple(17, 0, g);
		assertEquals(16, g.score());
	}
	
	@Test
	public void testOneStrike() {
		g.add(10);
		g.add(3);
		g.add(4);
		addMultiple(16, 0, g);
		assertEquals(30, g.score());
	}
	
	@Test
	public void testPerfectGame() {
		addMultiple(12, 10, g);
		assertEquals(300, g.score());
	}
}