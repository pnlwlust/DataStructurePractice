package main.java.ArraysAndStrings;

public class ArraysAndStrings {

    /**
     * Tests if a string has all uniqueCharecters
     * @param str string to test
     * @return true if all characters unique
     */
    public boolean isUniqueCharacterised(String str){
       if(str == null) return false;
       if(str.length() > 128) return false;

       boolean[] charSet = new boolean[128];

       for(int i=0; i<str.length(); i++){
          int val = str.charAt(i);
           if(charSet[val]) return false;

           charSet[val] = true;
        }

       return true;
    }

    /**
     * Checks if s1 is permutation of s2
     * @param s1
     * @param s2
     * @return
     */
    public boolean checkForPermutation(String s1, String s2){
        if(s1 == null || s2 == null) return false;

        if(s1.length() != s2.length()) return false;

        int[] charSet = new int[128]; // Suppose 128 ASCII

        for(int ch: s1.toCharArray()){
            charSet[ch]++;
        }

        for(int ch: s2.toCharArray()){
            charSet[ch]--;
            if(charSet[ch]<0) return false;
        }

        return true;
    }

    public boolean isPermutationOfPalindrome(String phrase){
        int length = phrase.length();
        if(length == 0) return false;
        if(length == 1) return true;

        int zInt = Character.getNumericValue('z');
        int aInt = Character.getNumericValue('a');
        //Construct hash table for character counts
        int[] hashTable = new int[zInt - aInt + 1];

        for(char ch: phrase.toCharArray()){

            int val = Character.getNumericValue(ch);
            if(val >= aInt && val <= zInt)
                hashTable[ch - 'a']++;
        }
        //Check if number of odd exceeds 1 for odd length phrase
        int oddCount = 0;
        for(int val: hashTable){
            if(val % 2 == 1){
                oddCount++;
            }
        }
        if(length % 2 == 0 && oddCount == 0) return true;
        if(length % 2 == 1 && oddCount == 1) return true;

        return false;
    }
}
