/* package codechef; // don't place package name! */

import java.util.*;
// import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Lapin
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // your code goes here
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String input=br.readLine();
            int i,len=input.length();
            char[] arr1=new char[len/2];
            char[] arr2=new char[len/2];
            for(i=0;i<len/2;i++){
                arr1[i]=input.charAt(i);
            }
            //If the length of the string is EVEN
            if(len%2==0){
                i=len/2;
            }
            //If length of the string is ODD, skip the middle character
            else{
                i=len/2+1;
            }
            for(int temp=0;i<len;i++){
                arr2[temp]=input.charAt(i);
                temp++;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.toString(arr1).equals(Arrays.toString(arr2))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}
