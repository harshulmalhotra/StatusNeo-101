import java.util.*;

//Add two numbers represented by two arrays
//eg. a[] = { 1, 2, 3 }
//b[] = { 2, 1, 4 }
//Output : 337
//123 + 214 = 337

public class sumofarrays
{

    public static void main(String[] args)
    {
        int[] n1 = {9, 7, 2, 9};
        int[] n2 = {9, 9, 9, 9, 8, 8};
        int[] sum = new int[n1.length >= n2.length? n1.length + 1: n2.length + 1];

        // fill sum array
        int i = n1.length - 1;
        int j = n2.length - 1;
        int k = sum.length - 1;
        int carry = 0;

        while(k >= 0)
        {
            int var = carry;
            if(i >= 0)
            {
                var = var + n1[i];
            }

            if(j >= 0)
            {
                var = var + n2[j];
            }

            int digit = var % 10;
            carry = var / 10;

            sum[k] = digit;

            i--;
            j--;
            k--;
        }


        // fill summ array

        for(i = 0; i < sum.length; i++)
        {
            if(i == 0 && sum[i] == 0)
                continue;

            System.out.print(sum[i]);
        }
        System.out.println();
    }
}