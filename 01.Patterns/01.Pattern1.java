import java.util.*;
import java.io.*;
public class MyClass {
  /*Question 1.
  for n=3     
   pattern is 
    1
    2 2
    3 3 3 */

    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      for(int i = 1; i <= n; i++){
          for(int j = 1; j <=i; j++){
              System.out.print(i + " ");
          }
          System.out.println();
      }

      
    }
}