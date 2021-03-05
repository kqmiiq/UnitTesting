import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ScalyarTest {
    @Test
    public void arr() throws Exception{

        Scalyar  array = new Scalyar();
        Scanner num = new Scanner(System.in);
        System.out.print("n = ");
        //int n = num.nextInt();
        int n = 5;
        float [][]actuals = array.return_farr(n);

        float minimum = actuals[0][0];
        float maximum = actuals[0][0];
        int index_of_min = 0, index_of_max = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(maximum < actuals[i][j]){
                    maximum = actuals[i][j];
                    index_of_max = i;
                }
                if(minimum > actuals[i][j]){
                    minimum = actuals[i][j];
                    index_of_min = j;
                }
            }
        }

        float [] mas = new float[n];
        for(int i = 0; i < n; i++){
            mas[i] = actuals[index_of_max][i] * actuals[i][index_of_min];
        }

        float [][]expected = array.arr(actuals, n);

        assertArrayEquals(expected[index_of_max], mas);
    }
}