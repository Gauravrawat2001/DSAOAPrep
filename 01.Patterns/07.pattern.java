// Pattern for N = 4
//    1
//   232
//  34543
// 4567654    

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            // for spaces
            for(int j = n - i; j > 0; j--){
                System.out.print(" ");
            }
            
            // for stars
            int x = i;
            for(int j = 0; j < 2*i - 1; j++){
                if(j < (2*i - 1)/2){
                System.out.print(x);
                x++;
                }else{
                    System.out.print(x);
                    x--;
                }
            }
            
            System.out.println();
        }
    }
}
