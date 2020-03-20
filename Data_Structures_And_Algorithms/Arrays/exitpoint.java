import java.util.*;

public class exitpoint 
{
    public static void main(String[] args)
    {
        int[][] arr = {
            {0, 0, 1, 0},
            {1, 1, 0, 0},
            {0, 1, 0, 0},
            {1, 0, 1, 0}
        };

        int dir = 0; // 0123 - eswn
        int i = 0;
        int j = 0;

        while(true)
        {
            dir = (dir + arr[i][j]) % 4;
            if(dir == 0) // e
            {
                j++;
                if(j == arr[0].length)
                {
                    j--;
                    System.out.println(i + "" + j);
                    break;
                }
            }
            else if(dir == 1) // s
            {
                i++;  
                if(i == arr.length)
                {
                    i--;
                    System.out.println(i + "" + j);
                    break;
                }          
            }
            else if(dir == 2) // w
            {
                j--;
                if(j == -1)
                {
                    j++;
                    System.out.println(i + "" + j);
                    break;
                }
            }
            else if(dir == 3) // n
            {
                i--;
                if(i == -1)
                {
                    i++;
                    System.out.println(i + "" + j);
                    break;
                }
            }
        }
    }
}