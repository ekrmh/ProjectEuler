package p003;


/*Largest prime factor
*Problem 3
*The prime factors of 13195 are 5, 7, 13 and 29.

*What is the largest prime factor of the number 600851475143 ?
*/
public class Main {
    public static void main(String[] args) {
        long var =600851475143L;
        int max = 1;
        for (int i = 2; i < var; i++) {
            if(isPrime(i)){
                if(var % i == 0){
                    var = var/max;
                    max = i;
                }
            }
        }
        System.out.println(max);
    }
    static boolean isPrime(int val){
        if(val == 2)
            return true;
        if(val % 2 == 0)
            return false;
        for (int i = 3; i*i <= val ; i++) {
            if(val%i == 0)
                return false;
        }
        return true;
    }
}
