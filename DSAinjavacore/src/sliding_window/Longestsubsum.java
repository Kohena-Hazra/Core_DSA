package sliding_window;

public class Longestsubsum {
public static int longsum(int arr[],int s) {
	int l=-1,curr=0,best=0;
	for(int r=0;r<arr.length;r++)
	{
		curr+=arr[r];
	
	while(curr>s)
	{
		l++;
		curr-=arr[l];
	}
	best=Math.max(best, r-l);
	}
return best;
}

public static void main(String args[])
{
	int arr[]= {1,4,5,3,2,1,6};
	int s=6;
	System.out.println("the length of the longest subarray is : "+longsum(arr,s));
			
	}
}

