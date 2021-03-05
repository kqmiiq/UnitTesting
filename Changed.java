import java.util.Scanner;



public class Changed {
    public float[][] arr(float[][] array, int n, int m){

        Scanner num = new Scanner(System.in);

        System.out.print("Введите один из элементов вышестоящей матрицы: ");
        float k1 = num.nextFloat();
        int ind_k1_i = 0;
        int ind_k1_j = 0;
        while (true){
            int h = 0;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    if(array[i][j] == k1){
                        h++;
                        ind_k1_i = i;
                        ind_k1_j = j;
                    }
                }
            }
            if(h == 0){
                System.out.print("Введите один ИЗ ЭЛЕМЕНТОВ ВЫШЕСТОЯЩЕЙ МАТРИЦЫ!!! ");
                k1 = num.nextFloat();
            }
            else{
                break;
            }
        }

        System.out.print("Введите еще один из элементов вышестоящей матрицы: ");
        float k2 = num.nextFloat();
        int ind_k2_i = 0;
        int ind_k2_j = 0;
        while (true){
            int h = 0;
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    if(array[i][j] == k2){
                        h++;
                        ind_k2_i = i;
                        ind_k2_j = j;
                    }
                }
            }
            if(h == 0){
                System.out.print("Введите еще один ИЗ ЭЛЕМЕНТОВ ВЫШЕСТОЯЩЕЙ МАТРИЦЫ!!! ");
                k2 = num.nextFloat();
            }
            else{
                break;
            }
        }

        float save = array[ind_k1_i][ind_k1_j];

        array[ind_k1_i][ind_k1_j] = array[ind_k2_i][ind_k2_j];
        array[ind_k2_i][ind_k2_j] = save;

        return array;
    }

    public int sum(float[][] array, int n, int m){

        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(array[i][j] > i + j){
                    count++;
                }
            }
        }

        return count;
    }

    public float[][] return_farr(int n, int m){
        float [][] array = new float[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (float) Math.round((Math.random() * 300) + 1);
            }
        }
        System.out.println("До: ");
        for( int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }


}
