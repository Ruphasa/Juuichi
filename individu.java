import java.util.Scanner;

public class individu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.print("Masukan Nilai n : ");
        n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Masukan Nilai n : ");
        n = sc.nextInt();
        String N=String.valueOf(n);
        for (int i = 0; i < n; i++) {
            System.out.print(n+" ");
        }
        System.out.println();
        for (int i = 0; i < n-2; i++) {
            System.out.print(n+" ");
            for (int j = 0; j <n-2; j++) {
                System.out.print(" ".repeat(N.length()+1));
            }
            System.out.print(n);
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(n+" ");
        }
    }
}
