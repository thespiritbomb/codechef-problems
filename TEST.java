/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		int num=0;
		while(true){
			String temp=br.readLine();
			if(temp.equals("42")){
				break;
			}
			num=Integer.parseInt(temp);
			System.out.println(num);
		}
	}
}
