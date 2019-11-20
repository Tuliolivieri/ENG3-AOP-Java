package javafxapplication3;

public aspect aspe
{
    pointcut hello() : execution (* Boneco.* (..));
    after(): hello()
    {
    	System.out.println("SALVE SALVE");
    }
}