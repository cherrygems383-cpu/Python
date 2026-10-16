

//int [] numbers = {5, 7, 2, 4, 6,}

//for (int i = 0; i < 5; i++){
  //  if (number) 

//write a program that takes in two integers from the user and swaps the values.
//e.g first number10 second number 14
//after swapping first number 14 second number 10

//pseudocode 
//obtain number from the user 
//store it in a variable 

import java.util.Scanner;
public class NumberSwap {
public static  void main (String[]  args){
Scanner input = new Scanner(System.in);


System.out.print ("Enter number one ");
  int number1 = input.nextInt() ; 
  System.out.print ("Enter number two ");
  int number2 = input.nextInt() ; 
  
number1 = number1 + number2 ;
number2 =number1 - number2;
number1 = number1 - number2;
  
  System.out.println(number1);
  System.out.println(number2);

}
    }
