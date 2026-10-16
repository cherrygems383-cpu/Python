    import java.util.Scanner;
    public class WordPlay {
      public static void main (String[] args){
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a word  ");
          String word = input.nextLine();
                  String reverse = "  ";
             
              int counter= 0; 
              char [] vowels = {'a', 'e', 'i', 'o', 'u'};

                  for (int i = word.length - 1;  i >= 0;  i -- ){
                        for (int count = 0; count < vowels.length; count++){
                                if (word.charAt(i)== vowels[count])
                                counter++;
                                }
                              for (int i =)  
                                
                                
                                
                                
                                
//if (word.charAt(i)!==vowels[count]){ 
                          //  System.out.print("consonant " + word.charAt(i) )
                         
                  }

                System.out.println("Reversed:  " + reverse );
                System.out.println("Vowels:  " + counter);
                 


}
  }





