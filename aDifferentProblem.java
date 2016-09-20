import java.util.Scanner;

/**
 * Created by bjdufre1 on 9/20/2016.
 */
public class aDifferentProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = 0;
        long b = 0;
        while(sc.hasNextLong()) {
            a = sc.nextLong();
            b = sc.nextLong();
            if (a > b) {
                System.out.println(a - b);
            } else {
                System.out.println(b - a);
            }
        }
    }
}
