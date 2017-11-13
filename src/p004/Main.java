package p004;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
Largest palindrome product
Problem 4
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Main {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 100; i < 999; i++) {
            for (int j = 100; j < 999; j++) {
                int var = i*j;
                if(isPalindrom(var)) {
                    if(var > max)
                        max=var;
                }
            }
        }
        System.out.println(max);

    }

    private static boolean isPalindrom(int var) {
        ArrayList<Integer> val = new ArrayList<>();
       while(var > 0){
           val.add(var%10);
           var /= 10;
       }
        for (int i = 0; i < val.size(); i++) {
            if(!Objects.equals(val.get(i), val.get(val.size() - 1 - i)))
                return false;
        }
        return  true;
    }
}
