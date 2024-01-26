// Parallelogram pattern 
/* n = 4 
    ****
     ****
      ****
       ****
 */

import java.util.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       // parallelogram pattern 
       for(int i = 0 ; i < n; i++){
           // for spaces
           for(int j = 0; j <= i; j++){
               System.out.print(" ");
           }
           // for stars
           for(int j = 0; j < n; j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
