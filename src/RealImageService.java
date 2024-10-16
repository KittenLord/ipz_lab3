package work3;

import work3.data.*;

public class RealImageService implements ImageService {

    public ImageData getFromUrl(String url) {
        System.out.println("SENT REQUEST FOR IMAGE");
        try { Thread.sleep(5000); } catch(Exception e) { /* too bad */ }
        System.out.println("RECEIVED IMAGE");

        return new ImageData();
    }

    public Color getColorAt(int x, int y, String url) {
        ImageData image = getFromUrl(url);
        return image.getColorAt(x, y);
    }

}
