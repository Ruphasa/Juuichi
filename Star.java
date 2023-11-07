import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        System.out.print("Masukan nilai N = ");
        n = sc.nextInt();
        for (int i = 1; i > n; i--) {
            System.out.print("*");
        }
        System.out.println("\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}