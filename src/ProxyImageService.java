package work3;

import work3.data.*;
import java.util.HashMap;

/**
 * A proxy image service class that is a proxy to the real image service class with caching
 */
public class ProxyImageService implements ImageService {

    /**
     * An internal real image service that is used for its inherent behaviour of getting (returning (retrieving)) images
     */
    private RealImageService service;
    /**
     * A hashmap that caches previously gotten (returned (retrieved)) data of images and associates that to the url string that was used to get (return (retrieve)) the aforementioned data of an image
     */
    private HashMap<String, ImageData> cache;

    /**
     * A proxy image service constructor that constructs proxy image service and assigns the default values to internal fields of the proxy image service
     */
    public ProxyImageService() { service = new RealImageService(); cache = new HashMap<>(); }




    /**
     * A method that gets (returns (retrieves)) the data of an image by its url, or, if it has already been gotten (returned (retrieved)) previously, gets (returns (retrieves)) the cached data of an image
     * @param url The url of the image
     */
    public ImageData getFromUrl(String url) {

        if(cache.containsKey(url)) { return cache.get(url); }

        ImageData image = service.getFromUrl(url);
        cache.put(url, image);
        return image;

    }

    /**
     * A method thet gets (returns (retrieves)) the color of the pixel of the data of the image, but the image has already been gotten (etc) previously, it uses the cached data of the image to preserve resources
     * @param x The x coordinate of the pixel which color we are to retrieve (return (get))
     * @param y Y coordinate
     * @param url THe url that is used to get (uhhh) the image, or to retrieve (aaaaaaa) it from the cache
     */
    public Color getColorAt(int x, int y, String url) {

        ImageData image = this.getFromUrl(url);
        return image.getColorAt(x, y);

    }

}
