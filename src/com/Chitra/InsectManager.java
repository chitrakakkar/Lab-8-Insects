package com.Chitra;

import java.util.LinkedList;

public class InsectManager
{

    public static void main(String[] args)
    {

        Butterfly Monarch = new Butterfly("Monarch","Yellow",4,"Milkweed");
        Butterfly Swallowtail = new Butterfly("Swallowtail","Red",4,"parsley");
        Monarch.printSpeciesData();
        Swallowtail.printSpeciesData();

        Bee HoneyBee = new Bee("Honeybee",4,"Yellow",true,"jasmine");
        Bee BubleBee = new Bee("BubleBee",4,"YellowWhite",false,"Clover");
        HoneyBee.printSpeciesData();
        BubleBee.printSpeciesData();

        LinkedList<Insect> insects = new LinkedList<>();
        Butterfly Monarch1 = new Butterfly("Monarch1","Yellow",4,"Milkweed");
        Butterfly Swallowtail2 = new Butterfly("Swallowtail2","Red",4,"parsley");
        insects.add(Monarch1);insects.add(Swallowtail2);

        for (Insect i:insects
             )
        {
            i.printSpeciesData();
        }
    }
}
