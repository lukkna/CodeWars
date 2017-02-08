public class SquareDigit {
    public int squareDigits(int n) {
        System.out.println("n - " + n);
        //String res = new StringBuilder(String.valueOf(n)).reverse().toString();
        int r = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
        System.out.println("r - " + r);
        String result = "";
        while(r > 10){
            result += (r % 10)*(r % 10);
            r = r / 10;
        }
        //if(r < 10) {
            result += r*r;
            r = r / 10;
      //  }
        if(n % 10 == 0)
            result += 0;
        return Integer.parseInt(result);
    }
}