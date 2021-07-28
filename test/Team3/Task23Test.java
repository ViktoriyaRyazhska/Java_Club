package Team3;

import org.junit.Assert;
import org.junit.Test;

public class Task23Test {
    String expected1 = "Player 1 won!!!";
    String expected2 = "Player 2 won!!!";
    String expected3 = "Draw!!!";
    @Test
    public void ScissorsRockPaper1(){
        Assert.assertEquals(expected1,Task23.ScissorsRockPaper("scissors","paper"));
        Assert.assertEquals(expected1,Task23.ScissorsRockPaper("rock","scissors"));
        Assert.assertEquals(expected1,Task23.ScissorsRockPaper("paper","rock"));
    }

    @Test
    public void ScissorsRockPaper2(){
        Assert.assertEquals(expected2,Task23.ScissorsRockPaper("scissors","rock"));
        Assert.assertEquals(expected2,Task23.ScissorsRockPaper("rock","paper"));
        Assert.assertEquals(expected2,Task23.ScissorsRockPaper("paper","scissors"));
    }
    @Test
    public void ScissorsRockPaper3(){
        Assert.assertEquals(expected3,Task23.ScissorsRockPaper("scissors","scissors"));
        Assert.assertEquals(expected3,Task23.ScissorsRockPaper("rock","rock"));
        Assert.assertEquals(expected3,Task23.ScissorsRockPaper("paper","paper"));
    }

}
