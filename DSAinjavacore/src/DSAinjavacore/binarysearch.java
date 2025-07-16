package DSAinjavacore;
import java.util.*;
public class binarysearch {
public static<T extends Comparable<T>>int  binarysearch(T arr[],T key)
{
int low=0;
int high=arr.length-1;
while(low<=high)
{
	int mid=(low+high)/2;
	int cmp=key.compareTo(arr[mid]);
	if(cmp==0)
	{
		System.out.println("element is found"+mid);
		return mid;
	}
	else if(cmp>0)
	{
		low=mid+1;
	}
	else
	{
	high=mid-1;	
	}
}
return -1;
}
public static void main(String args[])
{
    Integer[] intarr = {1, 3, 5, 7, 9, 11};
    int a=binarysearch(intarr,7);
    System.out.println("found at position"+ a);
}
}

