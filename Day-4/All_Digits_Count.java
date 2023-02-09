import java.io.*;

import java.util.*;

// Read only region start
class  All_Digits_Count

{

public int allDigitsCount(int input1){

// Read only region end

int c=0,r;

while(input1>0){

r=input1%10;

c++;

input1=input1/10;

}

return c;

}

}
