// Write a program which prints the integers 
// from 1 to a number given by the user.

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        // p1
        System.out.println("Where to? ");
        int to = Integer.valueOf(scanner.nextLine());
        // p2
        System.out.println("Where from? ");
        int from = Integer.valueOf(scanner.nextLine());
    
        // check if upper limit (to) is smaller than starting (from), if T dont print
    
        if (to >= from) {
    
            for (int i = from; i <= to; i++) {
    
                System.out.println(i);
        
            }
    
        }
    
        scanner.close();
    
    }

}