import java.util.*;

public class search
{

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter " + i + "th arr value");
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter a value to find");
        int data = scn.nextInt();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == data)
            {
                System.out.println("Data found at " + i);
                return;
            }
        }

        System.out.println("Data not found");
    }
}




