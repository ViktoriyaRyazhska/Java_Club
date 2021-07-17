package com.team5.OOP.Task1;

import java.util.Arrays;

public class God {
    public Human[] create(){
        System.out.println("This method only returns an array two objects long, the first being a man and the second a woman");
        Human[] humans = new Human[2];
        Man Adam = new Man("Adam");
        Woman Eva = new Woman("Eva");

        humans[0] = Adam;
        humans[1] = Eva;

        System.out.println(Arrays.toString(humans));
        return humans;
    }
}
