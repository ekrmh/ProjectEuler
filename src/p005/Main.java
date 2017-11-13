package p005;

public class Main {

    public static void main(String[] args) {
        int myValue = 20;
        boolean found = false;
        while (!found){
            myValue++;
            for (int i = 1; i < 20; i++) {
                if(myValue % i != 0) {
                    found = false;
                    break;
                }
                else {
                    found = true;
                }
            }


        }
        System.out.println(myValue);
    }
}
