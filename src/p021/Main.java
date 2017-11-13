package p021;

import java.util.HashSet;
import java.util.Set;

public class Main {
//    Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
//    If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.
//
//    For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
//
//    Evaluate the sum of all the amicable numbers under 10000.
public static void main(String[] args) {
    long time = System.currentTimeMillis();
    int count = 0;
    int sum = 0;
    for (int i = 0; i < 10000; i++) {
        int a1 = divisors(i);
        int a2 = divisors(a1);
        if(i == a2 && i != a1){
            System.out.println(
                    "i : " + i + " a1 = divisors(i) : " + a1 + " a2 = divisors(a2) : " + a2
            );
            count++;
            sum += i;
        }
    }
    System.out.println("Count : " +count);
    System.out.println("Sum : " +sum);
    System.out.println("Time : "+(System.currentTimeMillis()-time));
}

    private static int divisors(int i) {
        int sum = 0;
        for (int j = 1; j < i/2+1; j++) {
            if(i % j == 0){
                sum +=j;
            }
        }
        return sum;
    }
}
