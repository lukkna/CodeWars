import javax.lang.model.type.NullType;

import static java.lang.Math.*;

/**
 * Created by Lukas on 2017-02-07.
 */
class Diamond {
    public static String print(int n) {
        StringBuffer res = new StringBuffer();
        if(n % 2 == 1 && n >= 1){
            System.out.println(n);
            int m = 1, x = 0;
            while (m > 0){
                for(int i = 0; i < (n - m) / 2; i++)
                    res.append(' ');
                for (int j = 0; j < m; j++)
                    res.append('*');
                res.append("\n");
                if(n == m)
                    x = 1;
                if(n > m && x == 0)
                    m += 2;
                else
                    m -= 2;
            }
        }
        else return null;
        return res.toString();
    }
}