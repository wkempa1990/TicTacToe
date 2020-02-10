public class Współrzędne {
    private int x;
    private int y;

    public Współrzędne(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Współrzędne) {
            Współrzędne inneWspółrzędne = (Współrzędne) obj;
            return inneWspółrzędne.x == x &&
                    inneWspółrzędne.y == y;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}
