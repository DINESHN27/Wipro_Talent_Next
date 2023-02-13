import java.io.*;
import java.util.*;

class UserMainCode
{
	public class Result
	{
		public final int output1;
		public final int output2;
		public Result(int out1,int out2)
		{
			output1=out1;
			output2=out2;
		}
	}
	  int[] org=new int[input2];
        org[input2-1]=input1[input2-1];
        for(int i=input2-2;i>=0;i--)
        {
            org[i]=input1[i]-org[i+1];
            //System.out.println(org[i]);
        }
        
        int sum=0;
        for(int j=0;j<input2;j++)
        {
            sum+=org[j];
        }
        return new Result(org[0],sum);

        //throw new UnsupportedOperationException("findOriginalFirstAndSum(int[] input1,int input2)");
    }
}