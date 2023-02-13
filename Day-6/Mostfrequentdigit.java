import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int getCodeThroughStrings(String.input1)
	{	  
	  int rem=0,i=0;
        int[] ans=new int[10];
        for(i=0;i<input2;i++)
        {
            while(input1[i] !=0)
            {
                rem=input1[i]%10;
                ans[rem]++;
                input1[i]=input1[i]/10;
            }
        }
        int k=-1;
        int x=0;
        for(i=0;i<10;i++)
        {
            if(ans[i]>=k)
            {
                k=ans[i];
                x=i;          
            }
        }
		
        return x;
	}
}