import java.util.*;

public class rotate90
{
    public static void main(String[] args)
    {
        int[][] arr = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
        };

        // transpose
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr[0].length; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // reverse each row
        for(int i = 0; i < arr.length; i++)
        {
            int l = 0;
            int r = arr[0].length - 1;

            while(l < r)
            {
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }
        }

        // display
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}





