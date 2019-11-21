package javafxapplication3;

public aspect aspe
{
    pointcut gravaLog() : execution (* Boneco.*());
    after(): gravaLog()
    {
        //String s = "X: " + Boneco.getX() + "Y: " + Boneco.getY() + "Direction: " + Boneco.getDirection();
        /*PrintWriter gravaArq = new new PrintWriter(new FileWriter("logPositions.txt"));
        gravaArq.printf(s);*/
    	//Boneco.gravaLog();
        System.out.println("SALVE SALVE");
        //System.out.println(s);
    }
}