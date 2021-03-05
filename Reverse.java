import java.util.Scanner;

public class Reverse {

    public int min(float[][] array, int n){
        float minimum = array[0][0];
        int ind = 0;
        for(int i = 0; i < n; i++){
            if(array[i][i] < minimum){
                ind = i;
                minimum = array[i][i];
            }
        }
        return ind;
    }

    public int max(float[][] array, int n, int stolbec){
        float maximum = array[0][0];
        int ind = 0;
        for(int i = 0; i < n; i++){
            if(array[i][stolbec] > maximum){
                ind = i;
                maximum = array[i][stolbec];
            }
        }
        return ind;
    }



    public float[][] arr(float[][] array, int n){

        Scanner num = new Scanner(System.in);

        System.out.print("Номер столбца: ");
        int stolbec = num.nextInt();
        while (true){
            if(stolbec < n){
                break;
            }
            else{
                System.out.print("Номер введенного столбца должен быть меньше, чем " + n + ": ");
                stolbec = num.nextInt();
            }
        }
        int ind_max = max(array, n, stolbec);
        int ind_min = min(array, n);

        float save = array[ind_max][stolbec];

        array[ind_max][stolbec] = array[ind_min][ind_min];

        array[ind_min][ind_min] = save;


        return array;
    }





    public float[][] return_farr(int n){
        float [][] array = new float[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (float) Math.round((Math.random() * 30) + 1);
            }
        }
        System.out.println("До: ");
        for( int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        return array;
    }
}
