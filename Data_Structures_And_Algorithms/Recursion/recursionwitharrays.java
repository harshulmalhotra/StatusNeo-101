import java.util.*;

public class recursionwitharrays
{
    // expectation => 10 20 30 40 50
    // faith => 20 30 40 50
    // 
    public static void display(int[] arr, int idx) // idx to end
    {
        if(idx == arr.length)
        {
            return;
        }
        System.out.println(arr[idx]); // idx
        display(arr, idx + 1);// idx + 1 to end
    }

    public static void displayR(int[] arr, int idx)
    {
        if(idx == arr.length)
        {
            return;
        }
        
        displayR(arr, idx + 1);// idx + 1 to end
        System.out.println(arr[idx]); // idx
    }


    // expectation => will compare all from idx to end
    // faith => will compare all from idx + 1 to end
    public static int max(int[] arr, int idx)
    {
        if(idx == arr.length - 1)
        {
            return arr[idx];
        }
        
        int misa = max(arr, idx + 1);
        if(misa > arr[idx])
        {
            return misa;
        }
        else
        {
            return arr[idx];
        }
    }

    public static boolean lsearch(int[] arr, 
                                  int idx, int key)
    {
        if(idx == arr.length)
        {
            return false;
        }

        if(arr[idx] == key)
        {
            return true;
        }
        else
        {
            boolean fisa = lsearch(arr, idx + 1, key);
            return fisa;
        }
    }

    public static int firstIndex(int[] arr, 
                                 int idx, int key)
    {
        if(idx == arr.length)
        {
            return -1;
        }

        if(arr[idx] == key)
        {
            return idx;
        }
        else
        {
            int fisa = firstIndex(arr, idx + 1, key);
            return fisa;
        }
    }

    public static int lastIndex(int[] arr, 
                                int idx, int key)
    {
        if(idx == arr.length)
        {
            return -1;
        }
        int lisa = lastIndex(arr, idx + 1, key);
        if(lisa != -1)
        {
            return lisa;
        }
        else if(arr[idx] == key)
        {
            return idx;
        }
        else
        {
            return -1;
        }
    }

    public static int[] allIndex(int[] arr, 
                                 int idx, int fsf, 
                                 int key)
    {
        if(idx == arr.length)
        {
            return new int[fsf];
        }

        if(arr[idx] == key)
        {
            int[] res = allIndex(arr, idx + 1, 
                                 fsf + 1, key);
            res[fsf] = idx;
            return res;
        }
        else
        {
            // 5k
            int[] res = allIndex(arr, idx + 1, fsf, key);
            return res;
        }
    }


    public static void main(String[] args)
    {
        // int[] arr = {10, 20, 30, 40, 50};
        // displayR(arr, 0);
        int[] arr = {2, 4, 5, 8, 1, 8, 6, 8, 7, 9};
        int[] res = allIndex(arr, 0, 0, 10);
        
        for(int i = 0; i < res.length; i++)
        {
            System.out.println(res[i]);
        }
    }
}