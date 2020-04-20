/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FLOW007
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String temp=br.readLine();
            int len=temp.length();
            int num=Integer.parseInt(temp);
            len-=1;
            int ans=0;
            while(num>0){
                ans+=(num%10)*(int)Math.pow(10,len);
                len--;
                num/=10;
            }
            System.out.println(ans);
        }
	}
}
