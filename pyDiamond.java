import java.util.*;
public class pyDiamond {

    public static Scanner scn = new Scanner (System.in);
 
    public static void pattern (int n) {
        int nsp = n - 1;
        int nst = 1;
        // int val = row;

        for (int row = 1; row <= n; row++) {

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            int val = row;

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + "\t");
                if (cst <= nst/2) {
                    val++;
                }
                else {
                    val--;
                }
            }
            nsp--;
            nst += 2;
            System.out.println("\t");

        }
    }


public static void main (String[] args) {
    pattern(scn.nextInt());
}
}
