
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            
            // for upper half 
            for(int j = 2*i + 1; j <= 2*n - 1; j = j + 2){
                System.out.print(j);
            }
            int a = 1;
            for(int j = 0; j < i; j++){
                System.out.print(a);
                a += 2;
            }
            
            System.out.println();
           
            
        }
        
    }
    
}
