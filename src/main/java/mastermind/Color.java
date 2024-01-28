package mastermind;

public enum Color {
    BLACK(0), WHITE(1), RED(2), GREEN(3), BLUE(4), YELLOW(5), BROWN(6), PURPLE(7);

    private final int nr;

    Color(int nr) {
        this.nr = nr;
    }

    public int getNumber() {
        return nr;
    }

    public String getColor() {
        return toString();
    }
}
