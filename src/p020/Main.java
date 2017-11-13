package p020;

import java.math.BigInteger;

public class Main {
//    n! means n × (n − 1) × ... × 3 × 2 × 1
//
//    For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
//    and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
//
//    Find the sum of the digits in the number 100!
    public static void main(String[] args) {
        BigInteger val = factorial(new BigInteger("100"));

        System.out.println(sumDigits(val));

    }

    private static BigInteger sumDigits(BigInteger val) {
        BigInteger sum = BigInteger.ZERO;
        while (!val.equals(BigInteger.ZERO)){
            sum = sum.add(val.mod(BigInteger.TEN));
            val = val.divide(BigInteger.TEN);
        }
        return sum;
    }

    private static BigInteger factorial(BigInteger i) {
        if(i.equals(BigInteger.ONE))
            return BigInteger.ONE;
        return i.multiply(factorial(i.subtract(BigInteger.ONE)));
    }
}
