package p003;


/*Largest prime factor
*Problem 3
*The prime factors of 13195 are 5, 7, 13 and 29.

*What is the largest prime factor of the number 600851475143 ?
*/
public class Main {
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
