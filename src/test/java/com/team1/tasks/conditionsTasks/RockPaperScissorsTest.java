package com.team1.tasks.conditionsTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsTest {

    @Test
    void rpsWinP1() {
        assertEquals("Player 1 won!", RockPaperScissors.rps( "scissors", "paper"));
    }

    @Test
    void rpsWin2P1() {
        assertEquals("Player 1 won!", RockPaperScissors.rps( "rock", "scissors"));
    }

    @Test
    void rpsWin3P1() {
        assertEquals("Player 1 won!", RockPaperScissors.rps( "paper", "rock"));
    }

    @Test
    void rpsWin4P1() {
        assertEquals("Player 1 won!", RockPaperScissors.rps("scissors", "paper"));
    }

    @Test
    void rpsDraw() {
        assertEquals("Draw!", RockPaperScissors.rps("paper", "paper"));
    }

    @Test
    void rpsDraw2() {
        assertEquals("Draw!", RockPaperScissors.rps("scissors", "scissors"));
    }

    @Test
    void rpsDraw3() {
        assertEquals("Draw!", RockPaperScissors.rps("rock", "rock"));
    }


    @Test
    void rpsWinP2() {
        assertEquals("Player 2 won!",RockPaperScissors.rps( "paper","scissors"));
    }

    @Test
    void rpsWin1P2() {
        assertEquals("Player 2 won!",RockPaperScissors.rps( "scissors", "rock"));
    }

    @Test
    void rpsWin2P2() {
        assertEquals("Player 2 won!",RockPaperScissors.rps( "rock", "paper"));
    }


}