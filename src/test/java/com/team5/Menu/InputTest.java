package com.team5.Menu;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    @Test
    void getIntegerInputSuccessfullyTest(){
        String inputInt = "0";
        InputStream in = new ByteArrayInputStream(inputInt.getBytes());
        System.setIn(in);
        assertEquals(0, Input.getIntegerInput());
    }

    @Test
    void getIntegerInputExceptionTest() throws InputMismatchException{

        String inputInt = "a";
        InputStream in = new ByteArrayInputStream(inputInt.getBytes());
        System.setIn(in);
        Input.getIntegerInput();
    }

    @Test
    void getStrInputSuccessfullyTest() {
        String inputInt = "a";
        InputStream in = new ByteArrayInputStream(inputInt.getBytes());
        System.setIn(in);
        assertEquals("a", Input.getStrInput());
    }

    @Test
    void getStrInputExceptionTest() throws InputMismatchException {

        String inputInt = "true";
        InputStream in = new ByteArrayInputStream(inputInt.getBytes());
        System.setIn(in);
        Input.getStrInput();
    }

    @Test
    void getBoolInputSuccessfullyTest() {
        String inputInt = "true";
        InputStream in = new ByteArrayInputStream(inputInt.getBytes());
        System.setIn(in);
        assertEquals(true, Input.getBoolInput());
    }

    @Test
    void getBoolInputExceptionTest() throws InputMismatchException {

        String inputInt = "qwe";
        InputStream in = new ByteArrayInputStream(inputInt.getBytes());
        System.setIn(in);
        Input.getBoolInput();
    }

    @Test
    void getCharInputSuccessfullyTest() {
        String inputInt = "c";
        InputStream in = new ByteArrayInputStream(inputInt.getBytes());
        System.setIn(in);
        char expected = inputInt.charAt(0);
        assertEquals(expected, Input.getCharInput());
    }

    @Test
    void getCharInputExceptionTest() throws InputMismatchException {

        String inputInt = "NotAChar";
        InputStream in = new ByteArrayInputStream(inputInt.getBytes());
        System.setIn(in);
        Input.getBoolInput();
    }
}