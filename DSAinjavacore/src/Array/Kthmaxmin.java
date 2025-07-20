package Array;

import java.util.Arrays;
 class pair<T>
{
	 T first;
	 T second;
	 public pair(T first,T second)
	 {
		 this.first=first;
		 this.second=second;
	 }
	 public String toString() {
		 return "("+first +","+ second+")";
	 }
}
public class Kthmaxmin {
public static <T extends Comparable <T>>pair<T>  kthmaxmin(T arr[],int k)
{
	Arrays.sort(arr);
	T min=arr[k-1];
	T max =arr[arr.length-k];
	return new pair<>(min,max);
}
	public static void main(String args[])
	{
		Integer[] array= {10,8,20,9,40,1,50};
		int k =3;
		pair<Integer>res=Kthmaxmin.kthmaxmin(array,k);
		System.out.println("The minimum and maximum pair is"+res);
	}
	}


