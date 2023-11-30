package tower_of_hanoi;

import java.util.Scanner;

public class Tower_of_Hanoi {

    static int i = 1;
    
    static void towerOfHanoi(int n, char source, char helper, char target) {
        if (n == 1) {
            System.out.format("%03d : Take disk 1 from %c to %c\n", i, source, target);
            i++;
            return;
        }

        towerOfHanoi(n - 1, source, target, helper);
        System.out.format("%03d : Take disk %d from %c to %c\n", i, n, source, target);
        i++;
        towerOfHanoi(n - 1, helper, source, target);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input n : ");
        int n = input.nextInt();
        
        if (n <= 0){
            System.err.println("Wrong n.");
            return;
        }
            
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
