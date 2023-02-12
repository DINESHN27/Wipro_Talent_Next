import java.io.*;
import  java.util.*;

class UserMainCode
{        
	public String secondWordUpperCase(String input1)
	{              
        String[] str=null;
        str=input1.split(" ");
        if(str.length !=1)
        {
            return str[1].toUpperCase();
        }
        else
        {
            return "LESS";
        }    
		//throw new UnsupportedOperationException("secondWordUpperCase(String input1)");
	}
}
