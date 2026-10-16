public class  Chapter2 {
	public static void main(String... args) {

String exercise = """
2.7
Fill in the blanks in each of the following statements:


a) (Comments )
are used to document a program and improve its readability.



b) A decision can be made in a Java program with a (n)
. and


c) The arithmetic operators with the same precedence as mu2.13 What is the output that will be printed after execution of the following Java code snippet?
Explain why.
int p = 5;
System.out.printf("%d", p + 2 * 4);
System.out.printf("%d", p * 2 + 4);ltiplication are
. (*)

d) When parentheses in an arithmetic expression are nested, the () set of parentheses is evaluated first.

e) A location in the computer’s memory that may contain different values at various times 
throughout the execution of a program is called a(n) 
variable 





2.8  
Write Java statements that accomplish each of the following tasks:
a) Display the message "Enter an integer: ", leaving the cursor on the same line.

import java.util.Scanner; 
public  class Display{
public static void main (String[]  args){
Scanner input = new Scanner (System.in);
System.out.print("Enter an integer: ");
int number = input.nextInt();




b) Assign the product of variables b and c to the int variable a.

int a = b*c


2.9  
State whether each of the following is true or false. If false, explain why.
a) Addition is executed first in the following expression: a * b / (c + d) * 5.

True 


b) The following are all valid variable names: AccountValue, $value, value_in_$, ac-
count_no_1234, US$, her_sales_in_$, his_$checking_account, X!, _$_, a@b, and
_name.

True 

c) In 2 + 3 + 5 / 4, addition has the highest precedence.

false. The division has the highest precedence.


d) The following are all invalid variable names: name@email.com, 87, x%, 99er, and 2_.

False 



2.10
Assuming that x = 5 and y = 1, what does each of the following statements display?
a) System.out.printf("x = %d%n", x + 5);
b) System.out.printf("Value of %d *%d is %d\n", x, y, (x * y) );
c) System.out.printf("x is %d and y is %d", x, y);
d) System.out.printf("%d is not equal to %d\n", (x + y), (x * y) );

(a)




2.11 
Which of the following Java statements contain variables whose values are not modified?
a) int m = (p + 2) + 3;
b) System.out.println("m = m + 1");
c) int m = p / 2;
d) int j = k + 2;

(a)



2.12  Given that y = ax2 + 5x + 2, which of the following are correct Java statements for this equation?
a) y = a * x * x + 5 * x + 2;
b) y = a * x * x + (5 * x) + 2;
c) y = a * x * x + 5 * (x + 2);
d) y = a * (x * x) + 5 * x + 2;
e) y = a * x * (x + 5 * x) + 2;
f) y = a * (x * x + 5 * x + 2);

(a)

2.13   
What is the output that will be printed after execution of the following Java code snippet?
Explain why.
int p = 5;
System.out.printf("%d", p + 2 * 4);
System.out.printf("%d", p * 2 + 4);

13
14
multiplication has a higher precedence than addition and subtraction 


