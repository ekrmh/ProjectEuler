package p025;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
//    The Fibonacci sequence is defined by the recurrence relation:
//    Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
//    Hence the first 6 terms will be
//    F1 = 1
//    F2 = 1
//    F3 = 2
//    F4 = 3
//    F5 = 5
//    F6 = 8
//    F7 = 13
//
//    The 7th term, F7, is the first term to contain two digits.
//
//    What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
    public static void main(String[] args) {
        ArrayList<BigInteger> fibonacci = new ArrayList<>();
        fibonacci.add(BigInteger.ZERO);
        fibonacci.add(BigInteger.ONE);
        int i=2;
        while(true){
            BigInteger val = fibonacci.get(i-1).add(fibonacci.get(i-2));
            if(String.valueOf(val).length() == 1000){
                System.out.println(i);
                break;
            }
            fibonacci.add(i,val);
            i++;

        }
    }


}
