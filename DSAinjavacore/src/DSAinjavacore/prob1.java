/*Problem Statement –
Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.
Constrains-
1<=N<=100
Example 1:
Input :
10  -> Integer
Output :
5    -> result- Integer
Explanation:
Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.

*/

package DSAinjavacore;
import java.util.*;
public class prob1 {
public static int togglebit(int n)
{
	String binary=Integer.toBinaryString(n);
	String togglebinary="";
	for(int i =0;i<binary.length();i++)
	{ 
		char bit =binary.charAt(i);
		
		if(bit=='1')
		{
			togglebinary+='0';
		}
		else if(bit=='0') {
			togglebinary+='1';
		}
	}
	int m = Integer.parseInt(togglebinary,2);
	return m;
}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int k=sc.nextInt();
	int res=togglebit(k);
	System.out.println("the rseul is"+res);
}
}
