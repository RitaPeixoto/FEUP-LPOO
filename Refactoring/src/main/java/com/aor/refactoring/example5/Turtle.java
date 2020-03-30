package com.aor.refactoring.example5;

public class Turtle {
    private char direction;
    Position pos;

    public Turtle(int row, int column, char direction) {
        this.pos = new Position(row, column);
        this.direction = direction;
    }
    public Position getPos(){
        return pos;
    }
    public char getDirection() {
        return direction;
    }

    public void rotateLeft(){
        if (direction == 'N') direction = 'W';
        else if (direction == 'W') direction = 'S';
        else if (direction == 'S') direction = 'E';
        else if (direction == 'E') direction = 'N';

    }
    public void rotateRight(){
        if (direction == 'N') direction = 'E';
        else if (direction == 'E') direction = 'S';
        else if (direction == 'S') direction = 'W';
        else if (direction == 'W') direction = 'N';
    }

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            rotateLeft();
        }
        else if (command == 'R') { // ROTATE RIGHT
            rotateRight();
        }
        else if (command == 'F'){ // MOVE FORWARD
            pos.moveForward(direction);
        }
    }
}
