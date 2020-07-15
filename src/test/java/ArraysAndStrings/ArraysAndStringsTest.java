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

    @Test
    public void testForPermutationCheckOfTwoStrings(){
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
        String s1 = "word";
        String s2 = "dorw";
        assertTrue(arraysAndStrings.checkForPermutation(s1, s2));

        String s3 = "word";
        String s4 = "door";
        assertFalse(arraysAndStrings.checkForPermutation(s3, s4));

        String s5 = "word";
        String s6 = "dolr";
        assertFalse(arraysAndStrings.checkForPermutation(s5, s6));
    }

    @Test
    public void testForPermutationOfPalindromeCheckOfTwoStrings(){
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
        String s1 = "woow";
        assertTrue(arraysAndStrings.isPermutationOfPalindrome(s1));

        String s2 = "nilli";
        assertTrue(arraysAndStrings.isPermutationOfPalindrome(s2));

        String s4 = "door";
        assertFalse(arraysAndStrings.isPermutationOfPalindrome(s4));

        String s6 = "dolr";
        assertFalse(arraysAndStrings.isPermutationOfPalindrome(s6));
    }
}
