class Solution
{

    // x[], y[]: input array elements
    // M, N: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    static long countPairs(int x[], int y[], int M, int N)
    {
        // your code here
        int count=0;
        for(int i=0; i<x.length; i++)
        {
            for(int j=0; j<y.length; j++)
            {
                if(Math.pow(x[i],y[j])>Math.pow(y[j],x[i]))
                    count++;
            }
        }
        return count;
    }
}
public class Main{
    public static void main(String args[])
    {
        int arr1[]={2,3,4,5};

        int arr2[]={1,2,3};
        int n=arr1.length;
        int m=arr2.length;
        System.out.println(Solution.countPairs(arr1,arr2,m,n));
    }

}