import java.util.Scanner;
public class main {

    private static void sort(int a, int i) {

        int n;
        int a;
        int i;
        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            n = num.nextInt();
            for (i = 0; i < n; i++) {
                System.out.print("Enter a[i]: ");
                a = num.nextInt();
                sort(a + n, a);
            }
        }
        for(i=0; i<n; i++){
            System.out.println(" "+ a);

        }
        return n;
    }

    private static void sort(int a, int i) {
    }
}