package homework_3;

public class Color {
    private final int r;
    private final int g;
    private final int b;

    private Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public static Color fromRGB(int r, int g, int b) {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
            throw new IllegalArgumentException();
        }
        return new Color(r, g, b);
    }

    public static Color fromHex(String hex) {
        String cleanHex = hex.replace("#", "");
        int r = Integer.parseInt(cleanHex.substring(0, 2), 16);
        int g = Integer.parseInt(cleanHex.substring(2, 4), 16);
        int b = Integer.parseInt(cleanHex.substring(4, 6), 16);
        return fromRGB(r, g, b);
    }

    public String toHex() {
        return String.format("#%02X%02X%02X", r, g, b);
    }
}
