
/**
 * Write a description of class SimpleCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int n1;
    private int n2;

    
    public SimpleCalc(int x, int y)
    {
        // initialise instance variables
        n1 = x;
        n2 = y;
    }

    
    public int add()
    {
        return n1 + n2;
    }
    
    public int subtract(){
        return n1 - n2;
    }
    
    public int mult(){
        return n1 * n2;
    }
    
    public int div(){
        return n1 / n2;
    }
    
    public boolean isGreater(){
        return n1 > n2;
    }
}

