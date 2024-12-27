package Øvelse14;

public class Main {

    public static void main(String[] args) {

        Image image = new Image("johanEr.Træt.gif", 1, 1);

        System.out.println(image.isKnownFileType());

        System.out.println(image.isLandscape());

        System.out.println(image.isPortrait());

    }

}

