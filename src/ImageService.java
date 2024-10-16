package work3;

import work3.data.*;

public interface ImageService {

    public ImageData getFromUrl(String url);

    public Color getColorAt(int x, int y, String url);

}
