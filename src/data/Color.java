package work3.data;

/**
 * A very cool color class
 */
public class Color {

    /**
     * Color's color
     */
    private String color;
    /**
     * A public getter that publicly gets color's color
     */
    public String getColor() { return color; }

    /**
     * A color constructor that constructs color
     * @param x a coordinate that is x
     * @param y a coordinate that is not x but rather y
     */
    public Color(int x, int y) {
        color = "Very cool color at (" + x + "; " + y + ")";
    }

}
