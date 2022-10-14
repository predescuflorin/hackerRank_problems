import java.util.Scanner;

public class bigSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long sum = 0;
        long[] ar = new long[ n];
        for (int i = 0; i<n; i++) {
            ar[i] = scan.nextLong();
            sum+=ar[i];

        }
        System.out.println(sum);
    }
}
