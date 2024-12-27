package Øvelse18;

import java.io.*;
import java.util.List;

public abstract class Media {

    private String name;
    private double duration;

    public Media(String name, double duration) {

        this.name = name;
        this.duration = duration;

    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public StringBuilder info(List<Media> list) {

        try {
            PrintStream save = new PrintStream(new FileOutputStream("mediainfo.txt", true));

            for(Media m : list) {
                save.println(m);
            }
            save.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(Media m : list) {

            stringBuilder.append(m).append("\n");

        }
        return stringBuilder;
    }





}
