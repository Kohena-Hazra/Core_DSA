/*Maximum sum of subarray of size k*/
package sliding_window;
import java.util.*;
public class Maximumsum {
	public static int maxsum(int arr[],int k)
	{
		int n= arr.length;
		if(n<k)
		{
			System.out.println("length is shorter than window size");
		}
		int maxsum=0,windowsum=0;
		for(int i=0;i<k;i++)
		{
			windowsum+=arr[i];
		}
		maxsum=windowsum;
		for(int i=k;i<n;i++)
		{
			windowsum+=arr[i]-arr[i-k];
			maxsum =Math.max(maxsum,windowsum);
		}
		return maxsum;
	}
public static void main(String args[])
{
	int arr[]= {2,1,5,1,3,2};
	int k=3;
	System.out.println("the maximum sumof subarray of size "+k +" is : "+maxsum(arr,k));
}
}
