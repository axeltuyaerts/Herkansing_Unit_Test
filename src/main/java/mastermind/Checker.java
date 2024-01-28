package mastermind;

import java.util.ArrayList;
import java.util.List;

public class Checker {
    public Color[] getResult(Four code, Four guess) {
        if (code == null || guess == null) return null;

        List<Color> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (getColor(guess, i) == getColor(code, i)) {
                result.add(Color.BLACK);
            } else if (hasColor(code, getColor(guess, i))) {
                result.add(Color.WHITE);
            }
        }

        return result.toArray(new Color[]{});
    }

    private boolean hasColor(Four four, Color color) {
        for (int i = 0; i < 4; i++) {
            if (getColor(four, i) == color) return true;
        }
        return false;
    }


    private Color getColor(Four four, int place) {
        if (place<0 || place>3) throw new IllegalArgumentException("Kleurpositie moet tussen 0 en 3 liggen.");
        return four.getColors()[place];
    }

}
