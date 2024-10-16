package work3;

import work3.data.*;

public class Main {
    public static void main(String[] args) {

        if(args.length != 1) { usage(); return; } 

        String mode = args[0].trim();
        ImageService service;

        if(mode.equals("proxy"))     { service = new ProxyImageService(); }
        else if(mode.equals("real")) { service = new RealImageService(); }
        else                         { usage(); return; }

        // loop
        while(true) {
            System.out.print("Insert image url: \r\n> ");
            String imageUrl = System.console().readLine();
            if(imageUrl == null) exit();

            ImageData image = service.getFromUrl(imageUrl);
            System.out.println("Downloaded image \"" + imageUrl + "\"");

            Color color = service.getColorAt(0, 0, imageUrl);
            System.out.println("Color of the pixel (0, 0) of this image is \"" + color.getColor() + "\"");

        }
    }

    private static void usage() {
        System.out.println("Usage: [ real | proxy ]");
        System.exit(1);
    }

    private static void exit() {
        System.out.println("\r\nExiting the program");
        System.exit(0);
    }
}
