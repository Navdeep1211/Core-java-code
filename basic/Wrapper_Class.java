public class Wrapper_Class {
    
    
    public static void main(String args[])
    {
    int x= 7;
    Integer i = new Integer(x);
    System.out.println("from int to Inetger wrapper class convcersion "+i);
    int y = i.intValue();
    System.out.println("from Wrapper class to int conversion "+y);
        
    }
    
}