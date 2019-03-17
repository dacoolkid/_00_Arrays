package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		
		//1. make an array of 5 Strings
 String[] newArray = new String[5];
 	newArray[0] = "Bob";
 	newArray[1] = "Bob";
 	newArray[2] = "Bob";
 	newArray[3] = "Bob";
 	newArray[4] = "Bob";

		//2. print the third element in the array
System.out.println(newArray[2]);
		//3. set the third element to a different value
newArray[2] = "Joe";
		//4. print the third element again
		System.out.println(newArray[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i<newArray.length;i++) {
			newArray[i] = "mrcameron";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}
		
		//7. make an array of 50 integers
		int[] bigArray = new int[50];
		

		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i<bigArray.length;i++) {
			bigArray[i] = (int) (Math.random()*100);
		}
		int biggy = bigArray[0];
		//9. without printing the entire array, print only the smallest number on the array
for(int i = 0; i<bigArray.length;i++) {
	System.out.println(bigArray[i]);
	if (biggy > bigArray[i]) {
		biggy = bigArray[i];
	}
	}
System.out.println("biggest number" + biggy);

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
