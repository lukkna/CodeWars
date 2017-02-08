/**
 * Created by Lukas on 2017-02-06.
 */
public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        int count = 0;
        if(h <= 0 || bounce >= 1 || bounce <= 0 || window >= h)
            return -1;
        while(h > window){
            count++;
            h *= bounce;
            if(h < window)
                break;
            else
                count++;
        }
        return count;
    }
}