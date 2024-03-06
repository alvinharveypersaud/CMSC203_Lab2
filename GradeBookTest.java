package GradeBook;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class GradeBookTest 
{
	GradeBook grade1;
	GradeBook grade2;

	@Before
	public void setUp() throws Exception 
	{
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade1.addScore(90.0);
		grade1.addScore(87.0);
		grade1.addScore(92.0);
		grade2.addScore(83.0);
		grade2.addScore(100.0);
	}

	@After
	public void tearDown() throws Exception 
	{
		grade1 = null;
		grade2 = null;
	}

	@Test
	public void testAddScore() 
	{
		//fail("Not yet implemented");
		//assertEquals("90.0 87.0 92.0 ", )
		assertTrue(grade1.toString().equals("90.0 87.0 92.0 "));
		assertTrue(grade2.toString().equals("83.0 100.0 "));
	}
	
	@Test
	public void testSum()
	{
		assertEquals(269, grade1.sum(), .0001);
		assertEquals(183, grade2.sum(), .0001);
	}
	
	@Test
	public void testMinimum()
	{
		assertEquals(87, grade1.minimum(), .001);
		assertEquals(83, grade2.minimum(), .001);
	}
	
	@Test
	public void testfinalScore()
	{
		assertEquals(182.0, grade1.finalScore(), .001);
		assertEquals(100.0, grade2.finalScore(), .001);
	}

}

