import java.util.Scanner;

public class angryProfessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a[] =new int[n];
        int count = 0;

        for (int i=0; i<n; i++){
             a[i] = scanner.nextInt();
             if (a[i] <=0) count++;
        }

        if (count>= k) System.out.println(" NO");
        else System.out.println("YES");

    }
}
