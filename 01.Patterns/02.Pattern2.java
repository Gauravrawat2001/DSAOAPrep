import java.util.*;
import java.io.*;
public class MyClass {
    /* Pattern for N = 3
      A
      BB
      CCC
 */
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      for(int i=0;i<n;i++)
         {
             for(int j=0;j<=i;j++)
                 {
                     System.out.print((char)(i+65)+" ");
                 }
             System.out.println();
         }
    }
}