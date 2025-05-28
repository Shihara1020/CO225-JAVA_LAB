package task1;

import java.awt.*;

public class MovableRectangle implements Movable {
    private MovablePoint toLeft;
    private MovablePoint bottomtoRight;

    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed) {
        this.toLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomtoRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    private boolean hasSameSpeed(){
        return toLeft.xSpeed==bottomtoRight.xSpeed && toLeft.ySpeed==bottomtoRight.ySpeed;
    }

    @Override
    public void moveDown() {
        if (hasSameSpeed()) {
            toLeft.moveDown();
            bottomtoRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (hasSameSpeed()) {
            toLeft.moveLeft();
            bottomtoRight.moveLeft();
        }
    }
    @Override
    public void moveRight() {
        if (hasSameSpeed()) {
            toLeft.moveRight();
            bottomtoRight.moveRight();
        }
    }
    @Override
    public void moveUp() {
        if (hasSameSpeed()) {
            toLeft.moveUp();
            bottomtoRight.moveUp();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + toLeft + ", bottomRight=" + bottomtoRight + "]";
    }
}