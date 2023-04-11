class Varargs
{

void show(int...arg)
{
for (int i=0;i<arg.length;i++)
System.out.println(arg[i]);
}

public static void main(String args[])

{

Varargs t = new Varargs();
t.show();
t.show(1,2);
t.show(1,2,3,4,5,6);
}

}