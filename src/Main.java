package work3;

import work3.data.*;

/**
 * A Main class that contains the entry point of the program
 */
public class Main {
    /**
     * The main method that is the main method
     */
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

    /**
     * A method that displays the intended usage of the program and then exits with a non-zero exit code
     */
    private static void usage() {
        System.out.println("Usage: [ real | proxy ]");
        System.exit(1);
    }

    /**
     * A method that announces exiting the program and then exits the program with a non-non-zero exit code
     */
    private static void exit() {
        System.out.println("\r\nExiting the program");
        System.exit(0);
    }
}
