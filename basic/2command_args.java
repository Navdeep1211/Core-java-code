import java.util.Scanner.*;
import java.lang.*;


class command_args
{

public static void main(String args[])
{
if (args.length>0)
{

int val=args.length;

for (int i=0;i<val;i++)
{
System.out.println(args[i]);
}

}

}

}