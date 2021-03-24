
import java.util.LinkedList;
import java.util.Scanner;


public class Day_25_Runtime_Complexity {
    static void primeOrNotPrime(int numInput) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= numInput; i++) {
            if (numInput % i == 0) {
                list.add(i);
            }
        }
        String finalVal = list.size() == 2 ? "Prime" : "Not prime";
        System.out.println(finalVal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int numVal;

        while (T-- > 0) {
            numVal = input.nextInt();
            primeOrNotPrime(numVal);
        }
        input.close();
    }
}
