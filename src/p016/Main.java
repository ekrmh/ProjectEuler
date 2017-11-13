package p016;

import java.math.BigInteger;

public class Main {
//    215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//
//    What is the sum of the digits of the number 2^1000?
    public static void main(String[] args) {
        BigInteger value = new BigInteger("2").pow(1000);
        BigInteger sum = BigInteger.ZERO;
        while(!value.equals(BigInteger.ZERO)){
            sum = sum.add(value.mod(BigInteger.TEN));
            value = value.divide(BigInteger.TEN);
        }
        System.out.println(sum);
    }
}
