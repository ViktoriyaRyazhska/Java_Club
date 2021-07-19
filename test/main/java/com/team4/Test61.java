package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test61 extends Task61 {
    @Test
    void Testcorrect() {
        Assertions.assertEquals("IF-RUDYARD KIPLING", correct(correct("1F-RUDYARD K1PL1NG")));
        Assertions.assertEquals("ROBERT MERLE - THE DAY OF THE DOLPHIN", correct(correct("R0BERT MERLE - THE DAY 0F THE D0LPH1N")));
        Assertions.assertEquals("RICHARD P. FEYNMAN - THE FEYNMAN LECTURES ON PHYSICS", correct(correct("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5")));
        Assertions.assertEquals("RICHARD P. FEYNMAN - STATISTICAL MECHANICS", correct(correct("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5")));
        Assertions.assertEquals("STEPHEN HAWKING - A BRIEF HISTORY OF TIME", correct(correct("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME")));
        Assertions.assertEquals("STEPHEN HAWKING - THE UNIVERSE IN A NUTSHELL", correct(correct("5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL")));
        Assertions.assertEquals("ERNEST HEMINGWAY - A FARWELL TO ARMS", correct(correct("ERNE5T HEM1NGWAY - A FARWELL T0 ARM5")));
        Assertions.assertEquals("ERNEST HEMINGWAY - FOR WHOM THE BELL TOLLS", correct(correct("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5")));
        Assertions.assertEquals("ERNEST HEMINGWAY - THE OLD MAN AND THE SEA", correct(correct("ERNE5T HEM1NGWAY - THE 0LD MAN AND THE 5EA")));
        Assertions.assertEquals("J. R. R. TOLKIEN - THE LORD OF THE RINGS", correct(correct("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5")));
        Assertions.assertEquals("J. D. SALINGER - THE CATCHER IN THE RYE", correct(correct("J. D. 5AL1NGER - THE CATCHER 1N THE RYE")));
        Assertions.assertEquals("J. K. ROWLING - HARRY POTTER AND THE PHILOSOPHER'S STONE", correct(correct("J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE")));
        Assertions.assertEquals("J. K. ROWLING - HARRY POTTER AND THE CHAMBER OF SECRETS", correct(correct("J. K. R0WL1NG - HARRY P0TTER AND THE CHAMBER 0F 5ECRET5")));
        Assertions.assertEquals("J. K. ROWLING - HARRY POTTER AND THE PRISONER OF Azkaban", correct(correct("J. K. R0WL1NG - HARRY P0TTER AND THE PR150NER 0F Azkaban")));
        Assertions.assertEquals("J. K. ROWLING - HARRY POTTER AND THE GOBLET OF FIRE", correct(correct("J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE")));
        Assertions.assertEquals("J. K. ROWLING - HARRY POTTER AND THE ORDER OF PHOENIX", correct(correct("J. K. R0WL1NG - HARRY P0TTER AND THE 0RDER 0F PH0EN1X")));
        Assertions.assertEquals("J. K. ROWLING - HARRY POTTER AND THE HALF-BLOOD PRINCE", correct(correct("J. K. R0WL1NG - HARRY P0TTER AND THE HALF-BL00D PR1NCE")));
        Assertions.assertEquals("J. K. ROWLING - HARRY POTTER AND THE DEATHLY HALLOWS", correct(correct("J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5")));
        Assertions.assertEquals("URSULA K. LE GUIN - A WIZARD OF EARTHSEA", correct(correct("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA")));
        Assertions.assertEquals("URSULA K. LE GUIN - THE TOMBS OF ATUAN", correct(correct("UR5ULA K. LE GU1N - THE T0MB5 0F ATUAN")));
        Assertions.assertEquals("URSULA K. LE GUIN - THE FARTHEST SHORE", correct(correct("UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE")));
        Assertions.assertEquals("URSULA K. LE GUIN - TALES FROM EARTHSEA", correct(correct("UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA")));
    }
}
