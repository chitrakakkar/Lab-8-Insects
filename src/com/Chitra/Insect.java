package com.Chitra;

import com.sun.tools.javac.code.Attribute;

/**
 * Created by chitrakakkar on 3/17/16.
 */
public abstract class Insect
{
    protected String Name;
    protected Integer WingsNumber;
    protected final Integer NumberofLegs = 6;

    Insect(String name,Integer wingsNumber)
    {
        this.Name = name;
        this.WingsNumber = wingsNumber;
    }

    public String getName() {return Name;}

    public Integer getWingsNumber(){return WingsNumber;}

    public void setWingsNumber(Integer wingsNumber){WingsNumber = wingsNumber;}

    public void setName(String name){Name = name;}

    public Integer getNumberofLegs() {return NumberofLegs;}

    public abstract void printSpeciesData();

}
