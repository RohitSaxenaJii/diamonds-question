import java.util.*;
public class digits_of_a_no{

public static Scanner scn = new Scanner(System.in);

public static int pow(int n){
    int pow = 1;   // initialize power by 1;
    while (n != 0){    //start a while loop till n is not equals to 0;  
        n /= 10;  // in  the while loop divide the input or n by 10 reduce the number from last (or pop the number from last) by every step till n is not equals to 0;
        pow *= 10;  // simultaneously increase the power in every step by multiplying power by 10;
    }

    return pow;
}
public static void actualDig(int n){
    int a = pow(n);
    int quo = 0;
    while (a != 0){
        quo = n / a;
        n = n % a;
        a = a / 10;
        System.out.println(quo);
    }
}

public static void main(String[] args){
    actualDig(scn.nextInt());
}
}
