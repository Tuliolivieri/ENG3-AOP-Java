package javafxapplication3;

public aspect aspe
{
    pointcut gravaLog(Boneco b) : execution (void Boneco.*()) && target(b);
    after(Boneco b): gravaLog(b)
    { 
        //gravaArq.printf("Dir");
        //b.gravaLog(dir);
        b.gravaLog();
        //System.out.println(b.getDirection());
    }
}