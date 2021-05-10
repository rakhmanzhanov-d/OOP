import processing.core.*;

import javax.swing.*;

public class Project02 extends PApplet {
    Star[] stars = new Star[100];

    public void settings() {
        fullScreen();
    }

    public void setup() {
        for (int i = 0; i < 100; i++) {
            stars[i] = new Star(random(width), random(height), random(10, 30), random(-1, 1), random(-1, 1), this);
        }
        frameRate(30);
    }

    public void draw() {
        background(0, 0, 0);
        pushMatrix();
        for (int i = 0; i < stars.length; i++) {
            stars[i].draw();
            stars[i].move();
        }
        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Project02");
    }

}