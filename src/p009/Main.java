package p009;

public class Main {
//    Special Pythagorean triplet
//    Problem 9
//    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//    a2 + b2 = c2
//    For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//    Find the product abc.
public static void main(String[] args) {
    for (int c = 1; c < 999; c++) {
        for (int b = 1; b < c; b++) {
            for (int a = 0; a < b; a++) {
                if((a+b+c) == 1000 && Math.pow(c,2) == (Math.pow(a,2)+ Math.pow(b,2))){
                    System.out.println("a : "+ a);
                    System.out.println("b : "+ b);
                    System.out.println("c : "+ c);
                    System.out.println(a*b*c);
                }

            }
        }
    }
}
}
