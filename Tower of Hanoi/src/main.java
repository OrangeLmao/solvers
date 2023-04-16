//Pranav Saran
//Period 4

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many disks do you have?");
        int disks = sc.nextInt();
        sc.nextLine();

        towerOfHanoi(disks, 'A', 'C', 'B');

}
//AI !!!!
    public static void towerOfHanoi(int a, char orig_rod, char final_rod, char helper_rod) {
        if (a == 1)
            System.out.println("Take disk 1 from rod " + orig_rod + " to rod " + final_rod);
        else {
            towerOfHanoi(a - 1, orig_rod, helper_rod, final_rod);
            System.out.println("Take disk " + a + " from rod " + orig_rod + " to rod " + final_rod);
            towerOfHanoi(a - 1, helper_rod, final_rod, orig_rod);
        }
    }
}

