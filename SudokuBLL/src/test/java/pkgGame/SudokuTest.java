package pkgGame;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SudokuTest {
/*
	@Test
	public void Sudoku_Test1() {
		try {
			Sudoku s1 = new Sudoku(9);
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
	@Test(expected = Exception.class)
	public void Sudoku_Test2() throws Exception {
		Sudoku s1 = new Sudoku(10);
	}
	@Test
	public void getRegion_Test1() {
		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 3, 4, 1, 2 };
		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region 0 = 1 2 3 4
		// region 1 = 3 4 1 2
		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);
			region = s1.getRegion(1);
			System.out.println(Arrays.toString(region));			
			assertTrue(Arrays.equals(ExpectedRegion, region));
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
	
	@Test
	public void getRegion_Test2() {
		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 2, 1, 4, 3 };
		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region at 0,2 = 2 1 4 3
		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);
			region = s1.getRegion(0,2);
			System.out.println(Arrays.toString(region));			
			assertTrue(Arrays.equals(ExpectedRegion, region));
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
	
	@Test
	public void Sudoku_test1()
	{
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isSudoku());
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test2()
	{
		int[][] puzzle = { { 5, 5, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test3()
	{
		int[][] puzzle = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 5, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 5, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void Sudoku_test4()
	{
		int[][] puzzle = { 
				{ 55, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}	
	
	@Test
	public void PartialSudoku_Test1()
	{
		//	This test will test a partial sudoku...  a zero in [0,0]...  everything else works
		//	but the first element in the puzzle is zero 
		
		int[][] puzzle = { { 0, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isPartialSudoku());
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}
	
	@Test
	public void PartialSudoku_Test2()
	{
		//	This test will test a partial sudoku...  
		//	Everything zero, but there's a duplciate value in the region (not row/column)
 
		
		int[][] puzzle = {
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isPartialSudoku());
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
	}
	
	@Test
	public void PartialSudoku_Test3()
	{
		//	This is a working solution, make sure it fails isPartiaSudoku()
		
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
		{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
		{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isPartialSudoku());
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}
		
	}	*/

	@Test
	public void TestRegionNbr()
	{
		Sudoku s1= null;
		
		int[][] puzzle = { 
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, 
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		
		int [] Region5 = {4,2,3,7,9,1,8,5,6};
		
		try {
			 s1 = new Sudoku(puzzle);
		} catch (Exception e) {
			fail("Bad Sudoku");
		}
		
		assertTrue(Arrays.equals(Region5, s1.getRegion(5)));
	}
		
	
	
	@Test
	
	public void getRegionNbr_test1() throws Exception {
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8}, 
							{5,6,9,1,3,4,2,8,2},
							{1,2,3,6,7,8,5,4,9}, 
							{7,4,8,4,2,9,1,6,3},
							{6,5,2,7,8,1,3,9,4},
							{9,8,1,3,4,5,2,7,6},
							{3,7,4,9,6,2,8,1,5}};
 

		int iExpectedRegionNbr = 8;
		
		Sudoku puzzle = new Sudoku(myPuzzle);

		
		assertEquals(iExpectedRegionNbr, puzzle.getRegionNbr(6,7), 8);
	}
@Test
	
	public void getRegionNbr_test2() throws Exception {
		
		int[][] myPuzzle = {{8,3,5,4,1,6,9,2,7},
							{2,9,6,8,5,7,4,3,1},
							{4,1,7,2,9,3,6,5,8}, 
							{5,6,9,1,3,4,2,8,2},
							{1,2,3,6,7,8,5,4,9}, 
							{7,4,8,4,2,9,1,6,3},
							{6,5,2,7,8,1,3,9,4},
							{9,8,1,3,4,5,2,7,6},
							{3,7,4,9,6,2,8,1,5}};
 

		int iExpectedRegionNbr = 1;
		
		Sudoku puzzle = new Sudoku(myPuzzle);

		
		assertEquals(iExpectedRegionNbr, puzzle.getRegionNbr(1,1), 1);
	}
//Did not know how to test void methods
//Did not know how to use 'reflection' to write test methods for private methods

/*
@Test
	 

	public void setRegion_test1() throws Exception {
	
	int[][] startPuzzle = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	 
	Sudoku puzzle = new Sudoku(startPuzzle);
	
	System.out.println(Arrays.toString(puzzle.setRegion(2)));
	
	/*Expect result along the lines of {{0,0,0,0},
										{0,0,0,0},
										{3,4,0,0}
										{2,1,0,0}}
										*/
	 }
	 
/*	 @Test
	 

		public void setRegion_test2() throws Exception {
		
		int[][] startPuzzle = {{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		 
		Sudoku puzzle = new Sudoku(startPuzzle);
		
		System.out.println(Arrays.toString(puzzle.setRegion(4)));	
}
	/* @Test
	 

		public void ShuffleRegion_test1() throws Exception {
		
		int[][] startPuzzle = {{0,0,0,0},
				     		   {0,0,0,0},
				     		   {1,2,0,0}
				     		   {3,4,0,0}};
			
		 
//		Sudoku puzzle = new Sudoku(startPuzzle);
		
		//System.out.println(Arrays.toString(puzzle.shuffleRegion(2)));	
		
		/*Expect result along the lines of {{0,0,0,0},
						        			{0,0,0,0},
											{4,2,0,0}
											{3,1,0,0}}
		*/
		
		
	
	


	
	
	
	
		
	
