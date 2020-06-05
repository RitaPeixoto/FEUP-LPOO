package com.aor.refactoring.example5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TurtleTest {

    @Test
    public void testRotateLeft() {
        Turtle turtle = new Turtle(5, 5, 'N');
        turtle.execute('L'); assertEquals('W', turtle.getDirection());
        turtle.execute('L'); assertEquals('S', turtle.getDirection());
        turtle.execute('L'); assertEquals('E', turtle.getDirection());
        turtle.execute('L'); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getPos().getRow());
        assertEquals(5, turtle.getPos().getColumn());
    }

    @Test
    public void testRotateRight() {
        Turtle turtle = new Turtle(5, 5, 'N');
        turtle.execute('R'); assertEquals('E', turtle.getDirection());
        turtle.execute('R'); assertEquals('S', turtle.getDirection());
        turtle.execute('R'); assertEquals('W', turtle.getDirection());
        turtle.execute('R'); assertEquals('N', turtle.getDirection());
        assertEquals(5, turtle.getPos().getRow());
        assertEquals(5, turtle.getPos().getColumn());
    }

    @Test
    public void testForward() {
        Turtle turtleN = new Turtle(5, 5, 'N');

        turtleN.execute('F');
        assertEquals(4, turtleN.getPos().getRow());
        assertEquals(5, turtleN.getPos().getColumn());

        Turtle turtleW = new Turtle(5, 5, 'W');

        turtleW.execute('F');
        assertEquals(5, turtleW.getPos().getRow());
        assertEquals(4, turtleW.getPos().getColumn());

        Turtle turtleS = new Turtle(5, 5, 'S');

        turtleS.execute('F');
        assertEquals(6, turtleS.getPos().getRow());
        assertEquals(5, turtleS.getPos().getColumn());

        Turtle turtleE = new Turtle(5, 5, 'E');

        turtleE.execute('F');
        assertEquals(5, turtleE.getPos().getRow());
        assertEquals(6, turtleE.getPos().getColumn());
    }

}