//5.9 Find and correct the error(s) in each of the following segments of code:
//a) while (i = 1; i <= 10, i+)
//System.out.println(i);


//The problem with this is that it was written as for loop and not while loop the while loop starts with initialization, then loop continuation condition, statement and increment.


public class CorrectTheError{
public static void main (String[]  args){

int i = 1;
while (i <= 10 ){
      System.out.printf("%d  ", i);
      i++;
}

    }
    }
