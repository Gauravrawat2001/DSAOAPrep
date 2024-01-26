
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        for(int i = 0; i < size; i++){
            list.add(scn.nextInt());
            
        }
        
        // for printing list
        for(int i = 0; i < size; i++){
            System.out.println(list.get(i));
        }
        // for adding new value
        list.add(2,90);
        System.out.println("new value add");
        for(int i = 0; i < size+1; i++){
            System.out.println(list.get(i));
        }
        
        // for setting a updating a value
        list.set(2,100);
           System.out.println("at index to 90 is replaced by 100");
        for(int i = 0; i < size+1; i++){
            System.out.println(list.get(i));
        }
        
        list.remove(2);
         System.out.println("index 2 value is deleted");
        for(int i = 0; i < size; i++){
            System.out.println(list.get(i));
        }
        
        
        
        
        }
        
         
        
    }
    

