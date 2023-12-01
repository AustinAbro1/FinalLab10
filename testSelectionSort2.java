package lab102;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Austin Abro
class testSelectionSort2 {

	@Test
	public void test() {
		//testPositive();
		//testNegative();
		//testMixed();
		testDuplicates();
		}
	
	void testDuplicates() {
		SelectionSort2 sel = new SelectionSort2();
		int[] x = new int[5];
		x[0] = 1;
		x[1] = 2;
		x[2] = 5;
		x[3] = 4;
		x[4] = 4;
		
		int[] sorted = sel.basicSelectionSort(x);
		
		int[] sortedarr = new int[5];
		sortedarr[0] = 1;
		sortedarr[1] = 2;
		sortedarr[2] = 4;
		sortedarr[3] = 4;
		sortedarr[4] = 5;
		
		assertArrayEquals(sortedarr,sorted);	
	}
	
	void testMixed() {
		SelectionSort2 sel = new SelectionSort2();
		int[] x = new int[5];
		x[0] = -5;
		x[1] = 2;
		x[2] = -7;
		x[3] = 12;
		x[4] = 9;
		
		int[] sorted = sel.basicSelectionSort(x);
		
		int[] sortedarr = new int[5];
		sortedarr[0] = -7;
		sortedarr[1] = -5;
		sortedarr[2] = 2;
		sortedarr[3] = 9;
		sortedarr[4] = 12;
		
		assertArrayEquals(sortedarr,sorted);	
	}
	
	void testNegative() {
		SelectionSort2 sel = new SelectionSort2();
		int[] x = new int[5];
		x[0] = -3;
		x[1] = -5;
		x[2] = -1;
		x[3] = -11;
		x[4] = -4;
		
		int[] sorted = sel.basicSelectionSort(x);
		
		int[] sortedarr = new int[5];
		sortedarr[0] = -11;
		sortedarr[1] = -5;
		sortedarr[2] = -4;
		sortedarr[3] = -3;
		sortedarr[4] = -1;
		
		assertArrayEquals(sortedarr,sorted);	
	}
	
	void testPositive() {
		SelectionSort2 sel = new SelectionSort2();
		int[] x = new int[5];
		x[0] = 8;
		x[1] = 9;
		x[2] = 7;
		x[3] = 10;
		x[4] = 2;
		
		int[] sorted = sel.basicSelectionSort(x);
		
		int[] sortedarr = new int[5];
		sortedarr[0] = 2;
		sortedarr[1] = 7;
		sortedarr[2] = 8;
		sortedarr[3] = 9;
		sortedarr[4] = 10;
		
		assertArrayEquals(sortedarr,sorted);	
	}
	
	

}