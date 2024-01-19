import java.util.*;
import java.io.*;
public class MyClass {
    /* Print the following pattern for the given N number of rows.
       Pattern for N = 4
       A
       B C
       C D E
       D E F G

 */
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
      for(int i=0;i<n;i++)
         {
             int x = i;
             for(int j=0;j<=i;j++)
                 {
                     
                     System.out.print((char)(x+65)+" ");
                      x++;
                 }
             System.out.println();
         }