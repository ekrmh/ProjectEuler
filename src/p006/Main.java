package p006;

public class Main {
    public static void main(String[] args) {
        long sum1 = 0;
        long sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 += i*i;
            sum2 += i;
        }
        System.out.println(sum2*sum2-sum1);
    }
}
