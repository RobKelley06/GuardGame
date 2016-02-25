import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rkelly on 2/25/16.
 */
public class GuardGameTest {

    Conversion convert = new Conversion();

    @Test
    public void testConvertLongToCharArray() {
        long in = 1235;
        char[] cA = {'1','2','3','5'};
        assertEquals("Convert long to char array",String.valueOf(cA),String.valueOf(convert.convertLongToCharArray(in)));
    }
    @Test
    public void testConvertLongToCharArray2() {
        long in = 2345;
        char[] cA = {'2','3','4','5'};
        assertEquals("Convert long to char array",String.valueOf(cA),String.valueOf(convert.convertLongToCharArray(in)));
    }
    @Test
    public void testConvertLongToCharArra3() {
        long in = 832758943;
        char[] cA = {'8','3','2','7','5','8','9','4','3'};
        assertEquals("Convert long to char array",String.valueOf(cA),String.valueOf(convert.convertLongToCharArray(in)));
    }

    @Test
    public void testCombineNumber() {
        char[] cA = {'3','5','2'};
        assertEquals("Check if char array is converted to int(s) and added together.",10,convert.combineNumbers(cA));
    }

    @Test
    public void testCombineNumber2() {
        char[] cA = {'8','3','2','7','5','8','9','4','3'};
        assertEquals("Check if char array is converted to int(s) and added together.",49,convert.combineNumbers(cA));
    }

    @Test
    public void testCombineNumber3() {
        char[] cA = {'1','2','3'};
        assertEquals("Check if char array is converted to int(s) and added together.",6,convert.combineNumbers(cA));
    }

    @Test
    public void testShortenNumbers() {
        long s = 13;
        assertEquals("Loop through string adding all numbers.",4,convert.shortenNumbers(s));
    }
    @Test
    public void testShortenNumbers2() {
        long s = 1235;
        assertEquals("Loop through string adding all numbers.",2,convert.shortenNumbers(s));
    }
    @Test
    public void testShortenNumbers3() {
        long s = 1234323;
        assertEquals("Loop through string adding all numbers.",9,convert.shortenNumbers(s));
    }
}