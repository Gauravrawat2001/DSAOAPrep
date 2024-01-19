/*Q2.Print the following pattern for the given number of rows.
Pattern for N = 5
E
D E
C D E
B C D E
A B C D E
 */

 import java.util.*;
 import java.io.*;
 public class MyClass {
   public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         
         for(int i = 0; i < n; i++){
             int x = n - i;
             for(int j = 0; j <= i; j++){
                 
                 System.out.print((char)(65 + x - 1)+" ");
                 x++;
             }
             System.out.println();
         }
         
       
     }
 }