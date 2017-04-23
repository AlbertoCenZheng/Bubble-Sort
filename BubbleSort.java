
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
	
	

	//Sort an unsorted list with Bubble sort;
	//take in an array as argument;
	public static void BubbleSort(int[] myArray) {
		// sort the myArray; BUBBLE SORT;
		for (int i = 1; i < myArray.length; i++) {
			int j = i;
			//compare to the rest of the sorted list;
			while (j >= 1) {
				//test if the sorted list is greater that the current item;
				if (myArray[j - 1] > myArray[j]) {
					int temp = myArray[j];
					myArray[j] = myArray[j - 1];
					myArray[j - 1] = temp;
				}
				j--;
			}
		}
	}
	
	
	//method for printing out the array(traverse through the list)
	//take in an array as argument;
	public static void printArray(int[] myArray) {
		// print out the array
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i]);
			//to separate the number;
			//to make it looks clearer;
			if (i < myArray.length - 1)//because of there is nothing more after the last item
									   //no need to print out the last one;
				System.out.print("->");
		}

	}


    //main method (testing)
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []myArray = new int[10]; //create and initialize the size of the array;
		randomPopulate(myArray);    //populate the array
		printArray(myArray);        // print the unsorted list
		BubbleSort(myArray);        //Sort with bubble sort
		System.out.println(""); 		// line break;
		printArray(myArray);       //print the sorted list
	}
}
