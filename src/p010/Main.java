package p010;

public class Main {
//    Summation of primes
//    Problem 10
//    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//    Find the sum of all the primes below two million.
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 2; i < 2000000; i++) {
            if(isPrime(i)) {
                sum += i;
            }

        }
        System.out.println(sum);
    }
    static boolean isPrime(int val){
        if(val == 2)
            return true;
        if(val %2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(val); i++) {
            if(val % i == 0) {
                return false;
            }
        }
        return true;
    }
}
