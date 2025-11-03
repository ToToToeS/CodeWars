import com.sun.source.tree.Tree;

import java.util.*;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Chess {

    private static class Point {
        private int x;
        private int y;

        public Point() {}

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static double distance(Point p1, Point p2) {
            return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static int knight(String start, String  finish) {
        int[][] directions = {
                {1, 2}, {2, 1}, {-1, 2}, {-2, 1},
                {1, -2}, {2, -1}, {-1, -2}, {-2, -1}
        };

        Point startPoint = new Point(
                start.charAt(0) - 'a',
                start.charAt(1) - '1'
        );
        Point finishPoint = new Point(
                finish.charAt(0) - 'a',
                finish.charAt(1) - '1'
        );

        Point[][] parent = new Point[8][8];
        parent[startPoint.x][startPoint.y] = startPoint;
        boolean[][] wasIn = new boolean[8][8];

        wasIn[startPoint.x][startPoint.y] = true;

        Queue<Point> queue = new LinkedList<>();
        queue.offer(startPoint);


        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            for (var direction : directions) {
                if (currentPoint.x + direction[0] >= 0 && currentPoint.y + direction[1] >= 0 &&
                    currentPoint.x + direction[0] < 8 && currentPoint.y + direction[1] < 8) {

                    Point nextPoint = new Point(currentPoint.x + direction[0], currentPoint.y + direction[1]);

                    if (!wasIn[nextPoint.x][nextPoint.y]) {
                        wasIn[nextPoint.x][nextPoint.y] = true;
                        queue.add(nextPoint);
                        parent[nextPoint.x][nextPoint.y] = currentPoint;
                    }

                    if (nextPoint.equals(finishPoint)) {
                        return howSteps(startPoint, finishPoint, parent);
                    }
                }
            }
        }


        return -1;
    }

    private static int howSteps(Point start, Point finish, Point[][] parents) {
        Point currentPoint = new Point(finish.x, finish.y);
        int counter = 0;
        while (!currentPoint.equals(start)) {
            currentPoint = parents[currentPoint.x][currentPoint.y];
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(knight("a1", "c1"));
    }
}