package work3;

import work3.data.*;

/**
 * A real image service that implements the image service interface and is real (unlike the proxy)
 */
public class RealImageService implements ImageService {

    /**
     * A method that gets (returns (retrieves)) the data of an image by its url and doesn't use any caching techniques (unlike the ProxyImageService class)
     */
    public ImageData getFromUrl(String url) {
        System.out.println("SENT REQUEST FOR IMAGE");
        try { Thread.sleep(5000); } catch(Exception e) { /* too bad */ }
        System.out.println("RECEIVED IMAGE");

        return new ImageData();
    }

    /**
     * A method that gets the color of the pixel with coordinates (x, y) of the image that is specified by url and it also doesn't use any caching techniques
     * @param x X coordinate of that pixel
     * @param y Y coordinate of the pixel
     * @param url The url with which the image to be retrieved is accessed
     */
    public Color getColorAt(int x, int y, String url) {
        ImageData image = getFromUrl(url);
        return image.getColorAt(x, y);
    }

}
