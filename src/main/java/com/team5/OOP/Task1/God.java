package com.team5.OOP.Task1;

public class God {
    public Human[] create(){
        Human[] humans = new Human[2];
        Human Adam = new Man();
        Human Eva = new Woman();

        humans[0] = Adam;
        humans[1] = Eva;

        return humans;
    }
}
