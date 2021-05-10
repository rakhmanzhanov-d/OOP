package p02;

import p02.Rect;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        ArrayList<Rect> rectangles = new ArrayList<>();

        rectangles.add(new Rect(100, 500, 10, 10));
        rectangles.add(new Rect(650, 500, 10, 10));
        rectangles.add(new Rect(300, 500, 10, 10));

        ArrayList<Circle> circles = new ArrayList<>();

        circles.add(new Circle(100, 500, 10));
        circles.add(new Circle(650, 500, 10));
        circles.add(new Circle(300, 500, 10));

        while (true) {
            int xClick = inp.nextInt();
            int yClick = inp.nextInt();

            if (xClick == -1 && yClick == -1) break;

            for (Circle c : circles) {
                if (c.contains(xClick, yClick)) {
                    System.out.println(c);
                }
            }
        }

    }
}
