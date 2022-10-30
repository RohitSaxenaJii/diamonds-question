import java.util.*;

public class halfDaimond {

    public static Scanner scn = new Scanner(System.in);

    public static void tristars(int n) {
        int nsp = n - 1 ;
        int nst = 1;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nsp--;
            nst += 2;
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        tristars(scn.nextInt());
    }
}
