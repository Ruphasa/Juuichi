import java.util.Scanner;

public class NestedLoop_2341720143 {
    public static void main(String[] args) {
        double[][] array = new double[5][7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                array[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        int i=1;
        for (double[] barisArray : array) {
            int jumlah=0;
            System.out.print("kota ke-"+i+": ");
            for (double kolomArray : barisArray) {
                System.out.print(kolomArray+" ");
                jumlah+=kolomArray;
            }
            System.out.printf("\nRata - rata kota ke-"+i+" = %.3f",((double)jumlah/barisArray.length));
            System.out.println();
            i++;
        }
        // for (int i = 0; i < array.length; i++) {
        //     System.out.print("Kota ke-" + (i + 1) + ": ");
        //     for (int j = 0; j < array[0].length; j++) {
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
