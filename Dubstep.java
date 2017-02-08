/**
 * Created by Lukas on 2017-02-08.
 */
public class Dubstep {
    public static String SongDecoder (String song)
    {
        StringBuilder e = new StringBuilder(song);
        int index = e.indexOf("WUB");
        while (index != -1){
            if (index != 0 && index != -1 && e.charAt(index - 1) != ' '){
                e.insert(index, ' ');
                e.delete(index + 1, index + 4);
            }
            else
                e.delete(index, index + 3);
            index = e.indexOf("WUB");
        }
        return e.toString().replaceAll("\\s+$", "");
    }
}
//public class Dubstep {
//    public static String SongDecoder (String song)
//    {
//        return song.replaceAll("(WUB)+", " ").trim();
//    }
//}