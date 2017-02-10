package DigitalRoot;

public class DRoot {
    public static int digital_root(int n) {

        return (n != 0 && n % 9 == 0 ? 9 : n % 9) * (int) Math.signum(n);
        //        if (Math.abs(n) > 9){
//            char[] res = ("" + Math.abs(n)).toCharArray();
//            n = 0;
//            int i = 0;
//            while (res.length > 1){
//                if (i == res.length){
//                    res = ("" + n).toCharArray();
//                    i = 0;
//                    n = 0;
//                }
//                n += Character.getNumericValue(res[i++]);
//            }
//        }
//        return Math.abs(n);
    }
}

