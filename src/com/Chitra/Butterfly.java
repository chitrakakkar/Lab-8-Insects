package com.Chitra;

/**
 * Created by chitrakakkar on 3/17/16.
 */
public class Butterfly extends Insect
{
    protected String WingsColor;
    protected String FavFlower;

    public String getWingsColor() {return WingsColor;}

    public String getFavFlower() {return FavFlower;}

    public void setFavFlower(String favFlower) {FavFlower = favFlower;}

    public void setWingsColor(String wingsColor) {WingsColor = wingsColor;}

    Butterfly(String name, String wingsColor, Integer WingsNumber, String favFlower)
    {
        super(name,WingsNumber);
        this.WingsColor = wingsColor;
        this.FavFlower = favFlower;

    }

    public void printSpeciesData()
    {
        System.out.println(this.Name + " has " + this.NumberofLegs +"legs " + this.WingsNumber +" Wings" + " The color of Wings is " + this.WingsColor +  " likes " + this.FavFlower);
    }

}
