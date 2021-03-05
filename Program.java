import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scalyar  array = new Scalyar();
        Scanner num = new Scanner(System.in);
        System.out.print("n = ");
        int n = num.nextInt();
        float [][]arr = array.return_farr(n);
        float [][]arr2 = array.arr(arr, n);
        System.out.println("После скалярного произведения: ");
        for (int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
