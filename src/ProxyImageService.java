package work3;

import work3.data.*;
import java.util.HashMap;

public class ProxyImageService implements ImageService {

    private RealImageService service;
    private HashMap<String, ImageData> cache;

    public ProxyImageService() { service = new RealImageService(); cache = new HashMap<>(); }




    public ImageData getFromUrl(String url) {

        if(cache.containsKey(url)) { return cache.get(url); }

        ImageData image = service.getFromUrl(url);
        cache.put(url, image);
        return image;

    }

    public Color getColorAt(int x, int y, String url) {

        ImageData image = this.getFromUrl(url);
        return image.getColorAt(x, y);

    }

}
