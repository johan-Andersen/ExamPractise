package ChatØvelse10ArvPolymorfiFiler;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<MediaItem> list = new ArrayList<>();
        list.add(new Song("sent", 2.02, "rap"));
        list.add(new Song("Remember", 4.30, "Love"));
        list.add(new Podcast("Kurlingklubben", 200, "Comedy"));
        list.add(new Podcast("The Joe Rogan experience", 400, "Different"));

        MediaLibrary mediaLibrary = new MediaLibrary(list);

        System.out.println(mediaLibrary.filterByType("song"));
        mediaLibrary.saveLibrary("filename.txt");


    }
}
