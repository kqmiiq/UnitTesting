import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Changed  array = new Changed();
        Scanner num = new Scanner(System.in);
        System.out.print("n = ");
        int n = num.nextInt();
        System.out.print("m = ");
        int m = num.nextInt();


        float [][]arr2 = array.arr(array.return_farr(n, m), n, m);
        int summa = array.sum(arr2, n, m);

        System.out.println("Сумма элементов, удовлетворяющих условие Aij > i + j: " + summa);
        System.out.println("После: ");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
