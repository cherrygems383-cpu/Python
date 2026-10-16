import java.util.Scanner;

public class GreatThings{
    public static void main (String[]  args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number  ");
        int num = input.nextInt();
        int number = counter (num);
        
        }
        
        
        public static int counter (int number){
        int count = 1;
          for (int index = 1; index<= number; index++){
          
                     System.out.println(count);
          }
          count++;
          }
        

        
        
        
        
        
        
        
        
        }

