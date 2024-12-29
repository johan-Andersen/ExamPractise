package Øvelse14Split;

public class Image {

    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height) {
        this.fileName = fileName;
        this.width = width;
        this.height = height;
    }

    public boolean isKnownFileType() {
        /*
        Regex (kort for regular expressions) er et mønster af tekst, der burges til at:

        Søge i tekst - Matche bestemte tekstmønstre - Erstatte dele af en tekst - Validere teksten format (f.eks. email, telefonnummer, postnummer osv.)

        i regex (Som .split() bruger) betyder "." alle tegn. den vil derfor splitte ved alle bogstaver og speciel tegn

        For at skulle bruge et bogstavligt "." skal "escape" ved at skrive "//" foran.
        Andre specieltegn skal også splittes:
        * -> //*
        + -> //+
        ? -> //?
        (,),[,],{,} -> skal alle escapes med //
        | -> //|
        ^ -> //^
        $ -> //$
        // -> ////
         */

        String[] split = fileName.split("\\.");

        String end = split[split.length-1];

        if(end.equalsIgnoreCase("gif") || end.equalsIgnoreCase("jpg") || end.equalsIgnoreCase("jpeg") || end.equalsIgnoreCase("png") || end.equalsIgnoreCase("webp") || end.equalsIgnoreCase("bmp")) {

            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPortrait() {

        if(height > width) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isLandscape() {

        if(height < width) {
            return true;
        }
        else {
            return false;
        }
    }




}
