package p014;


public class Main {
//    Longest Collatz sequence
//    Problem 14
//    The following iterative sequence is defined for the set of positive integers:
//
//    n → n/2 (n is even)
//    n → 3n + 1 (n is odd)
//
//    Using the rule above and starting with 13, we generate the following sequence:
//
//            13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
//    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//    Which starting number, under one million, produces the longest chain?
//
//    NOTE: Once the chain starts the terms are allowed to go above one million.


    public static void main(String[] args) {
    int chain = 0;
    int max = 0;

    for (int i = 10; i < 1000000; i++) {
        int count = 0;
        long val = i;
        while(val > 1){
            if(val%2 == 0)
                val /= 2;
            else
                val = (3*val) + 1;
            count++;

        }

        if(count > chain) {
            chain = count;
            max = i;
        }
    }
    System.out.println(max);
}

}
