package com.Chitra;

/**
 * Created by chitrakakkar on 3/17/16.
 */
public class Bee extends Insect
{
    protected String BeeColor;
    protected boolean MakeHoney;
    String FavFlower;

    Bee(String name,Integer WingsNumber, String beeColor,boolean makeHoney,String favFlower )
    {
        super(name,WingsNumber);
        this.BeeColor = beeColor;
        this.MakeHoney = makeHoney;
        this.FavFlower = favFlower;
    }

    public void printSpeciesData()
    {
        if(MakeHoney == true)
        {
            System.out.println(this.Name + "has " + this.WingsNumber + "wings " + "The color of wings " + this.BeeColor + " Makes Honey " + " Likes " + this.FavFlower);
        }
       if(MakeHoney == false)
       {
           System.out.println(this.Name + "has " + this.WingsNumber + "wings " + "The color of wings " + this.BeeColor + " does make  Honey " + " Likes " + this.FavFlower);
       }
    }

}
