package tower_of_hanoi;

public class Tower_of_Hanoi {

    static void towerOfHanoi(int n, char source, char helper, char target) {
        if (n == 1) {
            System.out.println("Take disk 1 from " + source + " to " + target);
            return;
        }
        towerOfHanoi(n - 1, source, target, helper);
        System.out.println("Take disk " + n + " from " + source + " to " + target);
        towerOfHanoi(n - 1, helper, source, target);
    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
