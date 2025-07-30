package DSAinjavacore;

import java.util.Arrays;

public class asg1 {
public static int countemployee(int arr[])
{
	int sorted[]=arr.clone();
	Arrays.sort(sorted);
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=sorted[i])
		{
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,3,4,3};
		int res=countemployee(arr);
     System.out.println("The incorrect number of position are"+res);
	}

}
