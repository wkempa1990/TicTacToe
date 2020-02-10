public enum Pole {
    KÓŁKO('O'), KRZYŻYK('X'), PUSTE(' ');

    private final char znak;

    Pole(char znak) {
        this.znak = znak;
    }

    public char getZnak() {
        return znak;
    }

    @Override
    public String toString() {
        return Character.toString(znak);
    }
}
