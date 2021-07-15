package com.team1.tasks.loops;

public class SheepCounter {
    private SheepCounter() {
    }

    public int countSheep(Boolean[] arrayOfSheep) {
        int ans = 0;
        for (Boolean ofSheep : arrayOfSheep) {
            if (ofSheep == Boolean.TRUE) {
                ans++;
            } else if (ofSheep != null) {
                System.out.println("NULL");
            }
        }
        return ans;
    }
}
