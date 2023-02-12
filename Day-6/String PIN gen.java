import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int getCodeThroughStrings(String.input1)
	{
		int c=0;
        	for(int i=0;i<input1.length();i++)
       	{
            	if(input1.charAt(i) != ' ')
            	{
                		c++;
            	}                                           
        	}
        	int rem=0,sum=0;
        	while(c%10 != c)
        	{
           		while(c!=0)
            	{
                	rem=c%10;
                	sum=sum+rem;
                	c=c/10;
            	}
            	c=sum;
        	}
        	return sum;
        
		
	}
}