public class Points {
    private int x;
    private int y;
    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Points(int both) {
        x = both;
    }

    public Points() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "IIII";
        } else if (x == 0 && y == 0) {
            return "origin";
        } else {
            return "on an axis";
        }
    }
}
