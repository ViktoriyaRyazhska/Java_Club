package com.team1.tasks.loops;

public class SheepCounter {
    private SheepCounter() {
    }

    public int countSheep(Boolean[] arrayOfSheep) {
        int ans = 0;
        for (boolean shp : arrayOfSheep) {
            if (shp) ans++;
        }
        return ans;
    }
}
