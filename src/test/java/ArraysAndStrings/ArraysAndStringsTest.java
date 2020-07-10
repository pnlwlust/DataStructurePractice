package test.java.ArraysAndStrings;

import main.java.ArraysAndStrings.ArraysAndStrings;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArraysAndStringsTest {

    @Test
    public void testIfAllCharactersInAStringAreUnique(){

        String str = "aword";
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
        assertTrue(arraysAndStrings.isUniqueCharacterised(str));

        String str1 = "abcda";
        assertFalse(arraysAndStrings.isUniqueCharacterised(str1));

        String str2 = "abcdsutvarb";
        assertFalse(arraysAndStrings.isUniqueCharacterised(str2));
    }
}
