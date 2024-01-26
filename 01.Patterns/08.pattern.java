// Note: N is always odd.
// Pattern for N = 5

//   *
//  ***
// *****
//  ***
//   *    

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //  for rows - upper half
        int x = n/2 + 1;
        for(int i = 0; i < x; i++){
        
                // for spaces 
                for(int j = 0 ; j < x - i - 1; j++){
                    System.out.print(" ");
                }

                // for stars
                for(int j = 0; j < 2*i + 1; j++){
                    System.out.print("*");
                }
                System.out.println();
            
        }
        // for lower half 
        int y = n - x;
        for(int i = 1; i <= y; i++){
            // for spaces 
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            
            // for stars 
            for(int j = 1; j <= n - (2 * i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}