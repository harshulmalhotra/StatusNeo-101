import java.util.*;

public class kadanes 
{
    public static void main(String[] args)
    {
        int[] arr = {-4, -2, -8, -1, -9};

        int ci = 0;
        int cj = 0;
        int cs = arr[0];

        int bi = 0;
        int bj = 0;
        int bs = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(cs > 0)
            {
                cj++;
                cs = cs + arr[i];
            }
            else
            {
                ci = i;
                cj = i;
                cs = arr[i];
            }

            if(cs > bs)
            {
                bi = ci;
                bj = cj;
                bs = cs;
            }
        }

        for(int i = bi; i <= bj; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}




