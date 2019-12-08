package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main (String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int random = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(random);
	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0
if(random==0) {
	System.out.println("yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if(random ==1 ) {
	System.out.println("No");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if(random == 2) {
	System.out.println("Maybe you should ask Google?");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if(random ==3) {
	System.out.println("Error 404");
}
	// -- write your own answer
}
}
