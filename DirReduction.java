import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lukas on 2017-02-06.
 */
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> res = new ArrayList<String>(Arrays.asList(arr));
        int i = 0;
        while(i + 1 < res.size()){
            if((res.get(i) == "NORTH" && res.get(i+1) == "SOUTH") || (res.get(i) == "SOUTH" && res.get(i+1) == "NORTH")){
                res.remove(i + 1);
                res.remove(i);
                i = 0;
            } else if ((res.get(i) == "EAST" && res.get(i+1) == "WEST") || (res.get(i) == "WEST" && res.get(i+1) == "EAST")) {
                res.remove(i + 1);
                res.remove(i);
                i = 0;
            } else i++;

        }
        String[] resArr = new String[res.size()];
    return res.toArray(resArr);
    }
}