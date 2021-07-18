package com.team5.Menu;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Menu.class)
class MenuTest {


    @Test
    void basicMenu(){
        PowerMockito.spy(Menu.class);
        PowerMockito.doNothing().when(Menu.class);
        Menu.basicMenu();
    }


    @Test
    void classesMenu() {
        PowerMockito.spy(Menu.class);
        PowerMockito.doNothing().when(Menu.class);
        Menu.classesMenu();
    }

    @Test
    void conditionsMenu() {
        PowerMockito.spy(Menu.class);
        PowerMockito.doNothing().when(Menu.class);
        Menu.conditionsMenu();
    }

    @Test
    void loopsMenu() {
        PowerMockito.spy(Menu.class);
        PowerMockito.doNothing().when(Menu.class);
        Menu.loopsMenu();
    }

    @Test
    void oopMenu() {
        PowerMockito.spy(Menu.class);
        PowerMockito.doNothing().when(Menu.class);
        Menu.oopMenu();
    }

    @Test
    void stringMenu() {
        PowerMockito.spy(Menu.class);
        PowerMockito.doNothing().when(Menu.class);
        Menu.stringMenu();
    }

    @Test
    void collectionsMenu() {
        PowerMockito.spy(Menu.class);
        PowerMockito.doNothing().when(Menu.class);
        Menu.collectionsMenu();
    }
}