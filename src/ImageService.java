package work3;

import work3.data.*;

/**
 * An interface that describes the interface of a service that retrieves images
 */
public interface ImageService {

    /**
     * A method that gets (returns (retrieves)) the data of an image from the provided url
     * @param url A url that is provided to get (return (you get it)) the aforementioned data of an image
     */
    public ImageData getFromUrl(String url);

    /**
     * A method that gets (returns (retrieves)) a color of the pixel specified by its x and y coordinates of the image specified by its url
     * @param x X coordinate of the pixel
     * @param y Y coordinate of that same pixel
     * @param url A url that specified the image that the pixel belongs to
     */
    public Color getColorAt(int x, int y, String url);

}
