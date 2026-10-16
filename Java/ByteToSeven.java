public class ByteToSeven {
public static void main (String[]  args){

//                         0    1     2    3  4  5  6  7  8  9
int[] numbers = {11, 22, 43, 4, 5, 6, 7, 8, 9, 10};

int sum = 0;
int average = 0;
//       start               stop                   step      
for (int i = 0;   i < numbers.length;   i++){
    sum = sum + numbers[i];

    }  
 System.out.println("sum " + sum);
average = sum / numbers.length;

 System.out.println("average " + average);





}

}
