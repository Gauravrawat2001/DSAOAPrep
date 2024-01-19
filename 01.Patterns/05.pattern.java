/*Print the following pattern for the given N number of rows.
Pattern for N = 4
  * * * 1
  * * 1 2
  * 1 2 3
  1 2 3 4 

 */
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int i = 1; i <= n; i++){
          // for spaces
          for(int j = 0; j < n - i; j++){
              System.out.print(" ");
          }
          
          // for stars
          int str = 1;
          for(int j = 0; j < i; j++){
              System.out.print(str);
              str++;
          }
          
          System.out.println();
       }
     
  }
 
  
}
