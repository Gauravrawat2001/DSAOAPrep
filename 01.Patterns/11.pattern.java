// sum pattern
/* 
  n = 3
  1 = 1
  1 + 2 = 3
  1 + 2 + 3 = 6
 */

 import java.util.*;
import java.io.*;
public class MyClass {
    public static void main(String args[]) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       // parallelogram pattern 
       for(int i = 0 ; i < n; i++){
           int sum = 0;
           for(int j = 1; j <= i + 1; j++){
               System.out.print(j);
               if(j < i + 1){
                   System.out.print("+");
               }
               sum += j;
           }
           System.out.println("="+sum);
           
           
       }
     }
  }


