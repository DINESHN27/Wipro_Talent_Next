import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int isPalinNum(int input1)
	{

	  int sum=0;
        int temp=input1;
        int rem=0;
        while(input1 != 0)
        {
            rem=input1%10;
            sum=(sum*10)+rem;
            input1=input1/10;
        }
        if(sum==temp)
        {
            return 2;
        }
        else
        {
            return 1;
        }
	}
}
