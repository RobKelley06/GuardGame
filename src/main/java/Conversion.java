/**
 * Created by rkelly on 2/25/16.
 */
public class Conversion {
    public char[] convertLongToCharArray(long in) {
        char[] cA = String.valueOf(in).toCharArray();
        return cA;
    }

    public int combineNumbers(char[] cA) {
        int temp = 0;
        for (char z: cA) {
            temp += Character.getNumericValue(z);
        }
        return temp;
    }


    public int shortenNumbers(long input) {
        while (String.valueOf(input).length() > 1) {
            char[] cA = convertLongToCharArray(input);
            input = combineNumbers(cA);
        }
        return (int)input;
    }
}
