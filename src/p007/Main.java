package p007;

public class Main {
//    10001st prime
//    Problem 7
//    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//    What is the 10 001st prime number?
    public static void main(String[] args) {
        long i = 1;
        int count = 0;
        long found = 0;
        while(count != 10001){
            for (int j = 2; j <= i; j++) {
                if( i-1 == j){
                    count++;
                    if(count == 10001)
                        found = i;
                    break;
                }

                if(i%j==0)
                    break;
            }



            i++;

        }

        System.out.println(found);
    }
}
