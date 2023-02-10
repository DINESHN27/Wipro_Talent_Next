import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int isPalinNum(int input1)
	{
        int sum=0,rem=0;
        int odd=0,len=0;
        boolean f=true;
        int arr[]=new int[10];
        while(input1!=0)
        {
            rem=input1%10;
            arr[rem]++;
            len++;
            input1=input1/10;
        }
        if(len%2 == 0)
        {
            for(int i=0;i<10;i++)
            {
                if(arr[i]%2 !=0)
                {
                    f=false;
                    break;
                }
            }
        }              
        else
        {
            for(int j=0;j<10;j++)
            {
                if(arr[j]%2 != 0)
                {
                    odd++;
                    if(odd>1)
                    {
                        f=false;
                        break;
                    }
                }
            }
            
        }
        if(f)
        {
            return 2;
        }
        else
        {
            return 1;
        }


		//throw new UnsupportedOperationException("isPalinNumPossible(int input1)");
	}
}