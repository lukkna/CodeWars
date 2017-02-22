package StopSpinnigMyWords;

public class Words {
    static String spin(String words) {
        if (words == null)
            return "";
        if (words.length() <= 4)
            return words;
        else {
            String[] separatedWords = words.split(" ");
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < separatedWords.length; i++) {

                if (separatedWords[i].length() > 4) {
                    for (int j = separatedWords[i].length() - 1; j >= 0; j--)
                        result.append(separatedWords[i].charAt(j));
                    result.append(" ");
                } else {
                    for (int j = 0; j < separatedWords[i].length(); j++)
                        result.append(separatedWords[i].charAt(j));
                    result.append(" ");
                }
            }
            return result.deleteCharAt(result.length() - 1).toString();
        }
    }
}