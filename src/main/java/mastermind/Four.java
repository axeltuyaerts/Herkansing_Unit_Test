package mastermind;

public class Four {
    final private Color[] colors;

    public Four(Color color1, Color color2, Color color3, Color color4) {
        colors = new Color[]{color1, color2, color3, color4};
    }

    public Color[] getColors() {
        return colors;
    }
}
