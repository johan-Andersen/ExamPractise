package ChatØvelse10ArvPolymorfiFiler;

import java.io.*;
import java.util.List;

public class MediaLibrary {

    private List<MediaItem> list;

    public MediaLibrary(List<MediaItem> list) {
        this.list = list;
    }

    public String filterByType(String mediaType) {

        StringBuilder song = new StringBuilder();
        StringBuilder podcast = new StringBuilder();

        for(MediaItem m : list) {

            if(m instanceof Song) {
                song.append(m).append("\n");
            }
            else {
                podcast.append(m).append("\n");
            }
        }

        if(mediaType.equalsIgnoreCase("song")) {
            return song.toString();
        } else if(mediaType.equalsIgnoreCase("podcast")) {
            return podcast.toString();
        }
        else {
            return "There is no such media type as: " + mediaType;
        }
    }

    public void saveLibrary(String filename) {

        try {
            PrintStream printStream = new PrintStream(new File(filename));

            for(MediaItem m : list) {
                printStream.println(m);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public StringBuilder loadLibrary(String filename) {



    }



}
