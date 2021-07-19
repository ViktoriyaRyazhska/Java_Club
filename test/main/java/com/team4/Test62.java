package com.team4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test62 extends Task62 {
    @Test
    public void fixedTesttoAlternativeString() {
        Assertions.assertEquals("HELLO WORLD", toAlternativeString("hello world"));
        Assertions.assertEquals("hello world", toAlternativeString("HELLO WORLD"));
        Assertions.assertEquals("HELLO world", toAlternativeString("hello WORLD"));
        Assertions.assertEquals("hEllO wOrld", toAlternativeString("HeLLo WoRLD"));
        Assertions.assertEquals("Hello World", toAlternativeString(toAlternativeString("Hello World")));
        Assertions.assertEquals("12345", toAlternativeString("12345"));
        Assertions.assertEquals("1A2B3C4D5E", toAlternativeString("1a2b3c4d5e"));
        Assertions.assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", toAlternativeString("StringUtils.toAlternatingCase"));
    }

    @Test
    public void TesttoAlternativeString() {
        Assertions.assertEquals("ALTerNAtiNG CaSe", toAlternativeString("altERnaTIng cAsE"));
        Assertions.assertEquals("altERnaTIng cAsE", toAlternativeString("ALTerNAtiNG CaSe"));
        Assertions.assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        Assertions.assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}
