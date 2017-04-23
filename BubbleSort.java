
/**
 *
 * @author Alberto Cen Zheng
 * April 16th 2017
 * 
 * CSI213
 * Dr.Magnus
 * 
 * Sorting method: Bubble sort
 *
 */

import java.util.Random;

public class BubbleSort {

	//populate the deck with random number;
	//take in an array as argument;
	public static void randomPopulate(int[]myArray){
		
		// random;
		Random something = new Random();
		
		// populate the array
		for (int i = 0; i < myArray.length; i++)
			myArray[i] = something.nextInt(10);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
}
