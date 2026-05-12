package classwork_10;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Point point =
        return x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
