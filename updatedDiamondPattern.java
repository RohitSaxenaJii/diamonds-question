import java.util.*;
public class numDiamond{

    public static Scanner scn = new Scanner (System.in);
 
    public static void numberDiamond (int n) {
        int nsp = n/2;
        int nsd = 1;
        

        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            
            int val = row;
            if (row > (n/2) + 1){
                val = n - row + 1;
            }
            for (int csd = 1; csd <= nsd; csd++) {
                System.out.print(val + "\t");
                if (csd <= nsd/2) {
                    val++;
                }
                else {
                    val--;
                }
            }

            if (row <= n/2) {
                nsd += 2;
                nsp--;
            }
            else {
                nsd -= 2;
                nsp++;
            }

            System.out.println("\t");
        }
    }
public static void main (String[] args) {
    numberDiamond(scn.nextInt());
}
}
