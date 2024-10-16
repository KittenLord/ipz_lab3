package work3.data;

/**
 * A class Image data that contains the data of an image
 */
public class ImageData {

    /**
     * A method that gets (and even returns) color of an image at coordinates x and y
     * @param x X coordinate of the wanted pixel
     * @param y Y coordinate
     */
    public Color getColorAt(int x, int y) {
        return new Color(x, y);
    }

}
